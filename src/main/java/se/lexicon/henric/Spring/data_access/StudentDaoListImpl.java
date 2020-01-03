package se.lexicon.henric.Spring.data_access;

import org.springframework.stereotype.Component;
import se.lexicon.henric.Spring.models.Student;

import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao  {

    List<Student> students;

    /*
     * TODO: fully implement method StudentDaoListImpl.Save*/
    @Override
    public Student save(Student student) {
        return null;
    }

    /*
     * TODO: fully implement method StudentDaoListImpl.find*/
    @Override
    public Student find(int id) {
        return null;
    }

    /*
     * TODO: fully implement method StudentDaoListImpl.findAll*/
    @Override
    public List<Student> findAll() {
        return null;
    }
    /*
     * TODO: fully implement method StudentDaoListImpl.Delete*/
    @Override
    public void delete(int id) {


    }



}
