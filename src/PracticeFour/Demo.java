package PracticeFour;

import PracticeOne.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println("Welcome : " + s);
        c1.accept("Nilesh");

        Consumer<Student> s1 = s-> System.out.println("Roll no is : " + s.getRollNo()
                + "\n" + "Name is : " + s.getName() + "\n" + "Marks is : " + s.getMarks());

        s1.accept(new Student(1,"N1",100));

        List<String> names = Arrays.asList("Nilesh","Ravi","Mohit","aanand","vinay");
        names.forEach(s -> System.out.println(s.toUpperCase()));
        names.forEach(s -> System.out.println(s));
        names.forEach(System.out::println);
    }
}
