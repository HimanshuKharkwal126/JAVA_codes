                                            // sum of matrix:
import java.util.*;
class sum_of_mat {
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    Scanner sc=new Scanner(System.in);
    void getData(){
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("enter the elements of matrix 1:");
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("enter the elements of matrix 2:");
                b[i][j]=sc.nextInt();
            }
        }
    }
    void add(){
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
    }
    void showData(){
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(c[i][j]+" "); 
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        sum_of_mat s1=new sum_of_mat();
        s1.getData();
        s1.add();
        s1.showData();
    }
}