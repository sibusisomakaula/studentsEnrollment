package za.ac.cput;

import za.ac.cput.domain.Department;
import za.ac.cput.factory.DepartmentFactory;

public class MainDepartment {
    public static void main(String[] args) {

        Department department = DepartmentFactory.createDepartment("Finance");
        
        System.out.println("Department created successfully:");
        System.out.println(department);
    }

}
