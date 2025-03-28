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
        Student created = repository.create(student);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void read() {
        Student create = repository.create(student);
        Student read = repository.read(created.getStudentID());
        System.out.println("Id: " + created.getStudentID());
        assertNotNull(read);
    }

    @Test
    void update() {
        Student updateStudent = new Student.Builder().copy(student).setStudentEmail("studentDJ@gmail.com").build();
        repository.create(student);
        Student updated = repository.update(updatedStudent);
        assertNotNull(updatedStudent);
        System.out.println("New Student" + updated);
    }

    @Test
    void delete() {
        Student created = repository.create(student);
        boolean deleted = repository.delete(created.getStudentID));
        assertTrue(deleted);
    }

    @Test
    void getAll() {
         repository.create(student);
        List<Student> studentList = repository.getAll();
        assertNotNull(studentList);
        assertFalse(studentList.isEmpty());
        System.out.println(studentList);
    }
}
