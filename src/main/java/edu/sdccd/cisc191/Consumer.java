package edu.sdccd.cisc191;

/**
 * Consumers receive a number of Items from a Warehouse
 *
 * Adapted from Tasha Frankie and Allan Schougaard
 */
public class Consumer extends Thread
{
    private String name;
    private Warehouse warehouse;
    private int numberOfItemsToConsume;

    public Consumer(String givenName, Warehouse givenWarehouse, int givenNumberOfItemsToConsume)
    {
        name = givenName;
        warehouse = givenWarehouse;
        numberOfItemsToConsume = givenNumberOfItemsToConsume;
    }


    @Override
    public void run()
    {
        System.out.println(name + " running in Thread: " + Thread.currentThread().getName());

        //TODO: consume numberOfItemsToProduce items
        for (int i = 0; i < numberOfItemsToConsume; i++) {
            System.out.println(i + " from thread ");
            try {
              // Thread.sleep(100); //sleep at 1000 millis second
                warehouse.ship();
           // } catch (InterruptedException e) {
            //   throw new RuntimeException(e);
            } catch (OutOfStockException e) {
                throw new RuntimeException(e);
            }
        }


        System.out.println(name + " ended.");
    }

}