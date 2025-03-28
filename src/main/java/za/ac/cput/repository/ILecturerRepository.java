package ac.za.cput.repository;

import za.ac.cput.domain.Course;
import za.ac.cput.domain.Lecturer;

import java.util.List;

public interface ILecturerRepository extends IRepository <Lecturer,String>{

    List<Lecturer> getAll();



}
