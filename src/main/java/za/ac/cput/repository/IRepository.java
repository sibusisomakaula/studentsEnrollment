package za.ac.cput.repository;

public interface IRepository<Course,courseId> {

    Course create(Course course);

    Course read(courseId courseid);

    Course update(Course course);

    boolean delete(courseId courseid);
}
