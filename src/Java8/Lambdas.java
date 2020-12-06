package Java8;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdas {
    public static void main(String[] args) {
        Predicate<String> pred = s -> s.length() < 10;
        System.out.println(pred.test("jading"));

        Consumer<String> print = System.out::println;
        print.accept("Hell mfs");
    }
}
