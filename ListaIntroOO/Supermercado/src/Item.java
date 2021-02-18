public class Item {
    Produto produto;
    int qtd;

    float getSubTotal(){
        return produto.preco * qtd;
    }
    
}
