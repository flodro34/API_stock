package fr.fdr.stock;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.fdr.stock.controller.ProduitController;
import fr.fdr.stock.pojo.Produit;
import fr.fdr.stock.service.ProduitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProduitController.class)
class StockApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockitoBean
	private ProduitService produitService;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void testGetProduits() throws Exception {
		mockMvc.perform(get("/api/produit"))
				.andExpect(status().isOk());
	}


	@Test
	public void createProduit() throws Exception {
		Produit monProduit = new Produit("stylo","c'est un beau stylo",
				1.2F,5);
		mockMvc.perform(post("/api/produit")
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(monProduit)))
				.andExpect(status().isOk());
	}

}
