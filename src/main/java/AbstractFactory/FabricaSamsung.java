package AbstractFactory;

public class FabricaSamsung implements FabricaAbstrata {
    
    public Mouse criarMouse() {
        return new MouseSamsung();
    }
    
    public Monitor criarMonitor() {
        return new MonitorSamsung();
    }
    
}
