package threadPractice;

class Test {
    private final String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class ThreadA implements Runnable {
    private Test test1;
    private Test test2;

    ThreadA(Test test1, Test test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    @Override
    public void run() {
        synchronized (test1) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("" + test1.getName());
            synchronized (test2) {
                System.out.println("Отработал");
            }
        }
    }
}

class ThreadB implements Runnable {

    private Test test1;
    private Test test2;

    ThreadB(Test test1, Test test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    @Override
    public void run() {
        synchronized (test2) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("" + test2.getName());
            synchronized (test1) {
                System.out.println("Отработал");
            }
        }
    }
}

public class DeadLock2 {

    public static void main(String[] args) {
        Test test1 = new Test("Поток-1");
        Test test2 = new Test("Поток-2");
        Thread t1 = new Thread(new ThreadA(test1, test2));
        Thread t2 = new Thread(new ThreadB(test1, test2));
        t1.start();
        t2.start();
    }
}

