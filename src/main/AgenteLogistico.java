package main;

import java.util.ArrayList;
import java.util.List;

public class AgenteLogistico implements AgenteObserver {
	String nome;
	List<String> formasPagamentoDisp = new ArrayList<String>();
	
	public AgenteLogistico(String nome, List<String> formasPagamento) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.formasPagamentoDisp = formasPagamento;
	}

	@Override
	public void Update(CarrinhoDeCompras carrinho, Boolean confirmada) {
		if(confirmada) {
			System.out.println("ATENÇÃO: Compra confirmada dos seguintes itens:");
			for (Produto produto : carrinho.itensSelecionados) {
				System.out.println("- " + produto);
			}
		}else {
			System.out.println("ATENÇÃO: Compra cancelada");
		}
		
	}
	
}
