package main;

public abstract class CarrinhoDecorator implements ProdutoObserver {
	CarrinhoDeCompras carrinhoDecorado;
	
	public CarrinhoDecorator(CarrinhoDeCompras carrinho) {
		// TODO Auto-generated constructor stub
		carrinhoDecorado = carrinho;
	}
}
