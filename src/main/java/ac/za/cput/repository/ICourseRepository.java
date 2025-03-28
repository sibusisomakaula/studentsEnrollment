package ac.za.cput.repository;

import ac.za.cput.domain.Course;

import java.util.List;

public interface ICourseRepository extends IRepository<Course,String>{

    List<Course> getAll(Course courseAll);



}
