package window.good;

public class Main {
    public static void main(String... args) {
        Window simpleWindow = new SimpleWindow();
        simpleWindow.draw();

        System.out.println("=====================");
        Window dualScrollBorderWindow = new HorizontalecrollBarWindow(
                new VerticalScrollBarWindow(
                        new BorderWindow(
                                new SimpleWindow())));

        dualScrollBorderWindow.draw();
    }

    HorizontalecrollBarWindow horizontalecrollBarWindow = new HorizontalecrollBarWindow(
            new SimpleWindow());
}
