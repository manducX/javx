class Scars{
    String a="SRT is way better than Skyline"; 
    String b="Fuck your Opinion";
    void Vin(){
        System.out.println(a+" "+b);

    }
}
class Sbikes{
    String c="R1 has better performance than S1K"; 
    String d="Fuck your Opinion";
    void Vin(){
        System.out.println(c+" "+d);

    }
}
public class multiple_classes {
    public static void main(String[] args) {
        Scars x = new Scars();
        Sbikes y = new Sbikes();
        x.Vin();
        y.Vin();
    }
    
}
