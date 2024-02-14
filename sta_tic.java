class sta_tic {
    int a=1,b=-1;
    static int k=5;
    void setA(int x){
        a=x;
    }
    void setB(int y){
        b=y;
    }
    void setC(int z){
        k=z;
    }
}
class sta_tik{
    public static void main(String[] args) {
        sta_tic s1=new sta_tic();
        sta_tic s2=new sta_tic();
        s1.setA(5);
        s1.setB(10);
        s2.setA(15);
        s2.setB(20);
        s1.setC(25);
        System.out.println("a="+s1.a+": b="+s1.b);
        System.out.println("a="+s2.a+": b="+s2.b);
        System.out.println("k="+s1.k);
        System.out.println("k="+s2.k);
    }
}