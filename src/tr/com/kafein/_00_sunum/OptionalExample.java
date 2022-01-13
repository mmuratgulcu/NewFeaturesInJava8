package tr.com.kafein._00_sunum;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
//        Optional<String > empty = Optional.empty();
//        Optional<String> data = Optional.of("data");
//        Optional<String> o = Optional.of(null);
//        Optional<String> o1 = Optional.ofNullable(null);

        Optional<String> stringOptional = Optional.of("Optional");

        System.out.println(stringOptional.map(x -> x.length()).filter(x -> x == 4).orElse(-1));
        System.out.println(stringOptional.map(x -> x.length()).filter(x -> x == 4).orElseThrow(IllegalArgumentException::new));
    }
}
