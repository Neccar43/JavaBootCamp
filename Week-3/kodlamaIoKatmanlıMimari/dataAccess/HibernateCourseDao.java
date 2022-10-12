package kodlamaIoKatmanlıMimari.dataAccess;

import kodlamaIoKatmanlıMimari.entities.Course;

public class HibernateCourseDao implements CourseDao {

   

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi : "+course.getCourseName());
        
    }
   

}
