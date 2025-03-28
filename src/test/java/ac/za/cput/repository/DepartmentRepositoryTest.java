package ac.za.cput.repository;

import ac.za.cput.domain.Department;
import ac.za.cput.factory.DepartmentFactory;
//import ac.za.cput.factory.courseFactory;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class CourseRepositoryTest {
    private static IDepartment repository = DepartmentRepository.getRepository();
    private DepartmentFactory departmentFactory;
    private Department department = departmentFactory.createDepartment("IT","223");


    @Test
    void a_create() {
        Deprtment create = repository.create(department);
        System.out.println(create);


    }

    @Test
    void b_read() {
        Department create = repository.create (department);
        Department read = repository.read(create.getDepartmentId());
        System.out.println(read);

    }

    @Test
    void c_update() {
        Department updateDepartment = new Department.Builder().copy(department).setDepartmentId("223").build();
        Department create = repository.create (department);
        Department read = repository.read(create.getDepartmentId());
        System.out.println(read);

    }

    @Test
    @Disabled
    void d_delete() {
        Department create = repository.create (department);
        assertTrue (repository.delete(create.getDepartmentId()));

    }

    @Test

    void e_getAll() {

        Department create = repository.create (department);
        List<Department> departmentList = repository.getAll(create);
        assertNotNull(departmentList);

    }
}