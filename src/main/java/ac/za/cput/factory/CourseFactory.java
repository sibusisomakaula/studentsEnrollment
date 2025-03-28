package ac.za.cput.factory;

import ac.za.cput.domain.Course;
import ac.za.cput.util.Helper;

public class CourseFactory {
    public static Course createCourse(String courseName, String courseId, String lecturerId,String departmentId) {
        if (Helper.isNullOrEmpty(courseName) || Helper.isNullOrEmpty(courseId) || Helper.isNullOrEmpty(lecturerId)|| Helper.isNullOrEmpty(departmentId))
            return null;

        return new Course.Builder().setCourseName(courseName)
                .setCourseId(courseId)
                .setLecturerId(lecturerId)
                .setDepartmentId(departmentId)
                .build();
    }
}


