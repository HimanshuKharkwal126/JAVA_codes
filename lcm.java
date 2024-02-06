import java.util.*;
class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lcm=0;
        System.out.print("enter the first number:");
        int a=sc.nextInt();
        System.out.print("enter the second number:");
        int b=sc.nextInt();
        lcm=a > b ? a : b;
        while(true){
            if(lcm%a == 0 && lcm%b == 0){
                System.out.println(" LCM of " + a + " and " + b + " is: " + lcm);
                break;
            }
            lcm ++;
        }
    }
}
