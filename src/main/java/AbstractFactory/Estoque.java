package AbstractFactory;

public class Estoque {
    
    private Mouse mouse;
    private Monitor monitor;

    public Estoque(FabricaAbstrata fabrica) {
        this.mouse = fabrica.criarMouse();
        this.monitor = fabrica.criarMonitor();
    }

    public void exibirEstoque() {
        System.out.println(mouse.criar());
        System.out.println(monitor.criar());
    }
}
