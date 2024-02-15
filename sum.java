                        // sum of float elements:

/*                      
class sum{
    public static void main(String[] args) {
        float []num={45.25f,65.54f,56.85f,96.45f};
        float sum=0;
     //   for(int i=0;i<num.length;i++){
     //      sum+=num[i];
     //   }  
        for(float element:num){
            sum+=element;
        }
        System.out.println(sum);
        System.out.println(sum/num.length);
    }
}

*/
 
                           // sum of elements by function:
/* 

import java.util.*;
class sum {
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    } 
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the first number:");
    int a=sc.nextInt();
    System.out.print("enter the second number:");
    int b=sc.nextInt();
    int sum=calculateSum(a,b);
    System.out.println("sum of two numbers is:"+sum);
     
}
}
*/

                                  // sum of odd numbers:



import java.util.*;
public class sum{
    public static void printSum(int n){
    int sum=0;
    for(int i=0;i<=n;i++){
        if(i%2!=0){
            sum = sum + i;
        }
    }
    System.out.println(sum);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printSum(n);
    }
}


















 