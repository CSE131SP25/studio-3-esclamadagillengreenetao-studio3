package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n: ");
		int n = in.nextInt();
		
//		int[] numbers = new int[n-1];
//		
//		for (int i=0; i <= numbers.length-2; i++) {
//			numbers[i] = i+2;
//		}
		
		int y;
		
		boolean[] check = new boolean[n-1];
		
		for (int x = 2; x <= n; x++) {
			
			y = 1;
			
			if (x*x <= n) {
				check[x*x-2] = true;

			}
			
			while (((x*x) + (x*y)) <= n) {
				check[(x*x)+(x*y)-2] = true;
				y++;
			}
			
		}
		
		for (boolean i : check) {
			System.out.println(i);
		}
		

	}

}
