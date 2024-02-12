                        // replace space by symbol:
/*

import java.util.*;
class replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String name=sc.nextLine();
        System.out.println(name.replace(' ','*'));
    }
}

*/


import java.util.*;
class replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String name=sc.nextLine();
        String result ="";

        for(int i=0 ; i<name.length() ; i++){
            if(name.charAt(i) == 'e'){
                result+='i';
            }else{
                 result+=name.charAt(i);
            }
        } 
        System.out.println(result);
    }
}


