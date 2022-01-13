package tr.com.kafein._04_stream;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        orElseAndOrElseThrow();

    }

    public static void creatingOptional() {

        Optional<String> empty = Optional.empty();
        Optional<String> notEmpty = Optional.of("data");
        Optional<String> nullStr = Optional.of(null);
        Optional<String> nullableStr = Optional.ofNullable(null);

    }

    public static void isPresentAndIfPresent() {
        Optional<String> opt = Optional.of("Optional examples");

        if (opt.isPresent()) {
            System.out.println(opt.get());
        } else {
            System.out.println("empty");
        }

        opt.ifPresent(System.out::println);

        opt = Optional.empty();

        if (opt.isPresent()) {
            System.out.println(opt.get());
        } else {
            System.out.println("empty");
        }
    }

    public static void orElseAndOrElseThrow() {

        Optional<String> opt1 = Optional.of("data");

        System.out.println(opt1.map(x -> x.length()).filter(x -> x == 4).orElse(-1));
        System.out.println(opt1.map(String::length).filter(x -> x == 4).orElseThrow(RuntimeException::new));

    }

    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {
            Integer num = optional.get();
            String string = num.toString();
            if (string.length() == 3) {
                System.out.println(string);
            }
        }
    }

    private static void threeDigitBetter(Optional<Integer> optional) {
        optional.map(n -> n.toString()).filter(s -> s.length() == 3).ifPresent(System.out::println);
    }
}
