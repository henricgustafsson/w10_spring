package se.lexicon.henric.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.henric.ComponentScanConfig;
import se.lexicon.henric.Spring.data_access.StudentDao;
import se.lexicon.henric.Spring.data_access.StudentDaoListImpl;
import se.lexicon.henric.Spring.util.UserInputService;
import se.lexicon.henric.UserInputServiceConfig;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);

		StudentDao studentDao = context.getBean(StudentDao.class);

		context.close();

		/**
		 *  	TODO: fix beans.factory.UnsatisfiedDependencyException
		 *
		 *		Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException:
		 *		Error creating bean with name 'scannerInputService' defined in file [...]
		 *		se\lexicon\henric\Spring\util\ScannerInputService.class]:
		 *		Unsatisfied dependency expressed through constructor parameter 0;
		 *		nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException:
		 *		No qualifying bean of type 'java.util.Scanner' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
		 *

		//exception caused here
		AnnotationConfigApplicationContext inputContext = new AnnotationConfigApplicationContext(UserInputServiceConfig.class);

		UserInputService userInputService = context.getBean(UserInputService.class);

		context.close();
**/
		SpringApplication.run(Application.class, args);
	}

}
