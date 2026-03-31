public class Calabresa extends Pizza {

    public Calabresa(Estilo estilo) {
        super(estilo);
    }

    public double getPrecoSabor() {
        return 15.0;
    }

    public String escolherSaborPizza() {
        return "Calabresa";
    }
    
}
