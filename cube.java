class cube {
    int length;
    int breath;
    int height;
    public void setData(int x,int y,int z) {
        length=x;
        breath=y;
        height=z;
    }
    public void putData(){
        System.out.println("length of cube is:"+length);
        System.out.println("breath of cube is:"+breath);
        System.out.println("height of cube is:"+height);
    }
    public static void main(String[] args) {
        cube a=new cube();
        a.setData(15,10,25);
        a.putData();
        cube b=new cube();
        b.setData(56,85,45);
        b.putData();
        cube c=new cube();
        c.setData(89,56,23);
        c.putData();
    }
}
