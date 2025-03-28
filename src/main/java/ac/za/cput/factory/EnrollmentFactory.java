package za.ac.cput.factory;

import za.ac.cput.domain.Enrollment;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class EnrollmentFactory {

    public static Enrollment addEnrollment(String enrollmentId, String studentId, String courseId, LocalDate enrollmentDate){
    /*
     if (enrollmentId.isEmpty() || enrollmentId == null)
         return null;
     if (studentId.isEmpty() || studentId == null)
            return null;
     if (courseId.isEmpty() || courseId == null)
            return null;
     if (enrollmentDate == null)
            return null;
    */
        //when using Helper

        if(Helper.isNullOrEmpty(enrollmentId) || Helper.isNullOrEmpty(studentId)
        || Helper.isNullOrEmpty(courseId) || Helper.isNull(enrollmentDate))
            return null;

     return new Enrollment.Builder().setEnrollmentId(enrollmentId)
             .setStudentId(studentId)
             .setCourseId(courseId)
             .setEnrollmentDate((LocalDate) enrollmentDate)
             .build();

    }
}
