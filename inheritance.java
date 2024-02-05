                                 // Single level inheritance:

/* 

import java.util.*;
class A{
    int a,b;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a:");
        a=sc.nextInt();
        System.out.print("enter the value of b:");
        b=sc.nextInt();
        }
        void add(){
            System.out.println("addition of a and b is:"+(a+b));
        }
}
class B extends A{
    int c;
    void getData(){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of c:");
        c=sc.nextInt();
    }
    void display(){
        System.out.println("addition of a b and c is:"+(a+b+c));
    }
}
class C{
    public static void main(String[] args) {
        B b1=new B();
        b1.input();                    // call for input values of A and B:
        b1.getData();                  // call for input value of C:
        b1.add();                      // call for the sum of A and B:
        b1.display();                  // call for the sum of A B and C:
    }
}

*/


                                                  // Multi level inheritance:
/* 

import java.util.*;
class A{
    int a;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a:");
        a=sc.nextInt();
    }
}
class B extends A{
    int b;
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of b:");
        b=sc.nextInt();
    }
} 
class C extends B{
    int c;
    void getValue(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of c:");
        c=sc.nextInt();
    }
     void add(){
        System.out.println("addition of a b and c is:"+(a+b+c));
    }
}
class D{
    public static void main(String[] args) {
        C c1=new C();
        c1.input();
        c1.getData();
        c1.getValue();
        c1.add();
    }
}

*/

                                                    // Multiple inheritance:

/*                                                     
import java.util.*;
class A{
    int a,b;
    void input(){
        Scanner sc=new Scanner(System.in);
            System.out.print("enter the value of a:");
            a=sc.nextInt();
            System.out.print("enter the value of b:");
            b=sc.nextInt();
    }
}
class B extends A{
    void add(){
        System.out.println("addition of a and b is:"+(a+b));
    }
}
class C extends B{
    void sub(){
        System.out.println("difference of a and b is:"+(a-b));
    }
}
class D{
    public static void main(String[] args) {
        B b1=new B();
        C c1=new C();
        b1.input();
        b1.add();
        c1.input();
        c1.sub();
    }
}

*/

                                   

class A{
    void wish(){
        System.out.println("good morning:");
    }
}
class B extends A{
    void wish(){
        System.out.println("good night:");
    }
}
class C{
    public static void main(String[] args) {
      //  final int a=10;
       int a=20;
        System.out.println("value of a is:"+a);
        B b1=new B();                              // hum jo class call krenge uski value print hogi:
        b1.wish();
    }
}



