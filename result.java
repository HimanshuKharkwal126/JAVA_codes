import java.util.*;
class result{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String str=sc.nextLine();
        String result="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'e'){
                result += 'i';
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}