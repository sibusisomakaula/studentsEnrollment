package ac.za.cput.repository;

import za.ac.cput.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository{

    private static IStudentRepository repository = null;
    private List<Student> studentList;

    private StudentRepository(){
        studentList = new ArrayList<>();
    }

    public static IStudentRepository getInstance(){
        if(repository == null){
            repository = new StudentRepository();
        }
        return repository;
    }

    @Override
    public Student create(Student student) {
        boolean success = studentList.add(student);
        if(success){
            return student;
        }
        return null;
    }

    @Override
    public Student read(String courseid) {
        for (Student student : studentList) {
            if(student.getdepartmentID().equals(courseid)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student update(Student student) {
        String Id = student.getdepartmentID();
        Student updatedStudent = read(Id);
        if(updatedStudent == null) {
            return null;
        }

        boolean success = studentList.add(updatedStudent);
        if(success){
            if(studentList.add(student))
                return student;

        }
        return null;
    }

    @Override
    public boolean delete(String courseid) {
        Student studentDelete = read(courseid);
        if(studentDelete == null){
            return false;
        }
        return studentList.remove(studentDelete);
    }

    @Override
    public List<Student> getAll(Student student) {
        return studentList;
    }
}
