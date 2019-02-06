package window.good;

public class HorizontalecrollBarWindow extends WindowDecorator {
    public HorizontalecrollBarWindow(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("ajoute scroll bar horizontale");
    }
}
