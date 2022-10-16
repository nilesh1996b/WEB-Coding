package PracticeFive;

import PracticeOne.Student;

import java.util.function.Function;

public class MyFunction implements Function<Student,String> {
    @Override
    public String apply(Student s) {
//        if(s.getMarks()>500)
//            return "Pass";
//            else
//                return "fail";

        return s.getMarks()>500?"Pass":"Fail";
    }
}
