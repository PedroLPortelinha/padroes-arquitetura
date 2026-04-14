package Decorator;

public class Queijo extends LancheDecorator {
    public Queijo(Lanche lanche) {
        super(lanche);
    }

    public float getPercentualAcrescimo() {
        return 20.0f;
    }

    public String getNomeIngrediente() {
        return "Queijo";
    }
}
