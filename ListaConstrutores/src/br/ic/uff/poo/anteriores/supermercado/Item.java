package br.ic.uff.poo.anteriores.supermercado;

public class Item {
    private Produto produto;
    private int qtd;

    Item(Produto produto, int qtd){
        this.produto = produto;
        this.qtd = qtd;
    }

    public float getSubTotal(){
        return produto.getPreco() * qtd;
    }
}
