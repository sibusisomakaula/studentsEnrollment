package ac.za.cput.repository;

import ac.za.cput.domain.Student;
import ac.za.cput.factory.StudentFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class StudentRepositoryTest {

    private static IStudentRepository repository = StudentRepository.getInstance();
    private Student student = StudentRepository.createStudent("12345", "Dan" ,"Jacobs", "studentDJ@gmail.com", "CS01");;


    @Test
    void create() {
        Student create = repository.create(student);
        System.out.println(create);
    }

    @Test
    void read() {
        Student create = repository.create(student);
        Student read = repository.read(create.getStudentID());
        System.out.println("Id: " + Student.getStudentID());
        assertNotNull(read);
    }

    @Test
    void update() {
        Student updateStudent = new Student().Builder().copy(student).setStudentEmail("studentDJ@gmail.com").build();
        Student createStudent = repository.create(create());
        Student updatedStudent = repository.update(createStudent);
        assertNotNull(updatedStudent);
        System.out.println("New Student: " + updatedStudent);
    }

    @Test
    void delete() {
        Student create = repository.create(student);
        assertTrue(repository.delete(create.getStudentID()));
    }

    @Test
    void getAll() {
        Student create = repository.create(student);
        List<Student> StudentList = repository.getAll(create);
        assertNotNull(StudentList);
        System.out.println(StudentList);
    }
}
