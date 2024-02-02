import java.util.Scanner;
class greater_num {
    public static int getGreater(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a=sc.nextInt();
        System.out.print("enter the value of b:");
        int b=sc.nextInt();
        System.out.print("greatest number is:"+getGreater(a,b));
    }
}
