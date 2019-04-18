package thread;

public class FirstThread extends Thread {
    @Override
    public void run(){
        System.out.println("Это первый поток");
    }

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        firstThread.start();
        System.out.println("сновной поток, main");
    }
}
