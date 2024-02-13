import java.util.*;
class reverse_str {
    public static void main(String[] args) {
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.print("enter the string: ");
        str=sc.nextLine();
        i=str.length()-1;
        while(i>=0){
            j=i;
            while(str.charAt(j)!=' ' && j>0){
                j--;
            }
            if(j==0){
                k=0;
            }else{
                k=j+1;
            }
            System.out.println(str.substring(k,i+1));
            i=j-1;
        }

    }
}