package kodlamaIoKatmanlÄ±Mimari.dataAccess;

import kodlamaIoKatmanlÄ±Mimari.entities.Course;

public class HibernateCourseDao implements CourseDao {

   

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanÄ±na eklendi : "+course.getCourseName());
        
    }
   

}
