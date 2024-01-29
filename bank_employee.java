

class bank {
    int Ac_no;
    double ammount;
    String name;
    static double k=1.2;
    void setData(int x,double y,String z){
        Ac_no=x;
        ammount=y;
        name=z;
    }
    void showData(){
        System.out.println("Account no is:"+Ac_no);
        System.out.println("bank ammount is:"+ammount);
        System.out.println("user name is:"+name);
        System.out.println("ROI is:"+k);
    }
    public static void main(String[] args) {
        bank b1=new bank();
        b1.setData(123,56000.25,"himanshu");
        b1.showData();
        bank b2=new bank();
        b2.setData(124,58000.52,"sumit");
        b2.showData();
        bank b3=new bank();
        b3.setData(125,55000.45,"pradeep");
        b3.showData();
        bank b4=new bank();
        b4.setData(126,56000.23,"anku");
        b4.showData();
    }
}






