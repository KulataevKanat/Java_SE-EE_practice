package Lambda;

public class AnonymicClass {
    public static void main(String[] args) {
        new Thread((new Runnable() {
            @Override
            public void run() {
                System.out.println("Анонимный вызовв ");
            }
        })).start();

        new Thread(
                () -> {
                    System.out.println("Я лямбда");
                    System.out.println();
                }).start();
    }
}
