public class Hammer extends Item {
    public Hammer() {
        super();
    }

    public Hammer(String name) {
        super(name);
    }

    @Override
    public void triggerScript() {
        System.out.println("Hammer triggerScript() not implemented yet.");
    }

    @Override
    public void triggerEvent() {
        System.out.println("Hammer triggerEvent() not implemented yet.");
    }
}
