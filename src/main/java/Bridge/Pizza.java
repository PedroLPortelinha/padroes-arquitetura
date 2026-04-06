package Bridge;

public abstract class Pizza {

    protected Estilo estilo;

    protected Pizza(Estilo estilo) {
        this.estilo = estilo;
    }

    public abstract double getPrecoSabor();

    public double getPrecoFinal() {
        return this.getPrecoSabor() + this.estilo.getPreco();
    }

    public abstract String escolherSaborPizza();
}
