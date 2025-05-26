package Thread;

public class MultiThreadLearning implements Runnable {
  public static void main(String[] args) {
    System.out.println("Thread Name: " + Thread.currentThread().getName());
    MultiThreadLearning running = new MultiThreadLearning();
    Thread thread = new Thread(running);
    thread.start();
  }

  @Override
  public void run() {
    System.out.println("runnable thread: " + Thread.currentThread().getName());
  }
}