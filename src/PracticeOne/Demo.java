package PracticeOne;


import java.util.*;

public class Demo {



    public static void main(String[] args) {
        List<Student> li = new ArrayList<>();

        li.add(new Student(1,"N1",500));
        li.add(new Student(2,"N2",550));
        li.add(new Student(3,"N3",200));
        li.add(new Student(4,"N4",100));

        li.removeIf(n->n.getMarks()<=100);
        Collections.sort(li,(o1,o2)-> o1.getMarks()>o2.getMarks()?+1:-1);

        li.forEach(s-> {
            System.out.println(s.getRollNo());
            System.out.println(s.getName());
            System.out.println(s.getMarks());
                    System.out.println("---------------");
        }
        );

//        System.out.println(li);
    }


}
