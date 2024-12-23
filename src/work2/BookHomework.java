package work2;

public class BookHomework {

	public static void main(String[] args) {

		// 九九乘法表for while
		System.out.println("for while");
		int n1, m1 = 1;
		for (n1 = 1; n1 <= 9; n1++) {

			while (m1 <= 9) {

				System.out.print(n1 + "*" + m1 + "=" + n1 * m1 + '\t');
				m1++;

			}
			m1 = 1;
			System.out.println();

		}

		// for do while
		System.out.println("for do while");

		int n2, m2 = 1;
		for (n2 = 1; n2 <= 9; n2++) {
			do {
				System.out.print(n2 + "*" + m2 + "=" + n2 * m2 + '\t');
				m2++;
			} while (m2 <= 9);
			m2 = 1;
			System.out.println();
		}

		// while do while
		System.out.println("while do while");
		int n3 = 1, m3 = 1;
		while (n3 <= 9) {
			do {
				System.out.print(n3 + "*" + m3 + "=" + n3 * m3 + '\t');
				m3++;
			} while (m3 <= 9);
			m3 = 1;
			System.out.println();
			n3++;
		}

	}

}
