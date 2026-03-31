public class Pepperoni extends Pizza {
    
    public Pepperoni(Estilo estilo) {
        super(estilo);
    }

    public double getPrecoSabor() {
        return 23.0;
    }

    public String escolherSaborPizza() {
        return "Pepperoni";
    }
}
