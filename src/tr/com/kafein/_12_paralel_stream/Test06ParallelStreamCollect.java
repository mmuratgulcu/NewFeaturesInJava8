package tr.com.kafein._12_paralel_stream;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test06ParallelStreamCollect {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
		Set<String> set = stream.collect(Collectors.toSet());
		System.out.println(set);
	}
}
