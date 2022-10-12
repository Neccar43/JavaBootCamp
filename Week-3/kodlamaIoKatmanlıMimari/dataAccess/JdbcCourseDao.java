package kodlamaIoKatmanlıMimari.dataAccess;

import kodlamaIoKatmanlıMimari.entities.Course;

public class JdbcCourseDao implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile veritabanına eklendi : "+course.getCourseName());
    }

}
