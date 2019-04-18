package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> integer = Optional.of(5);
        System.out.println(integer.isPresent());
        System.out.println(integer.get());
        System.out.println(integer.orElse(1));

//        List<Integer> stringList = new ArrayList<>();
//        stringList.add(5);
//        stringList.add(5);
//        stringList.add(5);
//        Stream<>

    }

}
