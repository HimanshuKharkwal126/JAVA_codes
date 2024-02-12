import java.util.*;
class pos_neg_count {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i,n,pos_count=0,neg_count=0,zero=0;
    System.out.println("enter the no of elements in array:");
    n=sc.nextInt();
    int a[]=new int[n+1];
    for(i=0;i<n;i++){
        System.out.println("enter elements:"+(i+1));
        a[i]=sc.nextInt();
    }
    for(i=0;i<a.length;i++){
        if(a[i]>0){
            pos_count+=1;
        }else if(a[i]==0){
            zero+=1;
        }else{
            neg_count+=1;
        }
    }
    System.out.println("positive numbers in array:"+pos_count);
    System.out.println("negative numbers in array:"+neg_count);
    System.out.println("zeros in array:"+zero);
    }
}