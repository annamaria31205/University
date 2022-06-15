import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
public class StudentRepositoryTest {
    StudentRepository studentRepository;
    Student student1;
    Student student2;
    Student student3;
    Address address1;
    Address address2;
    Address address3;

    @Test
    public void getAllStudents(){

        student1= new Student("Vasyatest", "Zhyk", 17, address1);
        student2= new Student("Maryiatest", "Kashevich", 18, address2);
        student3= new Student("Karltest", "Zhyk", 16, address1);
        List<Student> expected = Student.getAllStudents();


        List<Student> actual = new ArrayList<>();
        actual.add(student1);
        actual.add(student2);
        actual.add(student3);

        Assert.assertNull(StudentRepository.allStudents);
        Assert.assertEquals(expected, actual);



    }
}
