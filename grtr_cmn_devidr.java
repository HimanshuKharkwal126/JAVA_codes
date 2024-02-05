/*
import java.util.*;
class grtr_cmn_devidr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of first number:");
        int a=sc.nextInt();
        System.out.print("enter the value of second number:");
        int b=sc.nextInt();

        while(a != b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        System.out.println("Greatest common devisor is:"+b);
    }
}

*/

import java.util.*;
class grtr_cmn_devidr {
    public static void main(String[] args) {
        int gcd=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of first number:");
        int a=sc.nextInt();
        System.out.print("enter the value of second number:");
        int b=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(a%i == 0 && b%i == 0){
            gcd=i;
        }
    }
        System.out.println("Greatest common devisor of " + a + " and " + b + " is: "+gcd);
    }
}


