class student {
    int roll_no;
    String name;
    double marks;
    public void setData(int x,String y,double z){
        roll_no=x;
        name=y;
        marks=z;
    }
    public void showData(){
        System.out.println("name is:"+name);
        System.out.println("roll no is:"+roll_no);
        System.out.println("marks are:"+marks);
        System.out.println("roll no "+roll_no+" name is "+name+" got "+marks+" marks: ");
    }
    public static void main(String[] args) {
        student s1=new student();
        s1.setData(15,"himanshu",66.56);
        s1.showData();
        student s2=new student();
        s2.setData(18,"priyanshu",46.56);
        s2.showData();
    }
}