package window.good;

public class VerticalScrollBarWindow extends WindowDecorator {

    public VerticalScrollBarWindow(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("ajoute scroll bar verticale");
    }
}
