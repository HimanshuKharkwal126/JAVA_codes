import java.util.*;
class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name:");
        String name=sc.nextLine();
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        System.out.println(rev);
        if(name.equals(rev)){
            System.out.println("String is palindrome:");
        }else{
            System.out.println("String is not palindrome:");
        }

    }
}