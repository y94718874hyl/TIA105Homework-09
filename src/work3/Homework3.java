package work3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形	
//	(進階功能:加入直角三角形的判斷)	
	public static void main(String[] args) {

		Homework3 tri = new Homework3();
		tri.triangle();
	}

	public void triangle() {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");

		int[] n = new int[3];
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}

		Arrays.sort(n);
		if (n[0] == n[1] & n[1] == n[2]) {
			System.out.println("正三角形");
		} else if ((n[0] + n[1]) > n[2]) {
			System.out.println("其他三角形");
		} else if ((n[0] == n[1]) & n[1] > n[2]) {
			System.out.println("等腰三角形");
		} else if ((n[0] + n[1]) > n[2]) {
			System.out.println("不是三角形");
		}
	}
}
