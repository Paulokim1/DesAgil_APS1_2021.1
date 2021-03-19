package br.edu.insper.desagil.vaimalte;

public class Produto {
	private int codigo;
	private String nome;
	private Double preco;
	
	public Produto(int codigo, String nome, Double preco) {
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
	
	public Double getPreco() {
		return this.preco;
	}

}

