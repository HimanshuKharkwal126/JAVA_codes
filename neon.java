import java.util.*;
class neon{
    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        int sq=a*a;
        while(sq>0){
            int rem=sq%10;
            n=rem+n;
            sq=sq/10;
        }
        if(a==n){
            System.out.println(a + " is neon number:");
        }else{
            System.out.println(a + " is not a neon number:");
        }
    }
}