public class eight {
    public static void main(String[] args) {
        parent p = new parent();
        p.print();
        child c = new child();
        c.prt();
        parent p1 = new child();
        p1.print();
    }
}
class parent{
    void print(){
        System.out.println("This is Parent class");
    }
}
class child extends parent{
    void prt(){
        System.out.println("This is Child Class");
    }
}
