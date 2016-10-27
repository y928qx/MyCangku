import com.sun.org.apache.xml.internal.utils.StringToStringTable;

public class Teacher {
	String name;
	Integer age;
	Boolean isman;
	Byte sex;  //0-男 ，  1--女，   2--太监， 3--人妖。
	
	void teacher(String course){
		System.out.println("teacher:"+name+"教的课程："+course);
	
	}
	  
	public String toString(){
		String  M="name="+this.name+"age="+this.age+"isman="+this.isman+;
		
		return M;
		
	
}
	
	     public static void main(String[] args) {
		Teacher teacher = new Teacher();
		System.out.println(teacher.toString());
		teacher.name = "yanqingxiang";
		teacher.age = 18;
		teacher.sex = 0;
		System.out.println(teacher.toString());
}
}