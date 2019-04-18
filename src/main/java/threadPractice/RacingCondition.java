package threadPractice;

public class RacingCondition implements Runnable {
    private int place = 0;

    synchronized void inc() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        place++;
    }

    public int getValue() {
        return place;

    }

    @Override
    public void run() {
        this.inc();
        System.out.println("Я " + Thread.currentThread().getName() + ", я занял " + this.getValue() + " место");

    }

    public static void main(String[] args) {
        RacingCondition racingCondition = new RacingCondition();
        Thread t1 = new Thread(racingCondition, "Lewis Hamelton");
        Thread t2 = new Thread(racingCondition, "Kimi Raikonen");
        Thread t3 = new Thread(racingCondition, "Daniel Riccardo");
        Thread t4 = new Thread(racingCondition, "Max Verstappen");
        Thread t5 = new Thread(racingCondition, "Michael Vettel");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();

//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        t2.start();


        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
        t4.start();
        t5.start();

//        Object o = new Object();
//        o.notify();
    }
}
