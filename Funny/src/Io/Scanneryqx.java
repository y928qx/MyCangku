package Io;

import java.util.Scanner;

public class Scanneryqx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����һ�������ж�Բ��������ܳ�");
		if (scanner.hasNextInt()) {
			Double s, L;
			int r;
			r = scanner.nextInt();
			s = 3.14 * r * r;
			L = 2 * 3.14 * r;
			System.out.println("�����Բ�����Ϊ    " + s);
			System.out.println("�����Բ���ܳ�Ϊ    " + L);
		} else {
			System.out.println("������Ĳ���");
		}
	}
}
