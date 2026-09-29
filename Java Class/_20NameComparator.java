import java.util.*;

class Student {
    int rollno;
    String name;
    int marks;

    Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return rollno + " " + name + " " + marks;
    }
}

class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.name.compareTo(s1.name);
    }
}

public class _20NameComparator {
    public static void main(String[] args) {
        Collection<Student> st = new ArrayList<>();

        st.add(new Student(103, "Rahul", 85));
        st.add(new Student(101, "Aman", 95));
        st.add(new Student(104, "Priya", 85));
        st.add(new Student(102, "Neha", 95));
        st.add(new Student(105, "Ravi", 75));

        List<Student> list = new ArrayList<>(st);

        Collections.sort(list, new StudentComparator());

        for (Student s : list)
            System.out.println(s);
    }
}