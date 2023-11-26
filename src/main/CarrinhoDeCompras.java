package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CarrinhoDeCompras implements ProdutoObserver {
	
	ECommerce ecommercaAtual;
	public List<Produto> itensSelecionados = new ArrayList<>();
	List<ECommerce> observadores = new ArrayList<>();
	

	@Override
	public void Update(Produto produto) {
		itensSelecionados.add(produto);
	}
	
	public void RemoverProduto(Integer num) {
		itensSelecionados.remove(num);
	}
	
	  public void mostrarCarrinho() {
	  if (itensSelecionados.isEmpty()) {
	      System.out.println("Carrinho vazio!");
	  } else {
	      System.out.println("Produtos no Carrinho:");
	      for (int i = 0; i < itensSelecionados.size(); i++) {
	          System.out.println((i + 1) + ". " + itensSelecionados.get(i).nome);
	      }
	  }
	}
	  

}
