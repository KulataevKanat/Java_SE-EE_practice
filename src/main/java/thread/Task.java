package thread;

public class Task extends Thread {
    String[] persons;

    public Task(String... persons) {
        this.persons = persons;
    }

    @Override
    public void run() {
        for (int i = 0; i < persons.length; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Поток обслужил - " + persons[i] + " " + i + " раз");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Task firstGroup = new Task("Оля", "Паша", "Юра", "Лена", "Саша", "Маша");
        firstGroup.start();

        Task secondGroup = new Task("James", "Bill", "John", "Alex", "Frank", "Dina");
        secondGroup.start();

    }



}
