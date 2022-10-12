public class Inventory {
    private Item[] items;

    public Inventory() {
        items = new Item[0];
    }

    public Inventory(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return items;
    }

    public void triggerItem(int index) {
        try {
            items[index].triggerEvent();
            items[index].triggerScript();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No item at index " + index);
        }
    }
}
