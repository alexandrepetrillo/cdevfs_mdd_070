package pacman.modele;

import java.util.*;

public class ListDecorator<T> implements List<T> {

    private List<T> decorated = new ArrayList<>();

    @Override
    public int size() {
        return decorated.size();
    }

    @Override
    public boolean isEmpty() {
        return decorated.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return decorated.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return decorated.iterator();
    }

    @Override
    public boolean add(T e) {
        return decorated.add(e);
    }

    @Override
    public void clear() {
        decorated.clear();
    }

    @Override
    public T get(int index) {
        return decorated.get(index);
    }

    @Override
    public T set(int index, T element) {
        return decorated.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        decorated.add(index, element);
    }

    @Override
    public T remove(int index) {
        return decorated.remove(index);
    }

    @Override
    public Object[] toArray() {
        return decorated.toArray();
    }

    @Override
    public <T> T[] toArray(T[] arg0) {
        return decorated.toArray(arg0);
    }

    @Override
    public boolean remove(Object o) {
        return decorated.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return decorated.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return decorated.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return decorated.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return decorated.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return decorated.retainAll(c);
    }

    @Override
    public int indexOf(Object o) {
        return decorated.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return decorated.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return decorated.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return decorated.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return decorated.subList(fromIndex, toIndex);
    }

}
