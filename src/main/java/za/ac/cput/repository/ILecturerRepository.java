package ac.za.cput.repository;

import ac.za.cput.domain.Course;
import ac.za.cput.domain.Lecturer;

import java.util.List;

public interface ILecturerRepository extends IRepository <Lecturer,String>{

    List<Lecturer> getAll();



}
