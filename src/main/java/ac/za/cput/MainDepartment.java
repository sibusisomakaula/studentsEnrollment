package ac.za.cput;


import ac.za.cput.domain.Department;
import ac.za.cput.factory.DepartmentFactory;

public class MainDepartment {

    public static void main(String[] args) {

        Department department = DepartmentFactory.createDepartment("Finance");


        System.out.println("Department created successfully:");
        System.out.println(department);
    }

}
