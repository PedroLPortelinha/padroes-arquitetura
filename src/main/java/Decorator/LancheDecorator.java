package Decorator;

public abstract class LancheDecorator implements Lanche {
    private Lanche lanche;
    public String descricao;

    public LancheDecorator(Lanche lanche) {
        this.lanche = lanche;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public abstract float getPercentualAcrescimo();

    public float getPreco() {
        return this.lanche.getPreco() * (1 + (this.getPercentualAcrescimo() / 100));
    }

    public abstract String getNomeIngrediente();

    public String getDescricao() {
        return this.lanche.getDescricao() + " + " + this.getNomeIngrediente();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
