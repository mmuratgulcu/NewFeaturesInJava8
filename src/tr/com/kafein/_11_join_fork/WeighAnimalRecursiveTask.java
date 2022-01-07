package tr.com.kafein._11_join_fork;

import java.util.Random;
import java.util.concurrent.RecursiveTask;

public class WeighAnimalRecursiveTask extends RecursiveTask<Double> {
	private int start;
	private int end;
	private Double[] weights;

	public WeighAnimalRecursiveTask(Double[] weights, int start, int end) {
		this.start = start;
		this.end = end;
		this.weights = weights;
	}

	@Override
	protected Double compute() {
		if (end - start <= 3) {
			double sum = 0;
			for (int i = start; i < end; i++) {
				weights[i] = (double) new Random().nextInt(100);
				System.out.println("Animal Weighed: " + i);
				sum += weights[i];
			}
			return sum;
		} else {
			int middle = start + ((end - start) / 2);
			System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
			RecursiveTask<Double> otherTask = new WeighAnimalRecursiveTask(weights, start, middle);
			otherTask.fork();
			return new WeighAnimalRecursiveTask(weights, middle, end).compute() + otherTask.join();
		}

	}
}
