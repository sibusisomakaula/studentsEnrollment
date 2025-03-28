package za.ac.cput.domain;
import java.time.LocalDate;


public class Student {

    private String  studentID;
    private String  firstName;
    private String  lastName;
    private String  studentEmail;
    private String  departmentID;

    public Student() {

    }
    private Student(Builder builder) {

        this.studentID = builder.studentID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.studentEmail = builder.studentEmail;
        this.departmentID = builder.departmentID;







    }

    public String getstudentID() {
        return studentID;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getEmail() {
        return studentEmail;
    }

    public String getdepartmentID() {
        return departmentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", departmentID='" + departmentID + '\'' +
                '}';
    }

    public static class Builder {
        private String studentID;

        private String firstName;
        private String lastName;
        private String studentEmail;
        private String departmentID;

        public Builder studentID(String studentID) {
            this.studentID = studentID;
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;

        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder studentEmail(String studentEmail) {
            this.studentEmail = studentEmail;
            return this;
        }
        public Builder departmentID(String departmentID) {
            this.departmentID = departmentID;
            return this;


            }



        }
    }
