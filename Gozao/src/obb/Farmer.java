package obb;

public class Farmer {
	private String id;
	private String name;
	private Integer age;
	static String WORK = "WORKING";

	public static  void work() {

		System.out.println("我是农民。我种田");

	}

	public static void main(String[] args) {
		System.out.println(Farmer.WORK);
		Farmer.work();
		// TODO Auto-generated method stub

	}

}
