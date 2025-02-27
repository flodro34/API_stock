package fr.fdr.stock.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqttConfig {

    @Value("${mqtt.broker.url}")
    private String brockerURL;

    @Value("${mqtt.client.id}")
    private String clientId;

    @Value("${mqtt.username}")
    private String username;

    @Value("${mqtt.password}")
    private String password;

    @Bean
    public MqttClient mqttClient() throws MqttException {

        //instanciation du client
        MqttClient mqttClient = new MqttClient(brockerURL, clientId, new MemoryPersistence());

        //argument supplementaire
        MqttConnectOptions options = new MqttConnectOptions();
        options.setUserName(username);
        options.setPassword(password.toCharArray());
        mqttClient.connect(options);

        //callback
        mqttClient.setCallback(new MqttCallback() {

            @Override
            public void connectionLost(Throwable throwable) {
                System.out.println("Connexion perdue : " + throwable.getMessage());
            }

            @Override
            public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
                System.out.println("Message reçu du topic : " + topic);
                String payload = new String(mqttMessage.getPayload());

                //serialiser le message recu en objet java
                ObjectMapper objectMapper = new ObjectMapper();
            }

            @Override
            public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
                System.out.println("Message livré : " + iMqttDeliveryToken.getMessageId());
            }
        });
        mqttClient.subscribe("produit");
        return mqttClient;
    }


}
