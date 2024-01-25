/*
import java.util.*;
class anagram {
    public static void main(String[] args) {
        String x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first string:");
        x=sc.nextLine();
        System.out.print("enter the second String:");
        y=sc.nextLine();
        char p[]=x.toCharArray();
        char q[]=y.toCharArray();
        Arrays.sort(p);
        Arrays.sort(q);
        Boolean ans=Arrays.equals(p,q);
        if(ans==true){
            System.out.println("String is anagram:");
        }else{
            System.out.println("string is not anagram:");
        }
    }
}

*/



                                    // when there is a space between words:

import java.util.*;
class anagram {
    public static void main(String[] args) {
        String x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string:");
        x=sc.nextLine();
        System.out.println("enter the second String:");
        y=sc.nextLine();
        x=x.replace(" "," ");
        y=y.replace(" "," ");
        char p[]=x.toCharArray();
        char q[]=y.toCharArray();
        Arrays.sort(p);
        Arrays.sort(q);
        Boolean ans=Arrays.equals(p,q);
        if(ans==true){
            System.out.println("String is anagram:");
        }else{
            System.out.println("string is not anagram:");
        }
    }
}
