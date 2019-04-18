package Lambda;

public class NonAnon implements Runnable {
    @Override
    public void run() {
        System.out.println("Обычный вызов ");
    }

    public static void main(String[] args) {
        new Thread(new NonAnon()).start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Анонимный вызов ");
            }
        });

        t1.start();
        t1.start();
    }
}
