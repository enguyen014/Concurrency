package org.example;

public class Main {
    public static void main(String[] args) {
        //do 5 threads at a time
        for (int i = 0; i < 5; i++) {

            MultithreadThing myThing = new MultithreadThing(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
           myThread.isAlive();
//            myThing.start(); //multiple concurrence threads
        }
    }
}