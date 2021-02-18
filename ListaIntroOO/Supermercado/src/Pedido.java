public class Pedido {
    Item[] listaItens = new Item[100];
    int qtdItens = 0;
    String pagamento;

    float getTotalCompra(){
        float valor = 0;

        for(int i=0; i < qtdItens; i++){
            valor += listaItens[i].getSubTotal();
        }

        return valor;
    }

    void adicionarItem(Produto novoProduto, int qtdNovoProduto){
        Item novoItem = new Item();
        novoItem.produto = novoProduto;
        novoItem.qtd = qtdNovoProduto;
        listaItens[qtdItens] = novoItem;
        qtdItens++;
    }

    void pagar(String metodoPagamento, float valorPago){
        System.out.printf("O método de pagamento escolhido é: %s.%n", metodoPagamento);
        if(this.getTotalCompra() - valorPago < 0){
            System.out.printf("O troco foi de R$%f.%n", valorPago - this.getTotalCompra());
        }else if(this.getTotalCompra() - valorPago > 0){
            System.out.printf("Faltam R$%f a serem pagos", this.getTotalCompra() - valorPago);
        }else{
            System.out.println("Obrigado pela compra!");
        }
    }
}
