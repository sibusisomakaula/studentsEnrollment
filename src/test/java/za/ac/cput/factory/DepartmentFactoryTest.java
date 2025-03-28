package ac.za.cput.factory;

import ac.za.cput.domain.Department;
import ac.za.cput.repository.DepartmentRepository;
import ac.za.cput.repository.IDepartmentRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class DepartmentFactoryTest {
    private static DepartmentFactory DepartmentFactory;
    private static Department d1 = DepartmentFactory.createDepartment("IT", "223");
    private static Department d2 = DepartmentFactory.createDepartment("HR", "432");
    private static Department d3 = DepartmentFactory.createDepartment("ADMIN", "828");

    @Test
    @Order(1)
    public void testCreateDepartment() {
        assertNotNull(c1);
        System.out.println(c1);

    }

    @Test
    @Order(2)
    public void testCreateDepartmentWithAllAttributes() {
        assertNotNull(c2);
        System.out.println(c2.toString());
    }

    @Test
    @Order(3)
    public void testCreateDepartmentThatWillFail() {
        assertNotNull(c3);
        System.out.println("department creation failed");


    }
}