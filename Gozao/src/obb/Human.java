package obb;

public class Human {
	private String id;
	private Integer age;
	private String name;
	private String work;

	public Human() {
		super();
		System.out.println("这是一个无参的");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Human(String id, Integer age, String name, String work) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.work = work;
		System.out.println("这是一个y4ge的");
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", age=" + age + ", name=" + name + ", work=" + work + "]";
	}

}
