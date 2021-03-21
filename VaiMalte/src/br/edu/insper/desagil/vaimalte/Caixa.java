package br.edu.insper.desagil.vaimalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> dicDescontos;
	
	public Caixa() {
		this.dicDescontos = new HashMap<>();
	}
	
	public Map<Integer, Integer> addDesconto(Produto produto, Integer desconto){
		
		Integer codProduto = produto.getCodigo();
		
		if (desconto >= 1 && desconto <= 99) {
			this.dicDescontos.put(codProduto, desconto);
			return this.dicDescontos;
		}
		return null;
	}
	
	public Double totalCarrinho(Carrinho carrinho) {
		
		Double valorTotal = (double) 0;
		
		for (Pedido pedido: carrinho.getListaPedidos()) {
			
			Integer codigo = pedido.getProduto().getCodigo();
			Double preco = pedido.getProduto().getPreco();
			Integer quantidade = pedido.getQuantidade();
			
			if (this.dicDescontos.containsKey(codigo)) {
				
				Integer desconto = this.dicDescontos.get(codigo);
				
				Double valorPedidoDesc = (double) (preco * quantidade * ((100.00 - desconto)/100.00));

				valorTotal = valorTotal + valorPedidoDesc;
				
			} else {
				
				valorTotal = valorTotal + pedido.total();
			}
		}
		
		return valorTotal;
	}
	
}
