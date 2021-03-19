package br.edu.insper.desagil.vaimalte;

public class Testador {
	public boolean testeA() {
		
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		if (caixa.total_carrinho(carrinho) == 0) {
			return true;
		}
	    return false;
	}

	public boolean testeB() {
		
		Produto produto_1 = new Produto(3, "Leite", 9.00);
		Carrinho carrinho = new Carrinho();
		
		carrinho.incrementaLista(produto_1);
		
		Caixa caixa = new Caixa();
		
		if (caixa.total_carrinho(carrinho) == 9) {
			return true;
		}
	    return false;
	}

	public boolean testeC() {
		
		Produto produto_1 = new Produto(45, "Carne", 60.00);
		Carrinho carrinho = new Carrinho();
		
		carrinho.incrementaLista(produto_1);
		
		Caixa caixa = new Caixa();
		
		caixa.add_desconto(produto_1, 12);
		
		if (caixa.total_carrinho(carrinho) == 52.8) {
			return true;
		}
	    return false;
	    
	}

	public boolean testeD() {
		
		Produto produto_1 = new Produto(38, "Detergente", 15.00);
		Produto produto_2 = new Produto(23, "Abacate", 8.00);
		Carrinho carrinho = new Carrinho();
		
		carrinho.incrementaLista(produto_1);
		carrinho.incrementaLista(produto_2);
		carrinho.incrementaLista(produto_2);
		
		Caixa caixa = new Caixa();
		
		caixa.add_desconto(produto_1, 10);
		
		if (caixa.total_carrinho(carrinho) == 29.5) {
			return true;
		}
	    return false;
	}

	public boolean testeE() {
	    
		Produto produto_1 = new Produto(86, "Coca-cola", 5.00);
		Produto produto_2 = new Produto(69, "Chocolate", 18.00);
		Carrinho carrinho = new Carrinho();
		
		carrinho.incrementaLista(produto_1);
		carrinho.incrementaLista(produto_1);
		carrinho.incrementaLista(produto_2);
		
		Caixa caixa = new Caixa();
		
		caixa.add_desconto(produto_1, 5);
		
		if (caixa.total_carrinho(carrinho) == 27.5) {
			return true;
		}
	    return false;
	}
}
