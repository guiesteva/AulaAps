package Builder;

import org.junit.jupiter.api.Test;

public class Teste {
	
	@Test
	void venda1() {
		Produto smartphone = new Produto("Samsung", 999.00);
		Produto Headset = new Produto("Sony", 59.90);
		Venda venda1 = new VendaBuilder().Data("12/03/2020").ClientePj("Pedro", "156-345-123").item(5, smartphone).item(3, Headset).Build();

	}

	@Test
	void venda2() {
		Produto Feijao = new Produto("Feijao", 3.50);
		Produto Arroz = new Produto("Arroz", 2.50);
		Produto Macarrao = new Produto("Macarrao", 1.95);
		Venda venda2 = new VendaBuilder().Data("13/03/2020").ClientePf("Guilherme", "130.452.465.33").item(15, Feijao).item(25, Arroz).item(10, Macarrao).Build();
	}
}
