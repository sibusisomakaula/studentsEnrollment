package ac.za.cput.repository;

import ac.za.cput.domain.Course;

public interface IRepository {
    void create(Course course);

    void read(String courseName);

    void update(Course course);

    void delete(String CourseName);
}
