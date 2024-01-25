class armstorm {
    public static void main(String[] args) {
        int i,r,temp,sum;
        for(i=1;i<=500;i++){
         temp=i;
         sum=0;
         while(temp!=0){
            r=temp%10;
            sum+=r*r*r;
            temp=temp/10;
         }
         if(i==sum){
            System.out.println(i);
         }
        }
    }
}
