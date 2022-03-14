import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort cohort;
    Cohort cohortWithJack;
    Student jack;


    @Before
    public void setup() {
        cohort = new Cohort();
        cohortWithJack = new Cohort();
        jack = new Student(12345, "Jack");
        cohortWithJack.addStudent(jack);
    }


    @Test
    public void createsList() {

        assertEquals(cohort.getStudents(), new ArrayList<Student>());

    }

    @Test
    public void addStudent() {

        Student first = cohortWithJack.getStudents().get(0);
        assertEquals(jack, first);
    }

    @Test
    public void findStudentByIds() {

        assertEquals(cohortWithJack.findStudentById(jack.getId()), jack.getName());
    }
}
