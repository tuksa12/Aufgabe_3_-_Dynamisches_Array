package gad.dynamicarray;

public abstract class Collection {

    public abstract int size();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract void insert(int value);

    public abstract int remove();

}
