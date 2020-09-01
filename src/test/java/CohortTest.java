import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    @Test
    public void canAddStudent() {
        Cohort hyperion = new Cohort();
        Student dylan = new Student(0,"Dylan");
        assertTrue(hyperion.getStudents().isEmpty());
        hyperion.addStudent(dylan);
        assertEquals(1,hyperion.getStudents().size());
    }

    @Test
    public void canGetStudents() {
        Cohort hyperion = new Cohort();
        Student dylan = new Student(0,"Dylan");
        Student austin = new Student(1,"Austin");
        hyperion.addStudent(dylan);
        hyperion.addStudent(austin);
        assertEquals(2,hyperion.getStudents().size());
        assertEquals(austin,hyperion.getStudents().get(1));
        assertEquals(dylan,hyperion.getStudents().get(0));
    }

    @Test
    public void canGetAverage() {
        Cohort hyperion = new Cohort();
        Student dylan = new Student(0,"Dylan");
        Student austin = new Student(1,"Austin");
        hyperion.addStudent(dylan);
        hyperion.addStudent(austin);

        austin.addGrade(100);
        austin.addGrade(92);
        austin.addGrade(95);
        austin.addGrade(98);
        austin.addGrade(97);
        // 96.4

        dylan.addGrade(88);
        dylan.addGrade(90);
        dylan.addGrade(79);
        dylan.addGrade(94);
        dylan.addGrade(83);
        // 86.8


        assertEquals(91.6,hyperion.getCohortAverage(),0.1);
    }
}
