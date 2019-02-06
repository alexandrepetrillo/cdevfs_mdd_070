package window.good;

public abstract class WindowDecorator implements Window {

    private Window decorated;

    public WindowDecorator(Window window) {
        decorated = window;
    }

    @Override
    public void draw() {
        decorated.draw();
    }
}
