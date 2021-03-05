package br.ic.uff.poo.anteriores.supermercado;

public class Pedido {
    private Item[] listaItens = new Item[100];
    private int qtdItens = 0;
    private String pagamento;

    public float getTotalCompra(){
        float valor = 0;

        for(int i=0; i < qtdItens; i++){
            valor += this.listaItens[i].getSubTotal();
        }

        return valor;
    }

    public void adicionarItem(Produto novoProduto, int qtdNovoProduto){
        Item novoItem = new Item(novoProduto, qtdNovoProduto);
        this.listaItens[qtdItens] = novoItem;
        this.qtdItens++;
    }

    public void pagar(String metodoPagamento, float valorPago){
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
