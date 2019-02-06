package window.good;

public class BorderWindow extends WindowDecorator {

    public BorderWindow(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("ajoute border");
    }
}
