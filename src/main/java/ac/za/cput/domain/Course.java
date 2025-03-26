package ac.za.cput.domain;

import java.lang.module.ModuleDescriptor;
import java.util.Locale;

public class Course {
    private String courseName;
    private String courseId;
    private String lecturerId;
    private String departmentId;

    private Course() {
    }
        private  Course(Builder builder){
            this.courseName = builder.courseName;
            this.courseId = builder.courseId;
            this.lecturerId = builder.lecturerId;
            this.departmentId  = builder.departmentId;
        }


    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseId='" + courseId + '\'' +
                ", lecturerId='" + lecturerId + '\'' +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }

    public static class Builder {
        private String courseName;
        private String courseId;
        private String lecturerId;
        private String departmentId;

        public Builder setCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public Builder setCourseId(String courseId) {
            this.courseId = courseId;
            return this;
        }

        public Builder setLecturerId(String lecturerId) {
            this.lecturerId = lecturerId;
            return this;
        }

        public Builder setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Course build(){return new Course(this);}
    }
}
