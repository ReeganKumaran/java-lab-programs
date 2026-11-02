public class SingleThreadDemo {
    public static void main(String[] args) {
        System.out.println("Single-threaded execution:");
        NumberPrinter printer = new NumberPrinter("SingleThread", 5);
        printer.run(); // Running on the main thread
    }
}
