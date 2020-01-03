package se.lexicon.henric;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.henric.config.ComponentScanConfig;
import se.lexicon.henric.data_access.StudentDao;
import se.lexicon.henric.util.UserInputService;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        UserInputService userInputService = context.getBean(UserInputService.class);
        context.close();

    }
}
