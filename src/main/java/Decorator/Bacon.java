package Decorator;

public class Bacon extends LancheDecorator {
    public Bacon(Lanche lanche) {
        super(lanche);
    }

    public float getPercentualAcrescimo() {
        return 10.0f;
    }

    public String getNomeIngrediente() {
        return "Bacon";
    }
}
