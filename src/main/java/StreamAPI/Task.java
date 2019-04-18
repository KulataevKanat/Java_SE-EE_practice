package StreamAPI;
import java.util.stream.Stream;

public class Task {
    public static void main(String[] args) {
        Students[] students = {new Students(1, "One", 4),
                new Students(2, "Two", 5),
                new Students(3, "Three", 2)};

        Stream.of(students).filter(x -> x.getMark() >= 4).forEach(x -> System.out.println(x.getFio()));

        long i = Stream.of(students).filter(x -> x.getMark() <= 2).count();
        System.out.println(i);
    }
}
