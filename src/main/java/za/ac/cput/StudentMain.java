package za.ac.cput;

import za.ac.cput.domain.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student.Builder().studentID("12345").firstName("Marcus") .lastName("Luther").studentEmail("marcus.luther@email.com").departmentID("CS11").build();
        System.out.println(student);
    }
}
