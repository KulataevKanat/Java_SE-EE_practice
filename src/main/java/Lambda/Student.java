package Lambda;

public class Student implements Testable {
    @Override
    public void passTheTest(String name) {
        System.out.printf("Я студент %s сдаю тест", name);
    }

    public static void main(String[] args) {
        Student ivan = new Student();
        ivan.passTheTest("Иван");

        Testable anon = new Testable() {
            @Override
            public void passTheTest(String name) {
                System.out.printf("\nЯ %s не студент сдаю тест", name);

            }
        };
        anon.passTheTest("Petr");
        anon.passTheTest("Sergey");

        Testable anonLamda = (name) -> {
            System.out.printf("\nЯ %s ученый но сдаю тест ", name);
        };

        anonLamda.passTheTest("Хаскелл Карри");
        anonLamda.passTheTest("Алонзо Чёрч");
    }
}
