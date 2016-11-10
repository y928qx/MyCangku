package Io;

import java.util.Scanner;

public class Scanneryqx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个数来判断圆的面积与周长");
		if (scanner.hasNextInt()) {
			Double s, L;
			int r;
			r = scanner.nextInt();
			s = 3.14 * r * r;
			L = 2 * 3.14 * r;
			System.out.println("输出的圆的面积为    " + s);
			System.out.println("输出的圆的周长为    " + L);
		} else {
			System.out.println("你输入的不对");
		}
	}
}
