/*
class array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        String name[]={"himanshu","bhupesh","anurag","pranav","mayank"};
        char ch[]={'h','b','a','p','m'};
     //   int arr[]=new int[4];
     //   arr[0]=5;
     //   arr[1]=6;
     //   arr[2]=7;
     //   arr[3]=8;
        for (int i=0;i<arr.length;i++){
            System.out.println("roll no is:"+arr[i]);
            System.out.println("name is:"+name[i]);
            System.out.println("name starting char is:"+ch[i]);
            System.out.println();
        }
    }
}
*/



/* 
class array{
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=97;                                          // normal array
        marks[1]=95;
        marks[2]=98;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}
*/
   


/* 
class array{
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=97;
        marks[1]=95;                                        // array by for loop:
        marks[2]=98;
        for(int i=0;i<3;i++){
        System.out.println(marks[i]);
    }
}
}

*/

/* 
import java.util.*;
class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of elements:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        // for input:
        for(int i=0;i<size;i++){
            System.out.println("enter the value:"+i);
            arr[i]=sc.nextInt();
        }

        // for output:
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }
}
*/



                              // Largest or Smallest Number:

/*
import java.util.*;
class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of elements:");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<size;i++){
        System.out.println("enter the value:"+i+1);
        arr[i]=sc.nextInt();
       }
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;

       for(int i=0;i<arr.length;i++){
        if(arr[i]<size){
            min = arr[i];
        }if(arr[i]>max){
            max = arr[i];
        }
       }
       System.out.println("Largest number is:"+max);
       System.out.println("Smallest number is:"+min);
}
}

*/









