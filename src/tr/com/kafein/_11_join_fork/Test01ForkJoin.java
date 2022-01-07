package tr.com.kafein._11_join_fork;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Test01ForkJoin {

	public static void main(String[] args) {
		Double[] weights = new Double[10];
		ForkJoinTask<?> task = new WeighAnimalRecursiveAction(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);

		System.out.print("Weights: ");
		Arrays.asList(weights).stream().forEach(d -> System.out.print(d.intValue() + " "));
	}
}
