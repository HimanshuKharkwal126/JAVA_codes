import java.util.*;
class traversing {
    public static void main(String[] args) {
        int word=1;
        Scanner sc=new Scanner(System.in);
        String name=new String();
        System.out.println("enter the name: ");
        name=sc.nextLine();
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==' ' && name.charAt(i+1)!=' '){
                word++;
            }
        }
        System.out.println("total words are:"+word);
    }
}