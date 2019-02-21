package arbre;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ArbreBinaireProfondeurDAbordIterator implements Iterator<ArbreBinaire> {
    private ArbreBinaire arbreBinaire;
    private Stack<ArbreBinaire> stack = new Stack<>();

    public ArbreBinaireProfondeurDAbordIterator(ArbreBinaire arbreBinaire) {
        this.arbreBinaire = arbreBinaire;
        stack.push(arbreBinaire);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public ArbreBinaire next() {
        ArbreBinaire arbreBinaire = stack.pop();
        if (arbreBinaire.getDroit() != null)
            stack.push(arbreBinaire.getDroit());
        if (arbreBinaire.getGauche() != null)
            stack.push(arbreBinaire.getGauche());
        return arbreBinaire;
    }
}
