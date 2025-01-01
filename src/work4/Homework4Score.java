package work4;

import java.util.Arrays;

public class Homework4Score {

	public static void main(String[] args) {

		int[] st = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[][] test = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		
		int max = 0;
		int re = 0;
		int count[] = new int[6];
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				if (test[i][j] > max) {
					max = test[i][j];
					re = st[j];
				}
			}
			
			System.out.println(re);
			
				
			
			max = 0;
			
		}
	
		
		}

	}


//班上有8位同學,他們進行了6次考試結果如下:
//
//請算出每位同學考最高分的次數
//(提示:二維陣列)
//
