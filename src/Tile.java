public class Tile implements Script {
    private Position position;
    private int direction[];

    public Tile() {
        position = new Position();
        direction = new int[4];
    }

    public Tile(int x, int y) {
        position = new Position(x, y);
        direction = new int[4];
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

    public int[] getDirection() {
        return direction;
    }

    public void setDirection(int[] direction) {
        this.direction = direction;
    }

    public void setDirection(int index, int value) {
        direction[index] = value;
    }

    @Override
    public void triggerScript() {
        System.out.println("Tile triggerScript() not implemented yet.");
    }

    public void specialEvent() {
        System.out.println("Tile specialEvent() not implemented yet.");
    }
}
