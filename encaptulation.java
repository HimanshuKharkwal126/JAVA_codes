class encaptulation {
    private int empId=120;                            // private members can not be access outside the function:
    public void setData(int emp_id){
        empId=emp_id;
    }
    public int showData(){
        return empId;
    }
}
class encap extends encaptulation{
    public static void main(String[] args) {
        encaptulation i1=new encaptulation();
        i1.setData(500);                      // used to change the value of private member:
        System.out.println(i1.showData());
        i1.showData();
    }
}
