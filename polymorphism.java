                                                   //  Polymorphism:

//                                 There are 2 types of polymorphism:
//     1 - Compile time polymorphism:                                  2 - run time polymorphism:
//    a - Static                                                          a - Dynamic
//    b - Method overloading                                              b - Method overriding
//       * same name                                                          * same name
//       * different signature                                                * same signature       
//       * same class                                                         * different class
//       * different arguments                                                * different arguments
//       #  change the order of parameter                                        # same parameter
//       # change the data type of parameter                                     # same return type
//       # change the number of parameter
//



                                        //  method overloading:

/*

class polymorphism {
    void show(){                       // first type of method overloading:
        System.out.println("1");
    }
    void see(String name){            // second type of method overloading:
        System.out.println("2");
    }
    void see(int a){                // third type of method overloading:
        System.out.println("3");
    }
    void see(int a, String b){       // fourth type of method overloading:
        System.out.println("4");
    }
    void see(int a, int b){       // fifth type of method overloading:
        System.out.println("4");
    }
    void see(String a, int b){       // sixth type of method overloading:
        System.out.println("4");
    }
    public static void main(String[] args) {
        polymorphism p1=new polymorphism();
        p1.show();
        p1.see("himanshu");
        p1.see(0);
        p1.see(1,"harshit");
        p1.see(15,56);
        p1.see("himanshu",15);
    }
}

*/

                                                // method overriding:

/* 

class overRiding{
    void display(){
        System.out.println("parent class:");
    }
}
class second_class extends overRiding{
    void display(){
        System.out.println("child class");
    }
}
class polymorphism{
    public static void main(String[] args) {                                                 
        second_class sc=new second_class();
        sc.display();
    }
}   
*/

       
/*                                          
class overRiding{
    void display(){
        System.out.println("parent class:");
    }
}
class second_class extends overRiding{
    void display(){
        System.out.println("child class");
    }
}
class polymorphism{
    public static void main(String[] args) {
        int a=10;
        final int b=20;
        b=30;                                                        // value change ni ho skti agr variable k samne final kayword lga d..
        second_class sc=new second_class();
        sc.display();
    }
}         

*/


/* 

final class overRiding{
    void display(){
        System.out.println("parent class:");
    }
}
class second_class extends overRiding{                              // class ke aage final keyword lgane k bad usko koi doosri class inherit ni kr skti:
    void display(){
        System.out.println("child class");
    }
}
class polymorphism{
    public static void main(String[] args) {                                                     
        second_class sc=new second_class();
        sc.display();
    }
}   

*/


/* 
class overRiding{
  final void display(){
        System.out.println("parent class:");
    }
}
class second_class extends overRiding{
    void display(){                                       // final keyword use krne k bad us nam ka koi or function ni ban skta:
        System.out.println("child class");
    }
}
class polymorphism{
    public static void main(String[] args) {                                                   
        second_class sc=new second_class();
        sc.display();
    }
}   

*/



