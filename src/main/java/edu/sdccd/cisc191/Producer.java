package edu.sdccd.cisc191;

/**
 * Producers creates a number of new Items and sends them to a Warehouse
 *
 * Adapted from Tasha Frankie and Allan Schougaard
 */
public class Producer extends Thread {
    private String name;
    private Warehouse warehouse;
    private int numberOfItemsToProduce;

    public Producer(String givenName, Warehouse givenWarehouse, int givenNumberOfItemsToProduce) {
        name = givenName;
        warehouse = givenWarehouse;
        numberOfItemsToProduce = givenNumberOfItemsToProduce;
    }
    @Override
    public void run()
    {
        System.out.println(name + " running in Thread: " + Thread.currentThread().getName());

        // TODO: produce numberOfItemsToProduce new items
        // Produce numberOfItemsToProduce new items
        for (int i = 0; i < numberOfItemsToProduce; i++) {
            warehouse.receive(new Item());
        }

        System.out.println(name + " ended.");
    }
}