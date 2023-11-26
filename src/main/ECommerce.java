package main;

import java.util.List;

public interface ECommerce {
	String get_nome();
	String get_contato();
	List<Produto> get_Produtos();
	List<AgenteLogistico> get_Provedores();
	CarrinhoDeCompras getCarrinhoDeCompras();
	Void addToLista();
}
