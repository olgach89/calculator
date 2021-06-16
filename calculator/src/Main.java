public class Main {

    public static void main(String[] args) {
	// write your code here

        Calculator calc = Calculator.instance.get();


        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b); // ошибка деления на ноль


        calc.println.accept(c);

    }
}
