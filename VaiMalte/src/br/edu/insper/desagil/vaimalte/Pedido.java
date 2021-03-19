package br.edu.insper.desagil.vaimalte;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public int getQuantidade() {
		return this.quantidade;
	}
	
	public int incrementa() {
		return this.quantidade + 1;
	}
	
	public int total() {
		return this.produto.getPreco() * this.quantidade;
	}


	
	
}
