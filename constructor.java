                         // hello constructor:
 /* 

class constructor {
    int roll_no;
    String name;
    constructor(){
        System.out.println(" hey i am a constructor:");
    }
    public static void main(String[] args) {
        constructor c1=new constructor();
    }
}
*/


                                // passing value in constructor:

/* 

class constructor{
    int a;
    int b;
    constructor(int x,int y){
        a=x;
        b=y;
    }
    constructor(){
        a=0;
        b=0;
    }
    void display(){
        System.out.println("value of a is:"+a);
        System.out.println("value of b is"+b);
    }
    public static void main(String[] args) {
        constructor c1=new constructor();
        c1.display();
        constructor c2=new constructor(9,6);
        c2.display();
    }
}
*/
    


                             // marks of student:
/* 

import java.util.*;
class constructor{
    int math,chemistry,physics,hindi,english,total;
    double percentage;
    constructor(int x,int y,int z,int p,int q){
        math=x;
        chemistry=y;
        physics=z;
        hindi=p;
        english=q;
    }
    void calculate(){
        total=math+chemistry+physics+hindi+english;
        percentage=total/5;
    }
    void display(){
        System.out.println("marks in math is:"+math);
        System.out.println("marks in chemistry is:"+chemistry);
        System.out.println("marks in physics is:"+physics);
        System.out.println("marks in hindi is:"+hindi);
        System.out.println("marks in english is:"+english);
        System.out.println("Total marks are:"+total);
        System.out.println("percentage is:"+percentage);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter marks in maths:");
        int x=sc.nextInt();
        System.out.print("enter marks in chemistry:");
        int y=sc.nextInt();
        System.out.print("enter marks in physics:");
        int z=sc.nextInt();
        System.out.print("enter marks in hindi:");
        int p=sc.nextInt();
        System.out.print("enter marks in english:");
        int q=sc.nextInt();
        constructor c1=new constructor(x,y,z,p,q);
        c1.calculate();
        c1.display();

    }
}
*/

                                  // static function in constructor:
class constructor{
    String brand;
    String processor;
    double price;
    int ram;
    int rom;
    static String material="plastic";
    constructor(){
        brand="samsung";
        processor="xnos";
        price=10000.50;
        ram=6;
        rom=64;
    }
    void showData(){
        System.out.println("brand name is: "+brand+" processor name is: "+processor+" price is: "+price+" ram is: "+ram+" rom is: "+rom);
        }
        public static void main(String[] args) {
            constructor c1=new constructor();
            constructor c2=new constructor();
            c1.showData();
            c2.showData();
        }
}







