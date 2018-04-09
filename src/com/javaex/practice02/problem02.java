package com.javaex.practice02;

import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dataArray = new int[5];
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개 입력");
		for (int i = 0; i < dataArray.length; i++) {
			num = sc.nextInt();
			sum += num;

		}
		System.out.println("평균은 " + sum / dataArray.length + "입니다.");
		sc.close();

	}

}
