package PracticeThree;

import PracticeOne.Student;
import PracticeTwo.Intr;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> l = n-> n<=0;

        System.out.println(l.test(1));

        Predicate<Student> s1 = n->n.getMarks()>700;
        Boolean x = s1.test(new Student(1,"nilesh",500));
        System.out.println(x);



    }
}
