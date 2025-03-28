package ac.za.cput.repository;

import ac.za.cput.domain.Course;
import ac.za.cput.factory.courseFactory;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
 @TestMethodOrder(MethodOrderer.MethodName.class)
class CourseRepositoryTest {
private static ICourseRepository repository = CourseRepository.getRepository();
private Course course = courseFactory.createCourse("ICT","12345","246810","369121");


    @Test
    void a_create() {
        Course create = repository.create(course);
        System.out.println(create);


    }

    @Test
    void b_read() {
        Course create = repository.create (course);
        Course read = repository.read(create.getCourseId());
        System.out.println(read);

    }

    @Test
    void c_update() {
        Course updateCourse = new Course.Builder().copy(course).setLecturerId("1234567").build();
        Course create = repository.create (course);
        Course read = repository.read(create.getCourseId());
        System.out.println(read);

    }

    @Test
    @Disabled
    void d_delete() {
        Course create = repository.create (course);
       assertTrue (repository.delete(create.getCourseId()));

    }

    @Test

    void e_getAll() {

        Course create = repository.create (course);
        List<Course> courseList = repository.getAll(create);
        assertNotNull(courseList);

    }
}