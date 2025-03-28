package za.ac.cput.domain;

import java.time.LocalDate;

public class Enrollment {
    private String enrollmentId;
    private String studentId;
    private String courseId;
    private LocalDate enrollmentDate;

    private Enrollment(Builder builder) {
            this.enrollmentId = builder.enrollmentId;
            this.studentId = builder.studentId;
            this.courseId = builder.courseId;
            this.enrollmentDate = builder.enrollmentDate;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentId='" + enrollmentId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", enrollmentDate=" + enrollmentDate +
                '}';
    }

    public static class Builder {
        private String enrollmentId;
        private String studentId;
        private String courseId;
        private LocalDate enrollmentDate;

        public Builder setEnrollmentId(String enrollmentId) {
            this.enrollmentId = enrollmentId;
            return this;
        }
        public Builder setStudentId(String studentId){
            this.studentId = studentId;
            return this;
        }
        public Builder setCourseId(String courseId){
            this.courseId = courseId;
            return this;
        }
        public Builder setEnrollmentDate(LocalDate enrollmentDate){
            this.enrollmentDate = enrollmentDate;
            return this;
        }
        public Enrollment build(){
            return new Enrollment(this);
        }
    }
    }//End of class
