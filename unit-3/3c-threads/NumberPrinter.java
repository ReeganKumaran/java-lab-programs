public class NumberPrinter implements Runnable {
    private String name;
    private int maxNumber;

    public NumberPrinter(String name, int maxNumber) {
        this.name = name;
        this.maxNumber = maxNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= maxNumber; i++) {
            System.out.println(name + " prints: " + i);
            try {
                // Small delay to show the difference between single and multi-threading
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
            }
        }
    }
}
