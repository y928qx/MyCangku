package Maiji;

public class Buy {

	public static void main(String[] args) {
		int x = Integer.parseInt(""+args[0]), y = Integer.parseInt(""+args[1]);
		System.out.println("x�����򼦻���Ǯ�ܺ�="+x);
		System.out.println("y������ļ������ܺ�="+y);
		System.out.println();

		for (int i = 0; i < 21; i++) {                //�����ĸ���
			for (int j = 0; j < 34; j++) {                 //ĸ���ĸ���
				for (int m = 0; m <= (100 - i - j); m++) {    //С���ĸ���
					if (((5 * i + 3 * j + m / 3) == x) && ((i + j + m) == y)&&(m%3)==0) { //�����������ܼ۸���Ϊ100����С��������Ϊ3�ı���
						System.out.print(" ����      " + i);   
						System.out.print(" ĸ��       " + j);
						System.out.print(" С��        " + m);
						System.out.println();
					}
				}
			}
		}
	}
}