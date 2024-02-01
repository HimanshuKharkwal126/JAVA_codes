class dimension_box {
    int length,breath,height;
    void set_dimension(int x,int y,int z){
    length=x;
    breath=y;
    height=z;
    }
    
    void show_dimension(){
        System.out.println("length of box is:"+length);
        System.out.println("breath of box is:"+breath);
        System.out.println("height of box is:"+height);
    }
    public static void main(String[] args) {
        dimension_box b1=new dimension_box();
        b1.set_dimension(10, 20,30);
        b1.show_dimension();
        dimension_box b2=new dimension_box();
        b2.set_dimension(40, 50,60);
        b2.show_dimension();
    }
}
