
public class Assd {

	public static void Triangle1(String args[]) {

		int x = 0;
		x = Integer.parseInt(args[0]); // 把输入数组args[0]，并赋值给行数x

		System.out.println("輸入的行数為：     " + x);

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x - i; j++) {
				System.out.print(" "); // 通过for循环语句输出空格
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*"); // 通过for循环语句输出*
			}

			System.out.println(); // 每行结束换行
		}

	}

	public static void Triangle2(String args[]) {

		int x = 0;
		x = Integer.parseInt(args[0]); // 把输入数组args[0]，并赋值给行数x
		System.out.println("輸入的行数為：     " + x);

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" "); // 通过for循环语句输出空格
			}
			for (int j = 0; j < 2 * (x - i) - 1; j++) {
				System.out.print("*"); // 通过for循环语句输出*
			}
			System.out.println(); // 每行结束换行
		}

	}

	public static void main(String[] args) {

		System.out.println("1、实心正等腰三角形");
		Assd.Triangle1(args); // 调用方法Triangle1

		System.out.println();

		System.out.println("2、实心倒立等腰三角形");
		Assd.Triangle2(args); // 调用方法Triangle2

	}
}
