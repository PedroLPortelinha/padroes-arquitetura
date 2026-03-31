public class Portuguesa extends Pizza {
    
    public Portuguesa(Estilo estilo) {
        super(estilo);
    }

    public double getPrecoSabor() {
        return 20.0;
    }

    public String escolherSaborPizza() {
        return "Portuguesa";
    }
}
