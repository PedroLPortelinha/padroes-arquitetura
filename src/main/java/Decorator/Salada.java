package Decorator;

public class Salada extends LancheDecorator {
    public Salada(Lanche lanche) {
        super(lanche);
    }

    public float getPercentualAcrescimo() {
        return 5.0f;
    }

    public String getNomeIngrediente() {
        return "Salada";
    }
}
