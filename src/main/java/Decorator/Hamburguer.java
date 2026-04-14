package Decorator;

public class Hamburguer implements Lanche {
    public float preco;

    public Hamburguer() {
    }

    public Hamburguer(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return "Hambúrguer";
    }
}
