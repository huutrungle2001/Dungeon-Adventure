public class SecretNPC extends NPC {
    public SecretNPC() {
        super();
    }

    public SecretNPC(int x, int y) {
        super(x, y);
    }

    @Override
    public Position move() {
        System.out.println("SecretNPC move() not implemented yet.");
        return getPosition();
    }

    @Override
    public void triggerScript() {
        System.out.println("SecretNPC triggerScript() not implemented yet.");
    }
}
