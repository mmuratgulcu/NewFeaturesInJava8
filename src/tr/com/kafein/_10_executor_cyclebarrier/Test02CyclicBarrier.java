package tr.com.kafein._10_executor_cyclebarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test02CyclicBarrier {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(4);

		LionPenManagerCyclic manager = new LionPenManagerCyclic();

		CyclicBarrier c1 = new CyclicBarrier(4);

		Runnable task = () -> manager.performTask(c1);
		for (int i = 0; i < 4; i++) {
			service.submit(task);
		}

		service.shutdown();
	}
}

class LionPenManagerCyclic {

	private void removeAnimals() {
		System.out.println("Removing animals ," + Thread.currentThread().getName());
	}

	private void cleanPen() {
		System.out.println("Cleaning the pen , " + Thread.currentThread().getName());
	}

	private void addAnimals() {
		System.out.println("Adding animals , " + Thread.currentThread().getName());
	}

	public void performTask(CyclicBarrier c1) {
		try {
			removeAnimals();
			c1.await();
			cleanPen();
			c1.await();
			addAnimals();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

	}

}
