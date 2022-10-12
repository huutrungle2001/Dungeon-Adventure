public class Ghost extends NPC {
    public Ghost() {
        super();
    }

    public Ghost(int x, int y) {
        super(x, y);
    }

    @Override
    public Position move() {
        System.out.println("Ghost move() not implemented yet.");
        return getPosition();
    }

    @Override
    public void triggerScript() {
        System.out.println("Ghost triggerScript() not implemented yet.");
    }
}
