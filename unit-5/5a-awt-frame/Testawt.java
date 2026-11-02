import java.awt.*;
import java.awt.event.*;

public class Testawt {
    Testawt() {
        Frame fm = new Frame(); // Creating a frame
        Label lb = new Label("welcome to java graphics");
        fm.add(lb); // adding label to the frame
        fm.setSize(300, 300); // setting frame size
        fm.setVisible(true);

        // Added: lets the window's close button work
        fm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        Testawt ta = new Testawt();
    }
}
