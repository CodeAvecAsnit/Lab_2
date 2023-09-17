import java.util.*;
class prime{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        int b = a;
        while (a!=1){
            for(int i = 2;i<=a;++i){
                if (a%i==0){
                    System.out.print(i +"*");
                    a = a/i;
                    break;
                }
            }
        }
        System.out.printf("\b = %d",b);
    }
}