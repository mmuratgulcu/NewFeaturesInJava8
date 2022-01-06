package tr.com.kafein._04_stream;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<Integer> opt = Optional.of(123);
        orElseAndOrElseThrow();
    }

    public static void creatingOptional() {
        Optional<String> empty = Optional.empty();

        Optional<String> notEmpty = Optional.of("data");

        Optional<String> nullStr = Optional.of(null); //null pointer exception fırlatır

        Optional<String> nullableStr = Optional.ofNullable(null); //empty döner
    }

    public static void isPresentAndIfPresent(){
        Optional<String> opt = Optional.of("kafein teknology");

        if (opt.isPresent()) {
            System.out.println(opt.get());
        }

        opt.ifPresent(System.out::println);

        Optional<String> empty = Optional.empty();

        if(!empty.isPresent()){
            System.out.println("found!!");
        }
    }

    public static void orElseAndOrElseThrow(){
        Optional<String> opt1 = Optional.empty();

        System.out.println(opt1.map(String::length));
        System.out.println(opt1.map(String::length).orElse(-1));

        System.out.println(opt1.map(String::length).orElseThrow(RuntimeException::new));

    }

    //chaining Optional
    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) {
            Integer num = optional.get();
            String string = num.toString();
            if (string.length() == 3) {
                System.out.println(string);
            }
        }
    }

    //chaining Optional
    private static void threeDigitBetter(Optional<Integer> optional) {
        optional.map(n -> n.toString()).filter(s -> s.length() == 3).ifPresent(System.out::println);
    }
}
