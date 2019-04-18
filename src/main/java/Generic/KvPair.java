package Generic;

import java.util.ArrayList;
import java.util.List;

public class KvPair<T1, T2> {
    private T1 one;
    private T2 two;

    public KvPair(T1 one, T2 two) {
        this.one = one;
        this.two = two;
    }

    public KvPair() {

    }

    @Override
    public String toString() {
        return "one=" + one +
                ", two=" + two;
    }

    public static void main(String[] args) {
        KvPair<Integer, String> pair = new KvPair<>(1, "Hello");
        System.out.println(pair.toString());

        KvPair<String, Integer> pair1 = new KvPair<>("Bye", 2);
        System.out.println(pair1.toString());

        KvPair<String, String> pair2 = new KvPair<>();
        pair2.one = "haha";
        System.out.println(pair2);

        List<String> myList = new ArrayList<>();
        List myList1 = new ArrayList<>();
        myList.add("1");

        myList1.add(new Object());
        myList1.add(1);
        myList1.add("Ha-a");

    }
}
