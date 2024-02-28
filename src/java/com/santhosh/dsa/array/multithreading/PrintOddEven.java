package com.santhosh.dsa.array.multithreading;

public class PrintOddEven {
    private final int[] arr;
    private final Object lock = new Object();

    public PrintOddEven(int[] arr) {
        this.arr = arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        PrintOddEven poe = new PrintOddEven(arr);
        poe.printOdd();
        poe.printEven();
    }

    private void printEven() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for(int i=0; i<arr.length; i++) {
                        if(i%2 != 0) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        else {
                            System.out.println(arr[i]);
                            lock.notify();
                        }
                    }
                }
            }
        }).start();
    }

    private void printOdd() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for(int i=0; i<arr.length; i++) {
                        if(i%2 == 0) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        else {
                            System.out.println(arr[i]);
                            lock.notify();
                        }
                    }
                }
            }
        }).start();
    }
}
