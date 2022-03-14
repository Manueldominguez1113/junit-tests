import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class StudentTest {
    Student student;
    Student invalidID;
    Student invalidName;
    Student invalidGrades;

    @Before
    public void setup() {
        student = new Student("Michael D.", 23451);
        student.addGrade(98);
        student.addGrade(87);
        student.addGrade(100);
        student.addGrade(91);
        student.addGrade(70);

        invalidID = new Student("Alex M.", 0);
        invalidName = new Student("", 12345);
        invalidGrades = new Student("bobby F.", 13245);

    }

    @Test
    public void isValidStudent() {
        assertEquals(23451, student.getId());
        assertEquals("Michael D.", student.getName());
        assertEquals(13245, invalidGrades.getId());
        assertEquals("bobby F.", invalidGrades.getName());
        assertNotEquals("", student.getName());
        assertNotEquals(0, student.getId());
        assertNotNull(student.getGrades());

    }
 @Test
    public void testAverage(){
     assertEquals(89.2,student.getGradeAverage(),0.5);

 }

 @Test
    public void updateGrade(){
     student.updateGrade(0,50);
     int grade = 50;
         assertSame(student.grades.get(0), grade);

    }
    @Test
    public void deleteGrade(){
        student.deleteGrade(0);
        int grade = 50;
        assertNotSame(student.grades.get(0), grade);
    }
}