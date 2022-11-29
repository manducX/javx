class school{
    String name;
    int age;

    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class student extends school{
    int id;
    int std;
    void display1(){
        System.out.println("Std:"+std);
        System.out.println("Roll No.:"+id);
    }
}
class Employee extends school{}

class Staff extends Employee{
    int empid;
    int doj;

    @override
    void display2(){
        System.out.println("Employee ID:"+empid);
        System.out.println("Date of Joining:"+doj);
    }
}
class Teacher extends Employee{
    String desig;
    public int id;
    public int std;
    @override
    void displayx(school Super){
        Super.display();
        System.out.println("Designation:"+desig);
    }
} 
public class Second {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name="Anshuman";
        t.age=19;
        t.display();
        Teacher tc = new Teacher();
        tc.desig="Senior";
        tc.displayx(tc);
        student s = new student();
        s.id=05;
        s.std=12;
        s.display1();
    }
    
}
