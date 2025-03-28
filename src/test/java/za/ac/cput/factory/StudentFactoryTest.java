package ac.za.cput.factory;

import ac.za.cput.factory.StudentFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import ac.za.cput.domain.Student;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StudentFactoryTest {

    private static Student l1 = StudentFactory.createStudent("1245","Amy", "Good",
            "2223", "123");
    private static Student l2 = StudentFactory.createStudent("123456","Sinolo", "Pasta",
            "455566", "1235");
    private static Student l3 = StudentFactory.createStudent("1245","Cobey", "Gomez",
            "785578", "7654321098");

    @Test
    @Order(1)
    public void testCreateStudent() {
        assertNotNull(l1);
        System.out.println(l1);
    }

    @Test
    @Order(2)
    public void testCreateStudentWithAllAttributes() {
        assertNotNull(l2);
        System.out.println(l2.toString());
    }

    @Test
    @Order(3)
    public void testCreateStudentThatWillFail() {
        assertNull(l3);
        System.out.println("Student creation failed as expected.");
    }
}
