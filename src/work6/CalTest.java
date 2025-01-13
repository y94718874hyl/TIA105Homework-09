package work6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {

		Calculator c = new Calculator();
		boolean b = true;
		while (b) {

			try {
				c.powerXY();
				if (b) {
					break;
				}

			} catch (CalException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");
			}
		}
	}
}
