package PracticeTwo;

public class Demo {


    void fun1(Intr s)
    {
        System.out.println("The day is beautiful");
        s.display("Nilesh");
    }

    public static void main(String[] args) {


        Demo n = new Demo();
//        n.fun1(new IntrImpl());
//
//        Intr i1 = s-> System.out.println("Welcome " + s);

        n.fun1(s-> System.out.println("Welcome Using LE " + s));
    }

}
