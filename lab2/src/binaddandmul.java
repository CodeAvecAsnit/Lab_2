import java.util.Scanner;

class BinaryOperations {

    static int binaryAddition(int a, int b) {
        int carry = 0, result = 0, place = 1;

        while (a > 0 || b > 0 || carry > 0) {
            int bitA = a % 2;
            int bitB = b % 2;
            result += (bitA ^ bitB ^ carry) * place;
            carry = (bitA & bitB) | (bitB & carry) | (bitA & carry);
            a /= 2;
            b /= 2;
            place *= 2;
        }
        return result;
    }
    static int binaryMultiplication(int a, int b) {
        int result = 0, place = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = binaryAddition(result, a * place);
            }

            b /= 2;
            place *= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two binary numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int additionResult = binaryAddition(num1, num2);
        int multiplicationResult = binaryMultiplication(num1, num2);

        System.out.println("Binary Addition: " + additionResult);
        System.out.println("Binary Multiplication: " + multiplicationResult);

        scanner.close();
    }
}
