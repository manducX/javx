public class First{
    public static void main(String[] args) {
        opps ob=new opps();
        ob.print();
        ob.prints();
    }
}
interface java {
    void print();
}
interface cpp{
    void prints();
}
class opps implements java,cpp{ 
    @Override
    public void print(){
        System.out.println("oops is Java concept");
    }
    public void prints() {
        System.out.println("opps is c++ concept");
    }
}