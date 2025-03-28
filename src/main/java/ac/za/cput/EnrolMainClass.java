package za.ac.cput;

import za.ac.cput.domain.Enrollment;

import java.time.LocalDate;

public class EnrolMainClass {
    public static void main(String[] args) {

        Enrollment en1 = new Enrollment.Builder().setEnrollmentId("C100_Dev")
                .setStudentId("221410848")
                .setCourseId("CS01")
                .setEnrollmentDate(LocalDate.now())
                .build();

        System.out.println(en1.toString());
    }
}
