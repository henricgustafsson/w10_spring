package main;

import config.CompontentScanConfig;
import data_access.StudentDao;
import data_access.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {
        /*Keep*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CompontentScanConfig.class);

      //  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");

        StudentDao studentDao = context.getBean(StudentDao.class);

    }

}
