package gad.dynamicarray;

import java.util.Arrays;

public class DynamicArray {
    private int[] elements;
    private int currentSize;
    private int growthFactor;
    int maxOverhead;

    public DynamicArray(int growthFactor, int maxOverhead) {

        if(growthFactor < 2 || maxOverhead < 1){
            throw new IllegalArgumentException();
        } else{
            currentSize = 4;
            elements = new int[currentSize];
            this.growthFactor = growthFactor;
            this.maxOverhead = maxOverhead;
        }
    }

    public int getLength() {
        return elements.length;
    }

    public Interval reportUsage(Interval usage, int minSize) {
        if(minSize > currentSize){
            int secondArray[] = new int[currentSize * growthFactor];
            for (int i = 0; i < currentSize; i++) {
                secondArray[i] = elements[i];
            }
            elements = secondArray;
        } else if(minSize < currentSize){
            int secondArray[] = new int[currentSize / growthFactor];
            for (int i = 0; i < secondArray.length; i++) {
                secondArray[i] = elements[i];
            }
        }
        return usage;
    }

    public int get(int index) {
        return elements[index];
    }

    public void set(int index, int value) {
        elements[index] = value;
    }

    public void reportArray(Result result) {
        result.logArray(elements);
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}