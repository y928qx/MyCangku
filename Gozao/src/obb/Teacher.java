package obb;

public class Teacher {

	private String name;
	private Integer age;
	private boolean isman;
	private Byte sex;

	public Teacher() {
		System.out.println("无构造方法");
		System.out.println();

	}

	public Teacher(String name, Integer age) {
		System.out.println("构造方法2种");
		this.age = age;
		this.name = name;

	}

	public Teacher(String name, Integer age, Boolean isman, Byte sex) {
		this.name = name;
		this.age = age;
		this.isman = isman;
		System.out.println("构造方法3种");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	void teacher(String course) {
		System.out.println("老师 " + name + " 教授的课程是：" + course);
	}

	@Override
	public String toString() {
		return "Teacher2 [name=" + name + ", age=" + age + ", isMan=" + isman + ", sex=" + sex + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}