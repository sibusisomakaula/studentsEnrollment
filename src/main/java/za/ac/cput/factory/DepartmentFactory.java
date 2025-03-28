package za.ac.cput.factory;


import za.ac.cput.domain.Department;
import java.util.UUID;

public class DepartmentFactory {
    public static Department createDepartment(String departmentName) {
        if (departmentName == null || departmentName.isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be empty");
        }

        String departmentId = UUID.randomUUID().toString();
        return new Department.Builder()
                .setDepartmentName(departmentName)
                .setDepartmentId(departmentId)
                .build();
    }
}
