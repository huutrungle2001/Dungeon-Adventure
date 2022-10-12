public abstract class Entity implements Movement, Script {
    private Position position;

    public Entity() {
        position = new Position();
    }

    public Entity(int x, int y) {
        position = new Position(x, y);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setPosition(int x, int y) {
        position.setXY(x, y);
    }

    public abstract Position move();
    public abstract void triggerScript();
}