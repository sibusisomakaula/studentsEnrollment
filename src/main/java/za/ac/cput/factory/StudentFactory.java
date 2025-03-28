package za.ac.cput.factory;

import za.ac.cput.domain.Student;



public class StudentFactory {

    public static Student createStudent(String studentID,
                                        String firstName,
                                        String lastName,
                                        String studentEmail,
                                        String departmentID) {
        if (studentID == null || studentID.isEmpty() ||
                firstName == null || firstName.isEmpty() ||
                lastName == null || lastName.isEmpty() ||
                studentEmail == null || studentEmail.isEmpty() ||
                departmentID == null || departmentID.isEmpty())
        {
            return null;
        }

        return new Student.Builder()
                .studentID(studentID)
                .firstName(firstName)
                .lastName(lastName)
                .studentEmail(studentEmail)
                .departmentID(departmentID)
                .build();
    }

}




