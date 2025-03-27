package ac.za.cput.domain;

public class Lecturer {
    private String lecturerID ;
    private String firstName;
    private String lastName;
    private String departmentID;

    private Lecturer() {
    }

   private Lecturer(Builder builder){
        this.lecturerID = builder.lecturerID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.departmentID = builder.departmentID;
   }


    public String getLecturerID() {
        return lecturerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lecturerID='" + lecturerID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", departmentID='" + departmentID + '\'' +
                '}';
    }

    public static class Builder {
        private String lecturerID ;
        private String firstName;
        private String lastName;
        private String departmentID;

        public Builder setLecturerID(String lecturerID) {
            this.lecturerID = lecturerID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setDepartmentID(String departmentID) {
            this.departmentID = departmentID;
            return this;
        }
        public Builder copy(Lecturer lecturer){
            this.lecturerID = lecturer.lecturerID;
            this.firstName = lecturer.firstName;
            this.lastName = lecturer.lastName;
            this.departmentID = lecturer.departmentID;
            return this;
        }
        public Lecturer build() {
            return new Lecturer(this);
        }
    }
}
