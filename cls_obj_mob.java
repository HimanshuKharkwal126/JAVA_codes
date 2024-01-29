/*
import java.util.*;
class cls_obj_mob {
    String brand;
    String processor;
    double price;
    int ram;
    int rom;
void getData(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter brand name:");
    brand=sc.nextLine();
    System.out.println("enter processor name:");
    processor=sc.nextLine();
    System.out.println("enter the price:");
    price=sc.nextDouble();
    System.out.println("enter the ram:");
    ram=sc.nextInt();
    System.out.println("enter the rom:");
    rom=sc.nextInt();
    }
void showData(){
    System.out.println("brand name is: "+brand+" processor name is: "+processor+" price is: "+price+" ram is: "+ram+" and rom is: "+rom);
}
public static void main(String[] args) {
    cls_obj_mob c1=new cls_obj_mob();
    cls_obj_mob c2=new cls_obj_mob();
    c1.getData();
    c1.showData();
    c2.getData();
    c2.showData();
}
}

*/


import java.util.*;
class cls_obj_mob{
    String brand;
    String processor;
    double price;
    int ram;
    int rom;
    static String material="Plastic";
    void getData(String b,String p,double pr,int r,int ro){
        brand=b;
        processor=p;
        price=pr;
        ram=r;
        rom=ro;
    }
    void showData(){
        System.out.println("brand name is: "+brand+" processor name is: "+processor+" price is: "+price+" ram is: "+ram+" rom is: "+rom);
    }

public static void main(String[] args) {
    cls_obj_mob c1=new cls_obj_mob();
    cls_obj_mob c2=new cls_obj_mob();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter brand name:");
    String b=sc.nextLine();
    System.out.println("enter processor name:");
    String p=sc.nextLine();
    System.out.println("enter the price:");
    double pr=sc.nextDouble();
    System.out.println("enter the ram:");
    int r=sc.nextInt();
    System.out.println("enter the rom:");
    int ro=sc.nextInt();
    c1.getData(b,p,pr,r,ro);
    c1.material="iron";
    c1.showData();
    c2.showData();
}  
}
