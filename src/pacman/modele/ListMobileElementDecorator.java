package pacman.modele;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public abstract class ListMobileElementDecorator implements List<MobileElement> {

    private List<MobileElement> decorated = new ArrayList<>();

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
    public Iterator<MobileElement> iterator() {
        return decorated.iterator();
    }

    @Override
    public Object[] toArray() {
        return decorated.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return decorated.toArray(a);
    }

    @Override
    public boolean add(MobileElement mobileElement) {
        return decorated.add(mobileElement);
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
    public boolean addAll(Collection<? extends MobileElement> c) {
        return decorated.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends MobileElement> c) {
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
    public void replaceAll(UnaryOperator<MobileElement> operator) {
        decorated.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super MobileElement> c) {
        decorated.sort(c);
    }

    @Override
    public void clear() {
        decorated.clear();
    }

    @Override
    public boolean equals(Object o) {
        return decorated.equals(o);
    }

    @Override
    public int hashCode() {
        return decorated.hashCode();
    }

    @Override
    public MobileElement get(int index) {
        return decorated.get(index);
    }

    @Override
    public MobileElement set(int index, MobileElement element) {
        return decorated.set(index, element);
    }

    @Override
    public void add(int index, MobileElement element) {
        decorated.add(index, element);
    }

    @Override
    public MobileElement remove(int index) {
        return decorated.remove(index);
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
    public ListIterator<MobileElement> listIterator() {
        return decorated.listIterator();
    }

    @Override
    public ListIterator<MobileElement> listIterator(int index) {
        return decorated.listIterator(index);
    }

    @Override
    public List<MobileElement> subList(int fromIndex, int toIndex) {
        return decorated.subList(fromIndex, toIndex);
    }

    @Override
    public Spliterator<MobileElement> spliterator() {
        return decorated.spliterator();
    }

    public static <E> List<E> of() {
        return List.of();
    }

    public static <E> List<E> of(E e1) {
        return List.of(e1);
    }

    public static <E> List<E> of(E e1, E e2) {
        return List.of(e1, e2);
    }

    public static <E> List<E> of(E e1, E e2, E e3) {
        return List.of(e1, e2, e3);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4) {
        return List.of(e1, e2, e3, e4);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5) {
        return List.of(e1, e2, e3, e4, e5);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6) {
        return List.of(e1, e2, e3, e4, e5, e6);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
        return List.of(e1, e2, e3, e4, e5, e6, e7);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return List.of(e1, e2, e3, e4, e5, e6, e7, e8);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    @SafeVarargs
    public static <E> List<E> of(E... elements) {
        return List.of(elements);
    }

    public static <E> List<E> copyOf(Collection<? extends E> coll) {
        return List.copyOf(coll);
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return decorated.toArray(generator);
    }

    @Override
    public boolean removeIf(Predicate<? super MobileElement> filter) {
        return decorated.removeIf(filter);
    }

    @Override
    public Stream<MobileElement> stream() {
        return decorated.stream();
    }

    @Override
    public Stream<MobileElement> parallelStream() {
        return decorated.parallelStream();
    }

    @Override
    public void forEach(Consumer<? super MobileElement> action) {
        decorated.forEach(action);
    }
}
