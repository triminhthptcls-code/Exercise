package student;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        st1.setProfile("john", 9);
        st2.setProfile("tri", 10);
        System.out.println(st1.isPassed(st1));
        System.out.println(st2.isPassed(st2));

    }

}
