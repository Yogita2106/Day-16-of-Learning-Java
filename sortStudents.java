package list;

import java.util.Comparator;
import java.util.LinkedList;

public class sortStudents {
    String name;
    int marks;

    public sortStudents(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + "(" + marks + ")";
    }

    public static void main(String[] args) {
        LinkedList<sortStudents> people = new LinkedList<>();
        people.add(new sortStudents("Yogita", 89));
        people.add(new sortStudents("Chhavi", 75));
        people.add(new sortStudents("Tisha", 97));
        System.out.println(people);

        people.sort(Comparator.comparing((sortStudents p) -> p.marks).reversed());
        System.out.println("Sorted by marks");
        for (sortStudents s : people) {
            System.out.println(s);
        }
    }
}

