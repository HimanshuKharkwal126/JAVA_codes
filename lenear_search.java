import java.util.*;
class lenear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of elements:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        // for input
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to find:");
        int x=sc.nextInt();

        // for output:
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                System.out.print("element found at index:"+i);
            }
    }
}
}
