package ac.za.cput.Factory;

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
    private static Lecturer L1 = LecturerFactory.createLecturer("ESCS02", "Emily", "Smith", "CS02");
    private static Lecturer L2 = LecturerFactory.createLecturer("JBICT03", "John", "Brown", "ICT03");
    private static Lecturer L3 = LecturerFactory.createLecturer("FLBM04", "Fred","Luke", "BM04");

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
        System.out.println(L2.toString());
    }

    @Test
    @Order(3)
    public void testLecturerCourseThatWillFail() {
        assertNotNull(L3);
        System.out.println("Lecturer creation failed");


    }
}