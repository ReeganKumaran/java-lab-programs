public class MultiThreadDemo {
    public static void main(String[] args) {
        System.out.println("Multi-threaded execution:");
        NumberPrinter printer1 = new NumberPrinter("Thread-1", 5);
        NumberPrinter printer2 = new NumberPrinter("Thread-2", 5);
        Thread thread1 = new Thread(printer1);
        Thread thread2 = new Thread(printer2);
        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }
}
