import java.util.*;
class cmbind_lngth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size:");
        int size=sc.nextInt();
        String arr[]=new String[size];
        int total_length=0;

        for(int i=0;i<size;i++){
            System.out.println("enter the string:");
            arr[i]=sc.nextLine();
            total_length += arr[i].length();
        }
        System.out.println(total_length);
    }
}
