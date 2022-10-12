package kodlamaIoKatmanlıMimari;

import kodlamaIoKatmanlıMimari.core.logging.DtabaseLogger;
import kodlamaIoKatmanlıMimari.core.logging.FileLogger;
import kodlamaIoKatmanlıMimari.core.logging.Logger;
import kodlamaIoKatmanlıMimari.business.CourseManager;
import kodlamaIoKatmanlıMimari.dataAccess.HibernateCourseDao;
import kodlamaIoKatmanlıMimari.entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {

        Course course1 = new Course(1, "Javascript ", "Frontend", "Engin", "Demiroğ", 10);
        Course course2 = new Course(2, ".NET", "Programlama", "Engin", "Demiroğ", 1);

        Logger[] loggers = { new DtabaseLogger(), new FileLogger() };
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);
        courseManager.add(course2);

    }
}
