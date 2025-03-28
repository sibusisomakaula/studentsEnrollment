package ac.za.cput.repository;

import ac.za.cput.domain.Lecturer;
//import ac.za.cput.factory.courseFactory;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
class LecturerRepositoryTest {
    private static ILecturerRepository repository = LecturerRepository.getRepository();
    private ac.za.cput.factory.LecturerFactory LecturerFactory;
    private Lecturer lecturer = LecturerFactory.createLecturer("ICT032","Emily","Smith","ICT032");


    @Test
    void a_create() {
        Lecturer create = repository.create(lecturer);
        System.out.println(create);


    }

    @Test
    void b_read() {
        Lecturer create = repository.create (lecturer);
        Lecturer read = repository.read(create.getLecturerID());
        System.out.println(read);

    }

    @Test
    void c_update() {
        Lecturer updateLecturer = new Lecturer.Builder().copy(lecturer).setLecturerID("1234567").build();
        Lecturer create = repository.create (lecturer);
        Lecturer read = repository.read(create.getLecturerID());
        System.out.println(read);

    }

    @Test
    @Disabled
    void d_delete() {
        Lecturer create = repository.create (lecturer);
        assertTrue (repository.delete(create.getLecturerID()));

    }

    @Test

    void e_getAll() {

        Lecturer create = repository.create (lecturer);
        List<Lecturer> lecturerList = repository.getAll();
        assertNotNull(lecturerList);

    }
}

