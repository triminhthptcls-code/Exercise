package student;

public class Student {
    private String name;
    private double gpa;

    public void setProfile(String fullname, double gpa) {
        this.name = fullname;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public double getGpa() {
        return this.gpa;

    }

    public boolean isPassed(Student student) {
        return student.getGpa() >= 5.00;
    }
}
