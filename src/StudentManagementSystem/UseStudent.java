package StudentManagementSystem;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UseStudent {
    static void main(String[] args) {
        StudentService serv =new StudentService();
        Scanner sc = new Scanner(System.in);
        int choice ;
        int roll ;
        String name ;
        String course;
        do{
            System.out.println("Select an option : ");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View all Students");
            System.out.println("4. Search Student");
            System.out.println("5. Enroll Course");
            System.out.println("6. Drop Course");
            System.out.println("7. View Student Course");
            System.out.println("8. Exit");
            System.out.println("Enter Choice : ");
            choice = sc.nextInt();
            switch (choice){
                case 1->{
                    System.out.println("Enter roll : ");
                    roll = sc.nextInt();
                    System.out.println("Enter Name : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    serv.addStudent(roll , name);
                }
                case 2->{
                    System.out.println("Enter roll : ");
                    roll = sc.nextInt();
                    serv.removeStudent(roll);
                }
                case 3-> {
                    serv.viewAllStudent();
                }
                case 4->{
                    System.out.println("Enter roll : ");
                    roll = sc.nextInt();
                    serv.searchStudentById(roll);
                }
                case 5->{
                    System.out.println("Enter roll : ");
                    roll = sc.nextInt();
                    System.out.println("Enter course name : ");
                    sc.nextLine();
                    course = sc.nextLine();
                    serv.enrollStudentInCourse(roll , course);
                }
                case 6->{
                    System.out.println("Enter roll : ");
                    roll = sc.nextInt();
                    System.out.println("Enter course name : ");
                    sc.nextLine();
                    course = sc.nextLine();
                    serv.dropCourse(roll,course);
                }
                case 7->{
                    System.out.println("Enter roll : ");
                    roll = sc.nextInt();
                    serv.getCourses(roll);
                }
                case 8->{
                    System.out.println("Thank You!");
                }
                default -> {
                    System.out.println("Wrong Choice! try Again!!");
                }
            }
        }while(choice!=8);
    }
}
