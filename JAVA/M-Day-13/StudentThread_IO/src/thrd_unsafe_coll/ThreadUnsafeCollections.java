package thrd_unsafe_coll;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ThreadUnsafeCollections {
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<>(10000);
		IntStream.rangeClosed(1, 10000).forEach(list::add);// i -> list.add(i)
		// Thread(Runnable instance,String name)
		Thread reader = new Thread(() -> {
			synchronized (list) {
				list.forEach(i -> System.out.println("r " + i));// forEach : for-each : implicit Iterator(fail-fast)
			}
		}, "t1");
		Thread writer = new Thread(() -> {
			synchronized (list) {
				IntStream.range(10001, 20001).forEach(list::add);
			}

		}, "t2");
		reader.start();
		Thread.sleep(10);
		writer.start();
		reader.join();
		writer.join();
		System.out.println("main over...");
	}
}