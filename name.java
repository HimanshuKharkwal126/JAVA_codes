/*
import java.util.*;
class name {
    public static void main(String[] args) {
        int i;
        String first_name=new String();
        String mid_name=new String();
        String last_name=new String();

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first name:");
        first_name=sc.nextLine();
        System.out.print("enter the middle name:");
        mid_name=sc.nextLine();
        System.out.print("enter the last name:");
        last_name=sc.nextLine();

        System.out.print(first_name.charAt(0)+".");
        System.out.print(mid_name.charAt(0)+".");
        for(i=0;i<last_name.length();i++){
            System.out.print(last_name.charAt(i));
        }

    }
}

*/


import java.util.*;
class name {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("enter the string:");
        str=sc.nextLine();
        char c,d;
        i=str.length()-1;
        while(str.charAt(i)!=(' ')){
            i--;
        }
        j=0;
        while(j<i){
            if(j==0){
                System.out.print(str.charAt(j)+".");
            }else{
                c=str.charAt(j);
                d=str.charAt(j+1);
                if(c==' ' && d!=' '){
                    System.out.print(d+".");
                }
            }j++;
        }
        System.out.print(str.substring(i));
    }
}
