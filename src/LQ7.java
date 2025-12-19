import java.util.Scanner;

class Rectangle {
    int length, breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area = " + (length * breadth));
    }
}

public class LQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        Rectangle r = new Rectangle(l, b);
        r.area();
    }
}
