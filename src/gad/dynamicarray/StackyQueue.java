package gad.dynamicarray;

public class StackyQueue extends Collection {
    private DynamicStack first;
    private DynamicStack second;

    public StackyQueue(int growthFactor, int maxOverhead, Result result1, Result result2) {

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
        return first + ", " + second;
    }
}