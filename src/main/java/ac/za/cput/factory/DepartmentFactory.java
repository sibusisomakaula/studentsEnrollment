package ac.za.cput.factory;


import ac.za.cput.domain.Department;
import java.util.UUID;

public class departmentFactory {
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
