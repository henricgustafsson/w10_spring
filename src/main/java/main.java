import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

    public static void main(String[] args) {

      AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ApplicationContext.class);



        //TODO P2- test dependency injection by adding bean when scanner bean is done
        /*Scannerbean, a Scanner object should be ready to be injected using Constructor-injection,
         Setterinjection or Fieldinjectionusing @Autowired.

        AnnotationConfigApplicationContextcontext =
        new AnnotationConfigApplicationContext(yourConfigClass.class);
        UserInputServiceuserInputService= context.getBean(UserInputService.class);

        TODO: create StudentManagementConsoleImp that IMPLEMENTS <<interface>> StudentManagement

        /*<<interface>>StudentManagement
        Student create()
        Student save(Student student)
        Student find()
        Student remove(int id)
        List<Student> findAll()
        Student edit(Student student)
                ^
                |
        StudentManagementConsoleImpl IMPLEMENTS StudentManagement
                |
         */
         /*StudentManagementConsoleImpl
         UserInputService scannerService
         StudentDao studentDao
                <>
                 |
         Dependency Injection <<interface>> UserInputService set up in Assigment 2
         Dependency Injection <<interface>> StudentDao
         */

         //TODO: DONE now pat yourself on the back & have a beer!



    }
}
