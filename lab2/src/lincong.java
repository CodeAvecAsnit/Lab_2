import java.util.Scanner;
class LinearCongruence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        int result = solveLinearCongruence(a, b, m);

        if (result == -1) {
            System.out.println("No solution exists for the given congruence.");
        } else {
            System.out.println("The solution to " + a + "x ≡ " + b + " (mod " + m + ") is x ≡ " + result + " (mod " + m + ").");
        }

        scanner.close();
    }

    public static int solveLinearCongruence(int a, int b, int m) {
        int gcd = extendedGCD(a, m);

        if (b % gcd != 0) {
            return -1;
        } else {
            int x0 = 0;
            int y0 = 1;
            int x1 = 1;
            int y1 = 0;
            int q, r, x, y;

            while (a % m != 0) {
                q = a / m;
                r = a % m;
                x = x0 - q * x1;
                y = y0 - q * y1;
                x0 = x1;
                y0 = y1;
                x1 = x;
                y1 = y;
                a = m;
                m = r;
            }

            if (x0 < 0) {
                x0 += m;
            }

            return x0;
        }
    }

    static int extendedGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        int gcd = extendedGCD(b % a, a);
        return gcd;
    }
}




