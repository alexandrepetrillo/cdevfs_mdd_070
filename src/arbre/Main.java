package arbre;

public class Main {
    public static void main(String... args) {
        ArbreBinaire a = new ArbreBinaire("a", null, null);
        ArbreBinaire b = new ArbreBinaire("b", null, null);
        ArbreBinaire c = new ArbreBinaire("c", a, b);
        ArbreBinaire x = new ArbreBinaire("x", null,null);
        ArbreBinaire y = new ArbreBinaire("y", null,null);
        ArbreBinaire d = new ArbreBinaire("d", x, y);
        ArbreBinaire e = new ArbreBinaire("e", c, d);

        for (ArbreBinaire arbreBinaire : e) {
            System.out.println(arbreBinaire);
        }
    }
}
