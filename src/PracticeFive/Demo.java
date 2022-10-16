package PracticeFive;

import PracticeOne.Student;

import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Function<Student,String> s = n->n.getMarks()>500?"Pass":"Fail";
        String result = s.apply(new Student(1,"N1",400));
        System.out.println(result);
    }
}
