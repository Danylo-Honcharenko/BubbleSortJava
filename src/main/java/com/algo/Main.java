package com.algo;

public class Main {
    public static void main(String[] args) {
        Bubble bubble = new Bubble(4);
        bubble.insert(20);
        bubble.insert(78);
        bubble.insert(89);
        bubble.insert(34);

        bubble.print();
        bubble.bubbleSorter();
        System.out.println("\n==========");
        bubble.print();
    }
}