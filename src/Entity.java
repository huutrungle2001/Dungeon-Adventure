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

    public void moveUp() {
        position.setY(position.getY() + 1);
    }

    public void moveDown() {
        position.setY(position.getY() - 1);
    }

    public void moveLeft() {
        position.setX(position.getX() - 1);
    }

    public void moveRight() {
        position.setX(position.getX() + 1);
    }

    public abstract void triggerScript();
}