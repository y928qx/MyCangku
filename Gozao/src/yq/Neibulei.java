package yq;

public class Neibulei {
	private Inner inner;// 用来保存Inner类的一个实例化对象--个体
	String name = "Outter";

	public void print() {
		System.out.println("我是---Outter");
	}

	public Inner getInnerInstance() {                               // wai
		if (inner == null) {
			inner = new Inner();
		}
		return inner;
	}

	public void readInnerName() {
		String tmpName = getInnerInstance().name;
		System.out.println("我是Outter类  ，我可以访问内部类的名字：" + tmpName);
	}

	public void execInnerPrint() {
		System.out.println("我是外部类，我将要执行内部累类的方法：");
		getInnerInstance().print();
		System.out.println("我是外部类，我执行内部类的方法结束了！");
	}

	class Inner {                                                             // neibulei
		String name = "Inner";

		public void readOutterName() {
			System.out.println("这是内部类的方法，我自己的内部类的名字是：" + name + " 我的外部类的名字是：" + Neibulei.this.name);
		}

		public void print() {
			// System.out.println();
			System.out.println("我是---Inner");
		}

		public void execOutterPrint() {
			System.out.println("我是内部类，我将要执行外部类的print方法--------------");
			Neibulei.this.print();
			System.out.println("我是内部类，我将要执行外部类的print方法结束-----------");
		}
	}

	public static void main(String[] args) {
		Neibulei outter = new Neibulei();
		outter.print(); // 调用外部类的打印方法
		outter.readInnerName();
		outter.execInnerPrint();

		// Neibulei.Inner inner2 = outter.new Inner();
		Neibulei.Inner inner2 = outter.getInnerInstance();
		inner2.print(); // 调用内部累的方法
		inner2.readOutterName();
		inner2.execOutterPrint();

	}

}
