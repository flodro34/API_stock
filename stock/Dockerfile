#telechargement de maven afin de construire l'app
FROM maven:3.9.7-eclipse-temurin-21 AS build

#creer un dossier
WORKDIR /app

#copie du projet
COPY . .

# telechargement des dependances et compil
RUN mvn clean package

#utilisation d'un JRE pour executer le code
FROM eclipe-temurin:21-jre-jammy

WORKDIR /app

COPY --from=build /app/target/*.war app.war

EXPOSE 8081

#commande qui sera execute lors du lancement du projet
ENTRYPOINT ["java -jar app.war"]