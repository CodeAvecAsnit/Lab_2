import java.util.Scanner;

 class CRTSolver {
    static int inv(int a, int b) {
        int s1 = 0, s2 = 1, t1 = 1, t2 = 0;
        int q, r, s, t;
        while (b != 0) {
            q = a / b;
            r = a % b;
            s = s2 - (q * s1);
            t = t2 - (q * t1);
            a = b;
            b = r;
            s2 = s1;
            s1 = s;
            t2 = t1;
            t1 = t;
        }
        return s2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 10;
        int[] a = new int[max];
        int[] m = new int[max];
        int[] mx = new int[max];
        int[] s = new int[max];
        int n, M = 1;
        char dec;


            System.out.print("No of equations: ");
            n = scanner.nextInt();

            System.out.println("Enter values...");
            for (int i = 0; i < n; i++) {
                System.out.print("Enter a: ");
                a[i] = scanner.nextInt();
                System.out.print("Enter m: ");
                m[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                M = M * m[i];
            }

            for (int i = 0; i < n; i++) {
                mx[i] = M / m[i];
            }

            for (int i = 0; i < n; i++) {
                s[i] = inv(mx[i], m[i]);
            }

            int x = 0;

            for (int i = 0; i < n; i++) {
                x = x + a[i] * mx[i] * s[i];
                x = x % M;
            }

            System.out.printf("The solution of the given system of equations is: %d %d%n", x, M);




    }
}
