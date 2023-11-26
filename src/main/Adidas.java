package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Adidas implements ECommerce {
	List<Produto> produtos = new ArrayList<>(Arrays.asList(
		    new Produto("Tênis", 49.90),
		    new Produto("Camiseta", 59.99),
		    new Produto("Jaqueta", 39.90)
		));
	
	List<AgenteLogistico> provedores = new ArrayList<>(Arrays.asList(
		    new AgenteLogistico("Provedor 1", Arrays.asList("Boleto", "Cartão de débito", "Cartão de crédito")),
		    new AgenteLogistico("Provedor 2", Arrays.asList("Boleto", "Cartão de débito"))
		));
	
	@Override
	public String get_nome() {
		// TODO Auto-generated method stub
		return "Adidas";
	}

	@Override
	public String get_contato() {
		// TODO Auto-generated method stub
		return "adidasemail@gmail.com";
	}

	@Override
	public List<Produto> get_Produtos() {
		// TODO Auto-generated method stub
		return produtos;
	}

	@Override
	public List<AgenteLogistico> get_Provedores() {
		// TODO Auto-generated method stub
		return provedores;
	}

	@Override
	public CarrinhoDeCompras getCarrinhoDeCompras() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Void addToLista() {
		// TODO Auto-generated method stub
		return null;
	}
}
