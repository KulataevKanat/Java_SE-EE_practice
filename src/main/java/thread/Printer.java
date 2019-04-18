package thread;

class Printer {
    synchronized void printDoc(int num, String copy) {
        System.out.println("Поток запущен");
        for (int i = 0; i <= num; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s распечатка №%s \n", copy, i);
        }
    }

    static class PaspThread implements Runnable {
        Printer printer;

        public PaspThread(Printer printer) {
            this.printer = printer;
        }

        @Override
        public void run() {
            printer.printDoc(5, "Паспорта");
        }
    }

    static class DiploThread implements Runnable {
        Printer printer;

        public DiploThread(Printer printer) {
            this.printer = printer;
        }

        @Override
        public void run() {
            printer.printDoc(5, "Дипломы");
        }
    }

    public static class SyncThread extends Thread {

        Printer printer;

        public SyncThread(Printer printer) {
            this.printer = printer;
        }

        @Override
        public void run() {
            printer.printDoc(5, "Военные");
        }


    }

    public static void main(String[] args) {
        Printer localPrinter = new Printer();

        SyncThread syncThread = new SyncThread(localPrinter);
        //syncThread.printer.printDoc(5, "Военный");
        syncThread.start();
        new Thread(new PaspThread(localPrinter)).start();
        new Thread(new DiploThread(localPrinter)).start();


//        Thread thread1 = new Thread(new TaskPractice(10,"Паспорт"));
//        Thread thread2 = new Thread(new TaskPractice(6,"Диплом"));
//        Thread thread3 = new Thread(new TaskPractice(4,"Военный билет"));

    }
}
