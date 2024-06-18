package MultiThreading;
public class ThreadFunction  extends Thread {
		  @Override
		  public void run() {
		    System.out.println("Hello, World!");
		  }
		  public static void main(String[] args) {
		    ThreadFunction  thread = new ThreadFunction();
		    thread.start(); 
	}
}
