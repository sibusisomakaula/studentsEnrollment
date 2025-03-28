package za.ac.cput.repository;

import za.ac.cput.domain.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository implements ICourseRepository {

  private static ICourseRepository repository = null;
  private List<Course>courseList;


  private CourseRepository(){
      courseList = new ArrayList<Course>();

  }
  public static ICourseRepository getRepository(){
      if(repository == null){
          repository = new CourseRepository();
      }
      return repository;
  }

    @Override
    public Course create(Course course) {
        boolean success = courseList.add(course);
        if(success){
            return course;
        }
        return null;
    }

    @Override
    public Course read(String courseid) {
       for(Course c : courseList){
           if(c.getCourseId().equals(courseid))
               return c;
       }
       return null;
    }

    @Override
    public Course update(Course course) {
        String courseid = course.getCourseId();
        Course courseold = read(courseid);
        if (courseold == null)
            return null;
        boolean success = delete(courseid);
        if (success) {
            if (courseList.add(course));

        }
        return course;
    }


    @Override
    public boolean delete(String courseid) {
       Course courseToDelete = read(courseid);
       if(courseToDelete == null)
           return false;
       return(courseList.remove(courseToDelete));
    }

    @Override
    public List<Course> getAll(Course courseAll) {
        return courseList;
    }
}
