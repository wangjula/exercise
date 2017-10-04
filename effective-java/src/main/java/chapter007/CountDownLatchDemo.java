package main.java.chapter007;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {
	
	/**
	 * executor线程数必须大于concurrency，否则会导致死锁
	 * @param executor
	 * @param concurrency
	 * @param action
	 * @return
	 * @throws InterruptedException
	 */
	public static long time(ExecutorService executor, int concurrency, final Runnable action) throws InterruptedException {
		final CountDownLatch ready = new CountDownLatch(concurrency);
		final CountDownLatch start = new CountDownLatch(1);
		final CountDownLatch done = new CountDownLatch(concurrency);
		
		for (int i = 0; i< concurrency; i ++) {
			executor.execute(new Runnable() {

				@Override
				public void run() {
					ready.countDown();
					try {
						start.await();
						action.run();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					} finally {
						done.countDown();
					}
				}});
		}
		
		executor.shutdown();
		ready.await();
		long startNanos = System.nanoTime();
		start.countDown();
		done.await();
		return System.nanoTime() - startNanos;
	}

	public static void main(String[] args) {
		try {
			System.out.println(time(Executors.newFixedThreadPool(3), 3, new Runnable() { 

				@Override
				public void run() {
					System.out.println("======" + Thread.currentThread().getName() + "run!");
				}}));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
