                                                     // convert decimal numbers to binary:
/*                                         
import java.util.*;
class conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val=1;
        int binary=0;
        System.out.print("enter the number:");
        int a=sc.nextInt();
        int n=a;
        while(n > 0){
            int rem=n % 2;
            binary += rem * val;
            val *= 10;
            n /= 2;
        }
        System.out.println("binary of " + a + " is: " + binary);
    }
}

*/


                                                // convert binary numbers to decimal:

import java.util.*;
class conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pow=1;
        int decimal=0;
        System.out.print("enter the number:");
        int a=sc.nextInt();
        int n=a;
        while(n > 0){
            int rem=n % 10;
            decimal += rem * pow;
            pow *= 2;
            n /= 10;
        }
        System.out.println("decimal conversion of " + a + " is: " + decimal);
    }
}



