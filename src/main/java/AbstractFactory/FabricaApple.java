package AbstractFactory;

public class FabricaApple implements FabricaAbstrata {
    
    public Mouse criarMouse() {
        return new MouseApple();
    }
    
    public Monitor criarMonitor() {
        return new MonitorApple();
    }
    
}
