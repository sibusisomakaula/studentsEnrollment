package ac.za.cput.repository;

import ac.za.cput.domain.Course;

public interface IRepository<Course,courseId> {

    Course create(Course course);

    Course read(courseId courseid);

    Course update(Course course);

    boolean delete(courseId courseid);
}
