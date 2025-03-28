package za.ac.cput.factory;

import za.ac.cput.domain.Course;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)

class courseFactoryTest {

    private static Course c1 = courseFactory.createCourse("ICT", "13232", "424242", "92929");
    private static Course c2 = courseFactory.createCourse("comp science", "432", "21212", "88181");
    private static Course c3 = courseFactory.createCourse("business man", "828282", "01018887", "343344");

    @Test
    @Order(1)
    public void testCreateCourse() {
        assertNotNull(c1);
        System.out.println(c1);

    }

    @Test
    @Order(2)
    public void testCreateCourseWithAllAttributes() {
        assertNotNull(c2);
        System.out.println(c2.toString());
    }

    @Test
    @Order(3)
    public void testCreateCourseThatWillFail() {
        assertNotNull(c3);
        System.out.println("course creation failed");


    }
}