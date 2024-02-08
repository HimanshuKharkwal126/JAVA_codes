                                           // multiplication of matrix:
import java.util.*;
class mul_of_mat {
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
    void mul(){
        int i,j,k;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                c[i][j]=0;
                for(k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
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
        mul_of_mat m1=new mul_of_mat();
        m1.getData();
        m1.mul();
        m1.showData();
    }

}