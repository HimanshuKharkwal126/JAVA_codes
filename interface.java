                                       // ineterface 
interface i1 {
    void show();
}
interface i2{
    void display();
}
class test implements i1{
    public void show(){
        System.out.println("hello world:");
    }
    public void display(){
        System.out.println("hello duniya:");
    }
    public static void main(String[] args) {
        test t1=new test();
        t1.show();
        t1.display();
    }
}
