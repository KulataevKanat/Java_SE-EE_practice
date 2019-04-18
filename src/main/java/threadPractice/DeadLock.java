package threadPractice;

public class DeadLock {

    private final String name;

    public DeadLock(String name) {
        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    public /*synchronized*/ void call1(DeadLock caller) {
        System.out.println(this.getName() + " вызвал " + caller.getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        caller.callMe2(this);
    }

    public synchronized void callMe2(DeadLock caller) {
        System.out.println(this.getName() + " вызвал " + caller.getName());
    }

    public static void main(String[] args) {
        DeadLock th1 = new DeadLock("th-1");
        DeadLock th2 = new DeadLock("th-2");
        // Поток 1
        new Thread(new Runnable() {
            public void run() {
                th1.call1(th2);
            }
            //анонимный вызов метода
        }).start();

        //Поток 2
        new Thread(new Runnable() {
            public void run() {
                th2.call1(th1);
            }
            // анонимный вызов метода
        }).start();
    }
}

