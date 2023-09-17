import java.util.Scanner;
class euc{
    public static void main(String[] args){
        System.out.println("Enter the first numbers :");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Enter another number");
        int b = in.nextInt();
        int c = gcd(a,b);
        System.out.println("The gcd of the numbers is :"+c);

    }
    public static int gcd(int a ,int b){
        if(a%b == 0){
            return b;
        }
        else{
            return gcd(b,a%b);
        }
    }
}