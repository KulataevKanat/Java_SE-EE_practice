package thread;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Это первый поток");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new SecondThread());
        thread.start();
        System.out.println("сновной поток, main");
    }
}
