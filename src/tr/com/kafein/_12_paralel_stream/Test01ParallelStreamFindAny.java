package tr.com.kafein._12_paralel_stream;

import java.util.Arrays;

public class Test01ParallelStreamFindAny {

	public static void main(String[] args) {

		Integer findAny1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().findAny().get();
		System.out.println(findAny1);

		Integer findAny2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).parallelStream().findAny().get();
		System.out.println(findAny2);
	}
}
