package se.lexicon.henric.Spring.models;

import se.lexicon.henric.Spring.data_access.StudentDao;

import java.util.List;
import java.util.Objects;

public class Student {

    static int _Counter;
    int id;
    String name;


    public Student(String name) {
        setName(name);
        this.id= ++_Counter;
    }

    /**
    * Getter for field id
     * @return field int id
    * */
    public int getId() {
        return id;
    }



    /**
     * Getter for field id
     * return field String name
     * */
    public String getName() {
        return name;
    }



    /**
     * Getter for field id
     * */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * no setter for field id
     * */




    /**
     * ---------------------- Equals, hashcode & toString -------------------------------------------------------
     * */


    /**
     * Indicates whether some other object is "equal to" this one.
     * * @param   obj   the reference object with which to compare.
     *      * @return  {@code true} if this object is the same as the obj
     *      *          argument; {@code false} otherwise.
     *      * @see     #hashCode()
     *      * @see     java.util.HashMap
     *      */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    /**
     * Returns a hash code value for the object. This method is
     * supported for the benefit of hash tables such as those provided by
     * {@link java.util.HashMap}. *
     *      * @return  a hash code value for this object.
     *      * @see     java.lang.Object#equals(java.lang.Object)
     *      * @see     java.lang.System#identityHashCode
     *      */

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return  a string representation of the object.
     */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
