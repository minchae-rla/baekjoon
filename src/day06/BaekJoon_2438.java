package day06;

import java.util.Scanner;

public class BaekJoon_2438 {
	public static void main(String[] args) {
		//문제번호.2438
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i = 1 ; i <= count ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 

	}

}
