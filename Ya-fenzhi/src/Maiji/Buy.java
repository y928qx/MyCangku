package Maiji;

public class Buy {

	public static void main(String[] args) {
		int x = Integer.parseInt(""+args[0]), y = Integer.parseInt(""+args[1]);
		System.out.println("x代表买鸡花的钱总和="+x);
		System.out.println("y代表买的鸡数量总和="+y);
		System.out.println();

		for (int i = 0; i < 21; i++) {                //公鸡的个数
			for (int j = 0; j < 34; j++) {                 //母鸡的个数
				for (int m = 0; m <= (100 - i - j); m++) {    //小鸡的个数
					if (((5 * i + 3 * j + m / 3) == x) && ((i + j + m) == y)&&(m%3)==0) { //鸡的总数与总价格数为100，且小鸡的数量为3的倍数
						System.out.print(" 公鸡      " + i);   
						System.out.print(" 母鸡       " + j);
						System.out.print(" 小鸡        " + m);
						System.out.println();
					}
				}
			}
		}
	}
}