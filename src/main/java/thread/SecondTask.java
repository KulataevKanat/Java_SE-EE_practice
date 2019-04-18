package thread;

public class SecondTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Паспорт(поток)" + " " + i + " pas");
        }
    }

    public static void main(String[] args) {
        System.out.println(1);
        Thread thread = new Thread(new SecondTask());
        thread.setDaemon(true);
        thread.start();
        SecondTask secondTask = new SecondTask();
        secondTask.print(10, "Диплом");
        System.out.println("Я основной поток");
    }

    private void print(int n, String text) {
        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(text + " " + i);
        }

    }
}