package test;
/**
Version1
**/
import java.util.Date;
import java.util.Random;

public class WorkerThread implements Runnable {

	private String command;

	public WorkerThread(String s) {
		this.command = s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()
<<<<<<< HEAD
				+ " Start. Command = " + command);
=======
				+ " Start. Command = 11111111_NENENENWNEWN__XXXXXXX____12" + command);
>>>>>>> 20d5646... fix new
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End.");
	}

	int count = 0;

	private void processCommand() {
		try {
			// Thread.sleep(100);
			int n = new Random().nextInt(100) - 12;
			count++;
			if (count == 5) {
				n = 0;
				count = 0;
			}
			System.err.println(new Date() + Thread.currentThread().getName()
					+ 5 / n);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return this.command;
	}
}