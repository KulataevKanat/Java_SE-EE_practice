package Lambda;

public class PrintTest implements Printable, NewPrintable {
    @Override
    public String print(int year) {
        return null;
    }

    @Override
    public void print(String st) {

    }

    public static void main(String[] args) {

        Printable prLambda = (text) -> {
            System.out.println("Printing");

        };

        prLambda.print("Проверочная страница печати");


        BanalPrintable banalPrintable = () -> "Я старый принтер";

        System.out.println(banalPrintable.print());

        NewPrintable newPrintable = (year) -> {
            if (year < 2015) {
                return "Я старый принтер";
            } else {
                return "Я новый принтер";
            }
        };

        System.out.println(newPrintable.print(2019));

    }
}