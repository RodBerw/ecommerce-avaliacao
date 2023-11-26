# ecommerce-avaliacao
Repositório destinado à avaliação da matéria de Padrões de Projetos

**Aluno: Rodolfo Berwanger Liberado**



![diagrama_de_classes](https://github.com/RodBerw/ecommerce-avaliacao/assets/83656054/e057e1e4-ea41-4929-919a-7b7195111dd4)

.


**Indicação dos padrões de projeto:**


**Injeção de dependências**

Foi utilizado através da interface **ECommerce**, sendo esta implementada nas classes **Adidas** e **Nike**.


**Observer**

Foram utilizados **observers** em **AgenteObserver** e **ProdutoObserver** para os métodos de **Update** das classes **AgenteLogistico** e **CarrinhoDeCompras**, onde ambos possuiam as funções como forma de monitoramente de atualização para notificar as classes em questão das mudanças.


**Decorator**

Foi utilizado o conceito de **Decorator** para a implementação de um sistema de desconto no valor final do carrinho através do **DescontoDecorator**, chamada como decoração da classe **CarrinhoDeCompras** na hora de informar o valor final do pedido ao usuário.




