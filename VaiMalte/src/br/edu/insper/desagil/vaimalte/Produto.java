package br.edu.insper.desagil.vaimalte;

public class Produto {
	private int codigo;
	private String nome;
	private int preco;
	
	public Produto(int codigo, String nome, int preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getPreco() {
		return this.preco;
	}

}

