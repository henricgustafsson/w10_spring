package data_access;

import models.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDaoImpl {
    List<Student> students;

    public StudentDaoImpl(List<Student> students) {
        this.students = students;
    }
}
