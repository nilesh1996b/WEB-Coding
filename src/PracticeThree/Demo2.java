package PracticeThree;

import java.util.function.Predicate;

public class Demo2 implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {

        return integer<=0;
    }
}


