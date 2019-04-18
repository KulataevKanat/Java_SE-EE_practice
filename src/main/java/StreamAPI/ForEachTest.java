package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachTest {
    public static void main(String[] args) {
        String[] arrayOfStr = {"Alex", "Sam", "Lewis"};
        Stream.of(arrayOfStr).forEach(x -> {
            System.out.print(x + " ");

        });

        System.out.println();

        Integer[] arrayOfInt = {2, 5, 8, 10};
        Stream.of(arrayOfInt).forEach(x -> {
            System.out.print(x * x + " ");
        });

        System.out.println();

        Stream.of("Алишер", "Андрей", "Бектур").forEach(x -> {
            System.out.print(x.replace("А", "О") + " ");

        });

        System.out.println();

        Stream.of(1800, 78, 754).map(x -> x * 0.1).forEach(System.out::println);

        System.out.println();

        Stream.of("Kanat", "Bektur").map(x -> x + x).forEach(System.out::println);

        System.out.println();

        Student students = new Student(1, "One");
        List<String> list = Stream.of(students).map(x -> x.getFullname()).collect(Collectors.toList());
        System.out.print(list);

        System.out.println();

        Integer[] integers = {1, 2, 3, 4, 56,};

//        List<Integer[]> integerStream = Stream.of(integers).map(x -> x)


        System.out.println();

        Integer[] ints = {10, 60, 56, 87, 90};
//        List<Integer> iss = Stream.of(ints).map(x ->
//                x % 3 == 0 ? x = 0 : x * 10).collect(Collectors.toList());
//
//        System.out.println(iss);

        Long c = Stream.of(ints).map(x ->
        {
            if (x % 3 == 0) {
                return 0;
            } else return 10 * x;
        })
                .filter(x -> x != 0)
                .count();
        //.collect(Collectors.toList());

        System.out.println(c);


    }
}

