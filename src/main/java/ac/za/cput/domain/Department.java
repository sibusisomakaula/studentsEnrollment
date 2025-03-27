package ac.za.cput.domain;

import java.lang.module.ModuleDescriptor;
import java.util.Locale;

public class Department {
    private String departmentName;
    private String departmentId;


    private Department() {
    }
    private  Department(Builder builder){
        this.departmentName = builder.departmentName;
        this.departmentId = builder.departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }

    public static class Builder {
        private String departmentName;
        private String departmentId;

        public Builder setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public Builder setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Department build(){

            return new Department(this);}

    }
}
