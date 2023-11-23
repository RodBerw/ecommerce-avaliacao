package main;

import java.util.List;

public interface ECommerce {
	String get_nome();
	String get_contato();
	String get_formaPagamentoEsc();
	List<Produto> get_Produtos();
	List<Provedor> get_Provedores();
}
