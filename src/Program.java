import Entities.Student;
import function.ManageStudent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ManageStudent manageStudent=new ManageStudent();
        do {
            System.out.println("Menu: ");
            System.out.println("1. Add student");
            System.out.println("2. Display");
            System.out.println("0. Exits");
            System.out.print("Choice: ");
            int choice=checkNumber(" choice menu");
            switch (choice){
                case 0:
                    System.out.println("Bye bye");
                    return;
                case 1:
                   addStudent(manageStudent);
                    break;
                case 2:
                    displayStudent(manageStudent);
                    break;
                default:
                    System.out.println("Please try again");
            }
        } while (true);

    }

     private static int checkNumber(String mess) {
        boolean check = true;
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (Exception e) {
                System.out.println("please try again:" +mess);
            }
        } while (check);
        return number;
    }
    private static void addStudent(ManageStudent manageStudent){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter name: ");
        String nameStudent= scanner.nextLine();
        int idStudent=manageStudent.getListStudent().length+1;
        Student student=new Student(idStudent,nameStudent);
        manageStudent.add(student);
    }
    private static void displayStudent(ManageStudent manageStudent){
        manageStudent.display();
    }
}
