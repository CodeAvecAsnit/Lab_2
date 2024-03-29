import java.util.Scanner;
class GCDWithCoefficients {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, a, b, d;
        int s1 = 0, s2 = 1, t1 = 1, t2 = 0;

        System.out.print("Enter x: ");
        x = scanner.nextInt();
        System.out.print("Enter y: ");
        y = scanner.nextInt();

        a = x;
        b = y;
        int q, r, s, t;
        while (b != 0) {
            q = a / b;
            r = a % b;
            s = s2 - q * s1;
            t = t2 - q * t1;
            a = b;
            b = r;
            s2 = s1;
            s1 = s;
            t2 = t1;
            t1 = t;
        }
        d = a;
        s = s2;
        t = t2;
        System.out.printf("G.C.D (%d,%d) is %d with coefficients %d and %d respectively.\n", x, y, d, s, t);

        scanner.close();
    }
}
