package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        List<ECommerce> lojas = new ArrayList<>();
        lojas.add(new Nike());
        lojas.add(new Adidas());

        int opcao;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Comprar Produto");
            System.out.println("2. Acessar Carrinho de Compras");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    comprarProduto(scanner, carrinho, lojas);
                    break;
                case 2:
                    acessarCarrinho(scanner, carrinho);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void comprarProduto(Scanner scanner, ProdutoObserver carrinho, List<ECommerce> lojas) {
        System.out.println("Escolha uma loja:");
        
        for (int i = 0; i < lojas.size(); i++) {
            System.out.println((i + 1) + ". " + lojas.get(i).get_nome());
        }

        int escolhaLoja = scanner.nextInt();
        if (escolhaLoja > 0 && escolhaLoja <= lojas.size()) {
            ECommerce lojaEscolhida = lojas.get(escolhaLoja - 1);
            List<Produto> produtos = lojaEscolhida.get_Produtos();

            System.out.println("Produtos disponíveis na loja " + lojaEscolhida.get_nome() + ":");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println((i + 1) + ". " + produtos.get(i).nome);
            }

            int produtoEscolhidoIndex = scanner.nextInt();
            if (produtoEscolhidoIndex > 0 && produtoEscolhidoIndex <= produtos.size()) {
                Produto produtoEscolhido = produtos.get(produtoEscolhidoIndex - 1);
                carrinho.Update(produtoEscolhido);
                
                System.out.println(produtoEscolhido.nome + " adicionado ao carrinho!");
            } else {
                System.out.println("Opção inválida!");
            }
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private static void acessarCarrinho(Scanner scanner, CarrinhoDeCompras carrinho) {
        System.out.println("----- CARRINHO DE COMPRAS -----");
        carrinho.mostrarCarrinho();

        System.out.println("Valor total: " + new DescontoDecorator(carrinho).getValorFinalDescontado().toString());
        System.out.println("1. Remover Produto");
        System.out.println("2. Confirmar Compra");
        System.out.println("3. Voltar");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o número do produto a ser removido: ");
                int numProduto = scanner.nextInt();
                carrinho.RemoverProduto(numProduto - 1);
                break;
            case 2:
            	System.out.print("A compra será confirmada!");
                break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}

