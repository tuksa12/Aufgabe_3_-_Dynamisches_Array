package gad.dynamicarray;

public class RingQueue extends Collection {
    private DynamicArray array;
    private Result result;

    public RingQueue(int growthFactor, int maxOverhead, Result result) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void insert(int value) {

    }

    @Override
    public int remove() {
        return 0;
    }

    @Override
    public String toString() {
        return array + ", size: " + size(); // + ", from: " + from + " to: " + to;
    }
}