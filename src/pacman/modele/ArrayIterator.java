package pacman.modele;

import java.util.Iterator;

public class ArrayIterator implements Iterator<String> {

    private String[] elements;
    private int pointeur = 0;

    public ArrayIterator(String[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return pointeur < elements.length;
    }

    @Override
    public String next() {
        String element = elements[pointeur];
        pointeur++;
        return element;
    }

}
