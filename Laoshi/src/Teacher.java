import com.sun.org.apache.xml.internal.utils.StringToStringTable;

public class Teacher {
	String name;
	Integer age;
	Boolean isman;
	Byte sex;  //0-�� ��  1--Ů��   2--̫�࣬ 3--������
	
	void teacher(String course){
		System.out.println("teacher:"+name+"�̵Ŀγ̣�"+course);
	
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