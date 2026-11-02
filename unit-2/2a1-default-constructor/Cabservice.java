import java.util.Scanner;

class Cabservice {
    String taxino, name;
    int d, amt;

    Cabservice() {
        taxino = " ";
        name = " ";
        d = 0;
        amt = 0;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter taxi number: ");
        taxino = in.nextLine();
        System.out.print("Enter name of the passenger: ");
        name = in.nextLine();
        System.out.print("Enter distance travelled: ");
        d = in.nextInt();
    }

    void calculate() {
        if (d <= 1)
            amt = 25;
        if (d > 1 && d <= 5)
            amt = d * 30;
        if (d > 5 && d <= 10)
            amt = d * 35;
        if (d > 10 && d <= 20)
            amt = d * 40;
        if (d > 20)
            amt = d * 45;
    }

    void display() {
        System.out.println("Taxi No" + "\t" + "Name" + "\t\t" + "Distance(km)" + "\t" + "Bill Amount(Rs.)");
        System.out.println(taxino + "\t" + name + "\t\t" + d + "\t\t" + amt);
    }

    public static void main(String args[]) {
        Cabservice ob = new Cabservice();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
