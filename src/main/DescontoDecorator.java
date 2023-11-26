package main;

public class DescontoDecorator extends CarrinhoDecorator {

	  private CarrinhoDeCompras carrinho;
	  private Double desconto = 10.0;

	  public DescontoDecorator(CarrinhoDeCompras carrinho) {
	    super(carrinho);
	  }

	  @Override
	  public void Update(Produto produto) {
	    return;
	  }

	  public Double getValorFinalDescontado() {
	    return carrinhoDecorado.valorTotal * (100 - desconto)/100;
	  }
	}
