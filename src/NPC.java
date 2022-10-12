public abstract class NPC extends Entity {
    public NPC() {
        super();
    }

    public NPC(int x, int y) {
        super(x, y);
    }

    @Override
    public abstract Position move();

    @Override
    public abstract void triggerScript();
}
