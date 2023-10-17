package com.algo;

public class Bubble {
    private int[] arr;
    private int element;

    public Bubble(final int SIZE) {
        arr = new int[SIZE];
        element = 0;
    }

    public void insert(int value) {
        arr[element] = value;
        element++;
    }

    public void print() {
        for (int i = 0; i < element; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private void toSwap(int first, int second) {
        int provisionally = arr[first];
        arr[first] = arr[second];
        arr[second] = provisionally;
    }

    public void bubbleSorter() {
        for (int i = element - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) toSwap(j, j + 1);
            }
        }
    }
}
