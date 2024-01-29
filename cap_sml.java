                            // change capital letters to small case letters:

import java.util.*;
class cap_sml {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.print(Character.toLowerCase(ch));
            }else{
                System.out.print(Character.toUpperCase(ch));
            }
        }

    }
}
