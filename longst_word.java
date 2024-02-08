import java.util.*;
class longst_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String str=sc.nextLine();
        str+=" ";
        String word="",lword="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                word+=ch;
            }else{
                if(word.length()>lword.length()){
                    lword=word;
                }
                word="";
            }
        }
        System.out.println("longest word is:"+lword);
    }
}
