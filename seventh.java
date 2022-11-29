import java.util.*;
// interface department {
//     String department_name;
//     int num_of_faculty_members;
//     void print();
// }

// class hostel {
//     String hostel_name;
//     int num_of_rooms;
//     void print() {
//         System.out.println("Hostel name: " + hostel_name);
//         System.out.println("Number of rooms: " + num_of_rooms);
//     }
// }

// class student extends hostel implements department {
//     String student_name;
//     int Roll_Number;
//     int year_of_study;
//     String hometown;
//     public void print() {
//         System.out.println("Student name: " + student_name);
//         System.out.println("Regitration number: " + Roll_Number);
//         System.out.println("Year of study: " + year_of_study);
//         System.out.println("Hometown: " + hometown);
//         System.out.println("Hostel name: " + hostel_name);
//         System.out.println("Number of rooms: " + num_of_rooms);
//         System.out.println("Department name: " + department_name);
//         System.out.println("Number of faculty members: " + num_of_faculty_members);
//     }
// }

// public class q1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int ch;
//         System.out.println("Menu");
//         System.out.println("1. Admit the new student");
//         System.out.println("2. Migrate a student");
//         System.out.println("3. Display student information");
//         System.out.println("Enter your choice:");
//         ch = sc.nextInt();
//         switch(ch) {
//             case 1:
//                 student s = new student();
//                 System.out.println("Enter student name:");
//                 s.student_name = sc.next();
//                 System.out.println("Enter registration number:");
//                 s.Roll_Number = sc.nextInt();
//                 System.out.println("Enter year of study:");
//                 s.year_of_study = sc.nextInt();
//                 System.out.println("Enter hometown:");
//                 s.hometown = sc.next();
//                 System.out.println("Enter hostel name:");
//                 s.hostel_name = sc.next();
//                 System.out.println("Enter number of rooms:");
//                 s.num_of_rooms = sc.nextInt();
//                 System.out.println("Enter department name:");
//                 s.department_name = sc.next();
//                 System.out.println("Enter number of faculty members:");
//                 s.num_of_faculty_members = sc.nextInt();
//                 s.print();
//                 break;
//             case 2:
//                 System.out.println("Enter registration number:");
//                 int reg = sc.nextInt();
//                 s.Roll_Number = reg;
//                 System.out.println("Enter hostel name:");
//                 s.hostel_name = sc.next();
//                 System.out.println("Enter number of rooms:");
//                 s.num_of_rooms = sc.nextInt();
//                 s.print();
//                 break;
//             case 3:
//                 System.out.println("Enter registration number:");
//                 int reg1 = sc.nextInt();
//                 s.Roll_Number = reg1;
//                 s.print();
//                 break;
//         }
//     }
// } 
interface Department{
	String deptName;
	int noOfFaculty;
	
	public void printAttributes();

}

class Hostel{
	String hostelName;
	int noOfRooms;
	
	public void printAttributes(){
		System.out.println("Hostel Name: "+hostelName);
		System.out.println("Number of Rooms: "+noOfRooms);
	}
}

class Student extends Hostel implements Department{
	String studentName;
	int regNo;
	int year;
	String homeTown;
	
	public void printAttributes(){
		System.out.println("Student Name: "+studentName);
		System.out.println("Registration Number: "+regNo);
		System.out.println("Year of Study: "+year);
		System.out.println("Hometown: "+homeTown);
	}
	
	public void printDepartmentAttributes(){
		System.out.println("Department Name: "+deptName);
		System.out.println("Number of Faculty: "+noOfFaculty);
	}
}

class Driver{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		while(true){
			System.out.println("Menu:");
			System.out.println("1. Admit the new student");
			System.out.println("2. Migrate a student");
			System.out.println("3. Display student information");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			if(choice == 1){
				System.out.println("Enter student name: ");
				s.studentName = sc.next();
				System.out.println("Enter registration number: ");
				s.regNo = sc.nextInt();
				System.out.println("Enter year of study: ");
				s.year = sc.nextInt();
				System.out.println("Enter hometown: ");
				s.homeTown = sc.next();
				System.out.println("Enter department name: ");
				s.deptName = sc.next();
				System.out.println("Enter number of faculty: ");
				s.noOfFaculty = sc.nextInt();
				System.out.println("Enter hostel name: ");
				s.hostelName = sc.next();
				System.out.println("Enter number of rooms: ");
				s.noOfRooms = sc.nextInt();
				System.out.println("Student admitted successfully.");
			}
			else if(choice == 2){
				System.out.println("Enter registration number of student to be migrated: ");
				int regNo = sc.nextInt();
				if(regNo == s.regNo){
					System.out.println("Enter hostel name: ");
					s.hostelName = sc.next();
					System.out.println("Enter number of rooms: ");
					s.noOfRooms = sc.nextInt();
					System.out.println("Student migrated successfully.");
				}
				else{
					System.out.println("Student not found.");
				}
			}
			else if(choice == 3){
				System.out.println("Enter registration number of student: ");
				int regNo = sc.nextInt();
				if(regNo == s.regNo){
					System.out.println("Student Information: ");
					s.printAttributes();
					s.printDepartmentAttributes();
					s.printAttributes();
				}
				else{
					System.out.println("Student not found.");
				}
			}
			else{
				System.out.println("Invalid choice.");
			}
		}
	}
}