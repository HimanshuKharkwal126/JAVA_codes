import java.util.*;
class factorial {
    public static void factorial(int n){
        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println("factorial of given number is : "+factorial);
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        factorial(n);

    }
}
