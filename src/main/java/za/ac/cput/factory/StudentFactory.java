package za.ac.cput.factory;

import za.ac.cput.domain.Student;

import za.ac.cput.util.Helper;

public class StudentFactory {

   public static Student createStudent(String studentID,
                                        String firstName,
                                        String lastName,
                                        String studentEmail,
                                        String departmentID) {
        if (Helper.isNullOrEmpty(studentID) ||
            Helper.NullOrEmpty(firstName) ||
                 Helper.isNullOrEmpty(lastName) ||
                Helper.isNullOrEmpty(studentEmail) ||
                 Helper.isNullOrEmpty(departmentID))
                 
        {
            return null;
        }

        return new Student.Builder()
                .setStudentName(studentID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setStudentEmail(studentEmail)
                .setDepartmentID(departmentID)
                .build();
    }

}




