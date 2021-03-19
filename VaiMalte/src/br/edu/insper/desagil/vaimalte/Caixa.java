package br.edu.insper.desagil.vaimalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer, Integer> dic_descontos;
	
	public Caixa() {
		this.dic_descontos = new HashMap<>();
	}
	
	public Map<Integer, Integer> add_desconto(Produto produto, Integer desconto){
		
		Integer cod_produto = produto.getCodigo();
		
		if (desconto >= 1 && desconto <= 99) {
			this.dic_descontos.put(cod_produto, desconto);
			return this.dic_descontos;
		}
		return null;
	}
	
	public Double total_carrinho(Carrinho carrinho) {
		
		Double valor_total = (double) 0;
		
		for (Pedido pedido: carrinho.getLista_pedidos()) {
			
			Integer codigo = pedido.getProduto().getCodigo();
			Double preco = pedido.getProduto().getPreco();
			Integer quantidade = pedido.getQuantidade();
			
			if (this.dic_descontos.containsKey(codigo)) {
				
				Integer desconto = this.dic_descontos.get(codigo);
				
				Double valor_pedido_desc = (double) (preco * quantidade * ((100.00 - desconto)/100.00));

				valor_total = valor_total + valor_pedido_desc;
				
			} else {
				
				valor_total = valor_total + pedido.total();
			}
		}
		
		return valor_total;
	}
	
}
