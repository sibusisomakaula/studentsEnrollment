package ac.za.cput.Factory;

import ac.za.cput.domain.Lecturer;
import ac.za.cput.util.Helper;

public class lecturerFactory {
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
