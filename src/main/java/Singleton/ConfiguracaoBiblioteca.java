package padroescriacao.singleton;

public class ConfiguracaoBiblioteca {

    private ConfiguracaoBiblioteca() {};
    private static ConfiguracaoBiblioteca instance = new ConfiguracaoBiblioteca();
    public static ConfiguracaoBiblioteca getInstance() {
        return instance;
    }

    private String nomeBiblioteca;
    private String bibliotecarioResponsavel;
    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getBibliotecarioResponsavel() {
        return bibliotecarioResponsavel;
    }

    public void setBibliotecarioResponsavel(String bibliotecarioResponsavel) {
        this.bibliotecarioResponsavel = bibliotecarioResponsavel;
    }
}