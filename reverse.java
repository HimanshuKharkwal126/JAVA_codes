                           // reverse of given no by while loop:

class reverse {
    public static void main(String[] args) {
        int num=123456;
        int rev_num=0,rem;
        while(num>0){
            rem=num%10;
            rev_num=rev_num*10+rem;
            num=num/10;
        }
        System.out.println("reverse of given number is:"+rev_num);
    }
}