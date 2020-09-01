import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int total = 0;
        for(int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }
}
