import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void studentConstructorTest() {
        Student student = new Student("Dylan",0);
        assertNotNull(student.getName());
        assertEquals(0,student.getId());
        assertNotNull(student.getGrades());
        assertTrue(student.getGrades().isEmpty());
    }

    @Test
    public void studentAddGrade() {
        Student student = new Student("Dylan",0);
        assertTrue(student.getGrades().isEmpty());
        student.addGrade(12);
        assertEquals(1,student.getGrades().size());
    }

    @Test
    public void studentChangeNameID() {
        Student student = new Student("Dylan",0);
        student.setName("Austin");
        student.setId(12);
        assertNotEquals("Dylan",student.getName());
        assertNotEquals(0,student.getId());
    }

    @Test
    public void studentGradeAverage() {
        Student student = new Student("Dylan",0);
        student.addGrade(100);
        student.addGrade(82);
        student.addGrade(95);
        student.addGrade(99);
        student.addGrade(85);
        assertEquals(5,student.getGrades().size());
        assertEquals(92.2,student.getGradeAverage(),0.1);

    }
}
