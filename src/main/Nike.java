package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nike implements ECommerce {
	List<Produto> produtos = new ArrayList<>(Arrays.asList(
		    new Produto("Tênis", 99.90),
		    new Produto("Camiseta", 39.99),
		    new Produto("Bola", 99.90),
		    new Produto("Jaqueta", 89.90)
		));
	
	List<AgenteLogistico> provedores = new ArrayList<>(Arrays.asList(
		    new AgenteLogistico("Provedor 1", Arrays.asList("Boleto", "Cartão de débito", "Cartão de crédito")),
		    new AgenteLogistico("Provedor 2", Arrays.asList("Boleto", "Cartão de débito"))
		));
	
	@Override
	public String get_nome() {
		// TODO Auto-generated method stub
		return "Nike";
	}

	@Override
	public String get_contato() {
		// TODO Auto-generated method stub
		return "nikeemail@gmail.com";
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
