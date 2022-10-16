public class Main {
    public static void main(String[] args) {
        MyLambda lm = (a,b,c) ->  new Student(a,b.toUpperCase(),c+100);

        Student result = lm.print(1,"Nilesh",500);

        System.out.println(result);

    }
}
