package PractuceFive;

import PracticeOne.Student;

import java.util.function.Supplier;

public class Demo {

    static int getANumber()
    {
        return 1000;
    }

    public static void main(String[] args) {
        Supplier<String> s1 = ()-> "this message from the external class" ;
        String s = s1.get();
        System.out.println(s);

        Supplier<Student> s2 = ()-> new Student(1,"N1",500);
        System.out.println(s2.get());

        Supplier<Integer> s4 = Demo::getANumber;
        System.out.println(s4.get());
    }
}
