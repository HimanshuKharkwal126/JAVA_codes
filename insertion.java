/*

import java.util.*;
class insertion_array{
    public static void main(String[] args) {
     int i,n;
     Scanner sc=new Scanner(System.in);
     System.out.print("enter no of elements in array:");
     n=sc.nextInt();
     int a[]=new int[n];
     for(i=0;i<n;i++){
        System.out.println("enter elements:"+(i+1));
        a[i]=sc.nextInt();
     }
     System.out.print("enter the position:");
     int pos=sc.nextInt();
     System.out.print("enter the element:");
     int ele=sc.nextInt();
     for(i=n;i<pos-1;i++){
        a[i]=a[i-1];
     }
     a[pos-1]=ele;
     for(i=0;i<n;i++){
        System.out.println(a[i]);
     }
}
}


*/


import java.util.*;
class insertion_array{
    public static void main(String[] args) {
     int i,n;
     Scanner sc=new Scanner(System.in);
     System.out.print("enter no of elements in array:");
     n=sc.nextInt();
     int a[]=new int[n];
     for(i=0;i<n;i++){
        System.out.println("enter elements:"+(i+1));
        a[i]=sc.nextInt();
     }
     System.out.print("enter the position:");
     int pos=sc.nextInt();
     System.out.print("enter the element:");
     int ele=sc.nextInt();
     for(i=pos-1;i>n;i--){
        a[i-1]=a[i];
     }
     a[pos-1]=ele;
     for(i=0;i<n;i++){
        System.out.println(a[i]);
     }
}
}
