package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> listaPedidos;
	
	public Carrinho() {
		this.listaPedidos = new ArrayList<>();
	}

	public List<Pedido> getListaPedidos() {
		return this.listaPedidos;
	}
	
	public void incrementaLista(Produto produto){
		for (Pedido pedido : this.listaPedidos) {
			if (pedido.getProduto().getCodigo() == produto.getCodigo()) {
				pedido.incrementa();
				return;
			}
		}
		Pedido pedidoNovo = new Pedido(produto);
		this.listaPedidos.add(pedidoNovo);
	}
}


