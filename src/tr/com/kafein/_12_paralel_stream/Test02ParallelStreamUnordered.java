package tr.com.kafein._12_paralel_stream;

import java.util.Arrays;

public class Test02ParallelStreamUnordered {

	public static void main(String[] args) {

		Arrays.asList(1, 5, 20, 4, 3, 8, 100).stream().unordered().parallel().forEach(System.out::println);
	}
}

