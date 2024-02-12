/* 
class prime {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=7;i++){
            if(i%1==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("no is prime:");
        }else{
            System.out.println("no is composite:");
        }
    }
}
*/

                                  // using class and object:

class prime{
    int num;
    prime(int n){
        num=n;
    }
    void showData(){
        int count=0;
        int i;
        for(i=1;i<=num;i++){
            if(num%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println("prime no:"+num);
        }else{
            System.out.println("composite no:"+num);
        }
    }
    public static void main(String[] args) {
        prime p1=new prime(10);
        p1.showData();
    }
}



 