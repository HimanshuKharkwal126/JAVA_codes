                                    // print the given array is sorted or not:
/* 
import java.util.*;
class sorted_array {

    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size=sc.nextInt();
        int []arr=new int[size];
        for( i=0;i<arr.length;i++){
            System.out.println("enter the value:"+i);
            arr[i]=sc.nextInt();
        }
        boolean isAscending = true;
        for(i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending = false;
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
       if(isAscending){
        System.out.println("The array is sorted :");
       }else{
        System.out.println("The array is not sorted:");      
       }
    
}
}


*/



// import java.util.*;
// class sorted_array {

//     public static void main(String[] args) {
//         int i;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of an array:");
//         int size=sc.nextInt();
//         int []arr=new int[size];
//         for( i=0;i<arr.length;i++){
//             System.out.println("enter the value:"+i+1);
//             arr[i]=sc.nextInt();
//         }
//         for( i=0;i<arr.length;i++){                                           
//         System.out.println(arr[i]);                                     
//         }
//         int max=arr[0];                                                  //      ?????? 
//         for( i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         for(int j=i+1;j<arr.length;j++){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//         }
//         System.out.println("sorted array is:");
//     for( i=0;i<arr.length;i++){
//         System.out.println(arr[i]);
//     }
//     }
// }
