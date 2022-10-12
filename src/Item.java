public abstract class Item implements Script, Event {
    private String name;

    public Item() {
        name = "";
    }

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void triggerScript();

    public abstract void triggerEvent();
}
