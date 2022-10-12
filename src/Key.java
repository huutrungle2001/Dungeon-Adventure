public class Key extends Item {
    public Key() {
        super();
    }

    public Key(String name) {
        super(name);
    }

    @Override
    public void triggerScript() {
        System.out.println("Key triggerScript() not implemented yet.");
    }

    @Override
    public void triggerEvent() {
        System.out.println("Key triggerEvent() not implemented yet.");
    }
}
