package br.edu.insper.desagil.vaimalte;

public class Testador {
	public boolean testeA() {
		
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		if (caixa.totalCarrinho(carrinho) == 0) {
			return true;
		}
	    return false;
	}

	public boolean testeB() {
		
		Produto produto1 = new Produto(3, "Leite", 9.00);
		Carrinho carrinho = new Carrinho();
		
		carrinho.incrementaLista(produto1);
		
		Caixa caixa = new Caixa();
		
		if (caixa.totalCarrinho(carrinho) == 9) {
			return true;
		}
	    return false;
	}

	public boolean testeC() {
		
		Produto produto1 = new Produto(45, "Carne", 12.00);
		Carrinho carrinho = new Carrinho();
		
		carrinho.incrementaLista(produto1);
		
		Caixa caixa = new Caixa();
		
		caixa.addDesconto(produto1, 20);
		
		if (caixa.totalCarrinho(carrinho) == 9.60) {
			return true;
		}
	    return false;
	    
	}

	public boolean testeD() {
		
		Produto produto1 = new Produto(38, "Detergente", 15.00);
		Produto produto2 = new Produto(23, "Abacate", 8.00);
		Carrinho carrinho = new Carrinho();
		
		carrinho.incrementaLista(produto1);
		carrinho.incrementaLista(produto2);
		carrinho.incrementaLista(produto2);
		
		Caixa caixa = new Caixa();
		
		caixa.addDesconto(produto1, 10);
		
		if (caixa.totalCarrinho(carrinho) == 29.5) {
			return true;
		}
	    return false;
	}

	public boolean testeE() {
	    
		Produto produto1 = new Produto(86, "Coca-cola", 5.00);
		Produto produto2 = new Produto(69, "Chocolate", 18.00);
		Carrinho carrinho = new Carrinho();
		
		carrinho.incrementaLista(produto1);
		carrinho.incrementaLista(produto1);
		carrinho.incrementaLista(produto2);
		
		Caixa caixa = new Caixa();
		
		caixa.addDesconto(produto1, 5);
		
		if (caixa.totalCarrinho(carrinho) == 27.5) {
			return true;
		}
	    return false;
	}
}
