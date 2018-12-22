package algorithm.section1.p1;

import junit.framework.TestCase;

public class Max3 extends TestCase {

	public int max3(int a, int b, int c) {

		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;

	}

	public int maxn(int[] A) {
		int len = A.length;
		if (len == 0) {
			return -1;
		}
		if (len == 1) {
			return A[0];
		}
		int max = A[0];
		for (int i = 1; i < len; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		return max;
	}

	public void test1() {
		int expected = 3;
		int a = 1;
		int b = 2;
		int c = 3;
		assertEquals(expected, max3(a, b, c));
	}

	public void testmaxn_1() {
		int expected = 50;
		int[] N = { 1, 2, 3, -100, 50 };
		assertEquals(expected, maxn(N));
	}

	public void testmaxn_2() {
		int expected = -1;
		int[] N = {};
		assertEquals(expected, maxn(N));
	}

	public void testmaxn_3() {
		int expected = 1;
		int[] N = { 1 };
		assertEquals(expected, maxn(N));
	}

}
