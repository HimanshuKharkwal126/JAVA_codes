                                        // abstraction : Data hiding

abstract class abstraction {
    abstract void getData();   
}
 
class circle extends abstraction{
    void getData(){
        System.out.println("himanshu:");
    }
}
class rectangle extends abstraction{
    void getData(){
        System.out.println("harshit:");
    }
}

class abs{
    public static void main(String[] args) {
        abstraction a1=new circle();
        a1.getData();
        abstraction a2=new rectangle();
        a2.getData();
    }
}
