class shap{
    public void print_shape(){
        System.out.println("This is Shape");
    }
}
class rectangle extends shap{
    public void print_rect(){
        System.out.println("This is Rectangle");
    }
}
class circle extends shap{
    public void print_circle(){
        System.out.println("This is Circular Shape");
    }
}
class square extends rectangle{
    public  void print_square(){
        System.out.println("Square is a Rectangle");
    }
}
    
public class shape{
    public static void main(String[] args){
        square sq = new square();
        sq.print_shape();
        sq.print_rect();
    }
}