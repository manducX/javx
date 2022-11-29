class Student1 {
    int marks;
    String name;

    public void assignData(int c, String d) {
        // System.out.println("step 1:");
        marks = c;
        name = d;
    }

    public void showData() {
        // System.out.println("step 2:");
        System.out.print("Marks = " + marks + " " + " Name = " + name);
        System.out.println();
    }
}

public class multiple_object {
    public static void main(String args[]) {
        // System.out.println("step 0:");
        // create array of employee object
        Student1[] obj = new Student1[2];
        // create actual employee object
        obj[0] = new Student1();
        obj[1] = new Student1();
        // System.out.println("step 0.1:");
        // assign data to employee objects
        obj[0].assignData(100, "ABC");
        // System.out.println("step 0.2:");
        obj[1].assignData(200, "XYZ");
        // display the employee object data
        System.out.println("Student Object 1:");
        obj[0].showData();
        System.out.println("Student Object 2:");
        obj[1].showData();
    }
}