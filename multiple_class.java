class Pclass{
    public void pmethod(){
        System.out.println("This is Parent Class");
    }
}

class Cclass extends Pclass{
    public void cmethod(){
        System.out.println("This is Child Class");
    }
}
public class multiple_class{
    public static void main(String[]args){
        Pclass m = new Pclass();
        Cclass n = new Cclass();
        m.pmethod();
        n.cmethod();
        n.pmethod();
    }
}