package com.app.core.java.basic;

import java.util.Scanner;

public class Compare2Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 number : ");
		Integer number1 = sc.nextInt();
		System.out.println("Enter 2 number : ");
		Integer number2 = sc.nextInt();
		
		if(number1 > number2) {
			System.out.println(number1+" is greator.");
		}else {
			System.out.println(number2+" is greator.");
		}
	}
}
