package no_itc;

public class Producer implements Runnable {
	private EmpUtils u;
	private boolean exit;
	public Producer(EmpUtils u) {
		this.u = u;
	}
	@Override
	public void run() {
		System.out.println("started thrd  -- "
				+ Thread.currentThread().getName());
		try {
			int i = 1;
			while (!exit) {
				u.writeData(new Emp(i, "aa" + i, "HRD", i * 100));
				i++;
				Thread.sleep(20);
			}
		} catch (Exception e) {
			System.out.println("err in " + Thread.currentThread().getName()
					+ "  " + e);
		}
		System.out.println("thrd over -- " + Thread.currentThread().getName());

	}

	public void stop() {
		exit = true;
	}

}
