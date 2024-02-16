/* 
import java.util.*;
public class twoD_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the rows:");
        int r=sc.nextInt();
        System.out.print("enter the columns:");
        int c=sc.nextInt();

        int[][] arr=new int[r][c];

        // input:
        for(int i=0;i<r;i++){                  // rows:
            for(int j=0;j<c;j++){              // columns:
                arr[i][j]=sc.nextInt();
            }
        }

        // output:
        for(int i=0;i<r;i++){                   // rows:
            for(int j=0;j<c;j++){               // columns:
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

*/


                                                // find the element from matrix:
/*

import java.util.*;
public class twoD_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the rows:");
        int r=sc.nextInt();
        System.out.print("enter the columns:");
        int c=sc.nextInt();

        int[][] arr=new int[r][c];

        // input:
        for(int i=0;i<r;i++){                  // rows:
            for(int j=0;j<c;j++){              // columns:
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter the element you want to find:");
        int x=sc.nextInt();

        // output:
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==x){
                    System.out.println("element found at location: (" + i + "," + j + ")");
                }
            }
        }
    }
}

*/

                                        

