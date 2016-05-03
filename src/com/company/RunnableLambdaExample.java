package com.company;

/**
 * Created by Nilesh on 5/3/2016.
 */
public class RunnableLambdaExample  {

    public static void main(String[] args ) throws InterruptedException {

        Runnable runnableLambda = () -> {
            for (int i = 0; i < 3; ++i) {
                System.out.println("Hello World from Thread [" +
                        Thread.currentThread().getName() + " ]");
            }
        };

        Thread t = new Thread(runnableLambda);
        t.start();
        t.join();
    }
}
