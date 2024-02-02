import java.util.*;
class fibbonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the total 11number of elements you want in series:");
        int n=sc.nextInt();

        int a=0,b=1;
        System.out.print(a+" ");

        if(n > 1){
            for(int i=2;i<=n;i++){
                System.out.print(b+" ");
                int temp=b;
                b=a+b;
                a=temp;
            }
            System.out.println();
        }
    }
}
