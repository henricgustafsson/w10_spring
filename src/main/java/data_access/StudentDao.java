package data_access;

import models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;


public interface StudentDao {

    Student save(Student student);
    Student find(int id);
    List<Student> findall();
    void delete(int id);
}
