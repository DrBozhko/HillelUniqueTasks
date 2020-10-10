package solid.dependency_inversion;

public class Computer {
    private Monitor monitor;
    private Mouse mouse;

    public Computer(Monitor monitor, Mouse mouse) {
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
