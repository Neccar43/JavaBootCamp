package kodlamaIoKatmanlÄ±Mimari.dataAccess;

import kodlamaIoKatmanlÄ±Mimari.entities.Course;

public class JdbcCourseDao implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile veritabanÄ±na eklendi : "+course.getCourseName());
    }

}
