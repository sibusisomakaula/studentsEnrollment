package za.ac.cput;

import za.ac.cput.domain.Enrollment;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Enrollment en1 = new Enrollment.Builder().setEnrollmentId("54321")
                .setStudentId("12125")
                .setCourseId("23236")
                .setEnrollmentDate(LocalDate.now())
                .build();

        System.out.println(en1.toString());
    }
}
