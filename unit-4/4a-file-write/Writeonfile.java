import java.io.*;

public class Writeonfile {
    public static void main(String arg[]) throws IOException {
        // opening the file for writing
        // Fixed: the manual used curly quotes, which do not compile
        FileWriter f = new FileWriter("sample.txt");
        // creation of the object for writing
        PrintWriter out = new PrintWriter(f);
        // writing text on the file
        out.println("Welcome to File handling");
        // closing the output channel and the file
        out.close();
        f.close();

        // Added: read sample.txt back and display it, as the exercise title asks
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;
        System.out.println("Contents of sample.txt:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
