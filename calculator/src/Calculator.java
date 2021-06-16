import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.function.Consumer;

public class Calculator {

    static public interface Supplier<T> {
        T get();
    }

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> divide = (x, y ) -> x / y; // ошибка деления на ноль

    BinaryOperator<Integer> divide = (x, y ) -> {
        try {
            if (y == 0)
                throw new ArithmeticException( "Деление на ноль запрещено. " );
            return x/y;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    };

        UnaryOperator<Integer> pow = x -> x * x;
        UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

        Predicate<Integer> isPositive = x -> x > 0;

        Consumer<Integer> println = System.out::println;

    }



