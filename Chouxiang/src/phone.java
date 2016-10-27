import lombok.Getter;
import lombok.Setter;

public abstract class phone {

	@lombok.Setter@lombok.Getter
	private static String os="Android";
	@lombok.Setter@lombok.Getter
	private String model;
	@Setter@Getter
	private String vender;
	


	public abstract void startOs();
	public void printSelf() {
		System.out.println("我的型号是："+model);
		System.out.println("我的生产厂家为："+vender);
		
		
	}

}
