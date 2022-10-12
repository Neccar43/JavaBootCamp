package kodlamaIoKatmanlıMimari.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoKatmanlıMimari.core.logging.Logger;
import kodlamaIoKatmanlıMimari.dataAccess.CourseDao;
import kodlamaIoKatmanlıMimari.entities.Course;

public class CourseManager {
    List<String> courseList = new ArrayList<String>();
    CourseDao courseDao;
    Logger loggers[];
    public CourseManager(CourseDao courseDao,Logger[] logger) {
        this.courseDao = courseDao;
        this.loggers= logger;
    }

    public void add(Course course) throws Exception {

        if (courseList.contains(course.getCatagory())) {
            throw new Exception("Aynı Katogoride İki Kurs Olamaz!");
        }
        if (courseList.contains(course.getCourseName())) {
            throw new Exception("Aynı İsimde İki Kurs Olamaz!");
        }

        if (course.getPrice() < 0) {
            throw new Exception("Kurs Fiyatı 0 dan Küçük Olamaz!");
        }

        courseList.add(course.getCatagory());
        courseList.add(course.getCourseName());
        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.logging(course.getCourseName());
        }

    }

}
