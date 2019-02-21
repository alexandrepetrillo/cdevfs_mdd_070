package arbre;

import java.util.Iterator;
import java.util.LinkedList;

public class ArbreBinaireLargeurDAbordIterator implements Iterator<ArbreBinaire> {
    private ArbreBinaire arbreBinaire;
    private LinkedList<ArbreBinaire> file = new LinkedList<>();

    public ArbreBinaireLargeurDAbordIterator(ArbreBinaire arbreBinaire) {
        this.arbreBinaire = arbreBinaire;
        file.addLast(arbreBinaire);
    }

    @Override
    public boolean hasNext() {
        return !file.isEmpty();
    }

    @Override
    public ArbreBinaire next() {
        ArbreBinaire arbreBinaire = file.removeFirst();
        if (arbreBinaire.getGauche() != null)
            file.addLast(arbreBinaire.getGauche());
        if (arbreBinaire.getDroit() != null)
            file.addLast(arbreBinaire.getDroit());
        return arbreBinaire;
    }
}
