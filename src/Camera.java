public class Camera extends Item {
    public Camera() {
        super();
    }

    public Camera(String name) {
        super(name);
    }

    @Override
    public void triggerScript() {
        System.out.println("Camera triggerScript() not implemented yet.");
    }

    @Override
    public void triggerEvent() {
        System.out.println("Camera triggerEvent() not implemented yet.");
    }
}
