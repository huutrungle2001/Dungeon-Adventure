public class Player extends Entity {
    private Inventory inventory;

    public Player() {
        inventory = new Inventory();
    }

    public Player(int x, int y) {
        super(x, y);
        inventory = new Inventory();
    }

    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public Position move() {
        System.out.println("Player move() not implemented yet.");
        return getPosition();
    }

    @Override
    public void triggerScript() {
        System.out.println("Player triggerScript() not implemented yet.");
    }
}
