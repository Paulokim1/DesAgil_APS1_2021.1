package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> lista_pedidos;
	
	public Carrinho() {
		this.lista_pedidos = new ArrayList<>();
	}

	public List<Pedido> getLista_pedidos() {
		return this.lista_pedidos;
	}
	
	public List<Pedido> incrementa_lista(Produto produto){
		for (Pedido pedido : this.lista_pedidos) {
			if (pedido.getProduto() == produto) {
				pedido.incrementa();
				return this.lista_pedidos;
			}
		}
		Pedido pedido_novo = new Pedido(produto);
		this.lista_pedidos.add(pedido_novo);
		return this.lista_pedidos;	
	}
}
