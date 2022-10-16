package PracticeThree;

import PracticeTwo.Intr;
import PracticeTwo.IntrImpl;

public class Demo {

    Intr fun1(){
        System.out.println("inside fun1 of Demo ");

        return n-> System.out.println("Welcome my friend " + n);
    }

    public static void main(String[] args) {

        Demo x = new Demo();
        x.fun1().display("Nilesh");

    }

}
