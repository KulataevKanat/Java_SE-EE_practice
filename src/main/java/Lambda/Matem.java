package Lambda;

public class Matem implements Countable {
    @Override
    public double func(double a, double b) {
        return 0;
    }

    static double variableA = 0;

    public static void main(String[] args) {
        // double localA = 0;

        Countable cPlus = (a, b) -> {

            variableA = a;

            return a + b;

        };

        System.out.println(cPlus.func(90, 972));

        Countable cPow = (a, b) ->
                Math.pow(a, b);
        System.out.println(cPow.func(2, 5));

        Countable cMult = (a, b) ->
                a * b;

        System.out.println(cMult.func(20, 5));
    }
}
