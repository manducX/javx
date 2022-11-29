class Member{
    String name;
    int age;
    int pnumber;
    String address;
    int salary;
    
    public void printSalary(){
        System.out.println("Salary is :"+salary);       
    }
    public void printDetails(){
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
        System.out.println("Phone Number is :"+pnumber);
        System.out.println("Address is :"+address);      
    }
}
class Employee extends Member{
    String specialization;
}
class Manager extends Member{
    String department;
}
class member_employe{
    public static void main(String[] args){
        Employee e = new Employee();
        e.name = "Anshu";
        e.age = 19;
        e.pnumber = 78911*222;
        e.address = "Haringhata";
        e.salary = 35500;
        e.specialization = "Backend Developer";
        e.printSalary();
        e.printDetails();
        System.out.println("Specialization is : "+e.specialization);

        Manager m = new Manager();
        m.name = "Rimi";
        m.age = 21;
        m.pnumber = 78911*222;
        m.address = "Hydrabad";
        m.salary = 40500;
        m.department = "Marketing";
        m.printSalary();
        m.printDetails();
        System.out.println("Department is : "+m.department);
    }
}