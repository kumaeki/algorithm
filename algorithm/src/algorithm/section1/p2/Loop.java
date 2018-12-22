package algorithm.section1.p2;

import junit.framework.TestCase;

public class Loop extends TestCase {

	public void multi99Table() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				// % formatŠJŽn
				// 5 5ˆÊ
				// d ”Žš
				System.out.printf("%5d", i * j);
			}
			System.out.println("\r\n");
		}
	}

	public void multi99TableFormat() {
		for (int i = -1; i < 10; i++) {
			if (i == -1) {
				for (int j = -1; j < 10; j++) {
					if (j == -1) {
						System.out.printf("%3s", "");
					} else if (j == 0) {
						System.out.printf("%3s", "„ ");
					} else {
						System.out.printf("%3d", j);
					}

				}
			} else if (i == 0) {
				for (int j = -1; j < 10; j++) {
					if (j == 0) {
						System.out.printf("%3s", "--+");
					} else {
						System.out.printf("%3s", "---");
					}
				}
			} else {
				for (int j = -1; j < 10; j++) {
					if (j == -1) {
						System.out.printf("%3d", i);
					} else if (j == 0) {
						System.out.printf("%3s", "„ ");
					} else {
						System.out.printf("%3d", i * j);
					}

				}
			}

			System.out.println("\r\n");
		}
	}

	public static void main(String[] args) {
		new Loop().multi99TableFormat();
	}

}
