package ac.za.cput.factory;

import ac.za.cput.Factory.LecturerFactory;
import ac.za.cput.domain.Lecturer;
import ac.za.cput.repository.LecturerRepository;
import ac.za.cput.repository.ILecturerRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class LecturerFactoryTest {
    private static LecturerFactory LecturerFactory;
    private static Lecturer L1 = LecturerFactory.createLecturer("IT03", "Emily","Smith", "ITO32");
    private static Lecturer L2 = LecturerFactory.createLecturer("HR03", "Becky","Brown","HR032");
    private static Lecturer L3 = LecturerFactory.createLecturer("AD03", "Sam","Luck","AD032");

    @Test
    @Order(1)
    public void testCreateLecturer() {
        assertNotNull(L1);
        System.out.println(L1);

    }

    @Test
    @Order(2)
    public void testCreateLecturerWithAllAttributes() {
        assertNotNull(L2);
        System.out.println(l2.toString());
    }

    @Test
    @Order(3)
    public void testCreateLecturerThatWillFail() {
        assertNotNull(L3);
        System.out.println("department creation failed");


    }
}