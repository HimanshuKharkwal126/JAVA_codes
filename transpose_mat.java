import java.util.*;
class transpose_mat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the rows:");
        int n=sc.nextInt();
        System.out.print("enter the columns:");
        int m=sc.nextInt();

        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("the transpose of matrix is:");
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}