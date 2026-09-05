package Lambda_expression.function;


import java.util.function.Function;

////function chaining
/// andThen
/// compose

public class Demo3 {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = x -> x * 2;
        Function<Integer, Integer> f2 = x -> x * x * x;

        System.out.println(f1.andThen(f2).apply(2));///f1 execute first then f2
        System.out.println(f1.compose(f2).apply(2));///f2 execute fisrt then f1
    }
}