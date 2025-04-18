package za.ac.cput.factory;

import za.ac.cput.domain.Lecturer;
import za.ac.cput.util.Helper;

public class LecturerFactory {
    public static Lecturer createLecturer(String lecturerID,String firstName, String lastName, String departmentID) {
        if (Helper.isNullOrEmpty(lecturerID) || Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)
        || Helper.isNullOrEmpty(departmentID)) {
            return null;
        }
        return new Lecturer.Builder()
                .setLecturerID(lecturerID).setFirstName(firstName)
                .setLastName(lastName).setDepartmentID(departmentID).build();
    }
}
