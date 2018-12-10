package com.shan.sample.reference;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ThreadLauncher
{

  public static void main(String args[])
  {
    ExecutorService service = Executors.newFixedThreadPool(10);
    
    // First way 
//    IntStream.range(0, 100).forEach(i -> service.submit(new Task(i)));
    
    // Second way
//    for (int i =0; i < 100; i++) {
//        final int fi = i;
//        service.submit(() -> System.out.println("Task ID : " + fi +" performed by "
//                                              + Thread.currentThread().getName()));
//    }
    
    // Third way
    IntStream.range(0, 100).forEach(i -> service.submit(() -> System.out.println("Task ID : " + i + " performed by "
            + Thread.currentThread().getName())));
    
  }
}


// the following Task class only needed for the First way to be executed.....
/*final class Task
    implements Runnable
{
  private int taskId;

  public Task(int id)
  {
    this.taskId = id;
  }

  @Override
  public void run()
  {
    System.out.println("Task ID : " + this.taskId + " performed by "
        + Thread.currentThread().getName());
  }
}*/
