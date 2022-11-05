package Handson;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaPrg3 {
    public static void main(String args[]) {
        Supplier<Integer> s = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 10;
            }
        };
        Consumer<String> c = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hiii");
            }
        };
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                System.out.println("integer " + integer);
                return false;
            }
        };
        Function<Integer, Integer> f = new Function<Integer, Integer>(){
            @Override
            public Integer apply(Integer integer) {

                System.out.println("integer " + integer);
                return null;
            }
        };
        s.get();
        c.accept("hii");
        p.test(200);
        f.apply(31);

    }

}

