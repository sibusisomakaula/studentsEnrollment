package ac.za.cput;

import ac.za.cput.domain.Lecturer;
import ac.za.cput.Factory.LecturerFactory;
import java.util.Scanner;

public class MainLecturer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //getting user input
        System.out.print("Enter lecturer's ID: ");
        String lecturerID = sc.nextLine();

        System.out.print("Enter lecturer's firstName: ");
        String firstName = sc.nextLine();

        System.out.print("Enter lecturer's lastName: ");
        String lastName = sc.nextLine();

        System.out.print("Enter lecturer's departmentID: ");
        String departmentID = sc.nextLine();

        //Lecturer object using Factory
        Lecturer lecturer = lecturerFactory.createLecturer(lecturerID, firstName, lastName, departmentID);

        if (lecturer != null) {
            System.out.println("/nLecturer Created Successfully");
            System.out.println(lecturer);

        } else {
            System.out.println("Lecturer Not Created");
        }


        sc.close();
    }
}
