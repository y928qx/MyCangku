
public class TestPhone {

	public static void main(String[] args) {

		phone iPhone = new Iphone();
		iPhone.startOs();

		phone hPhone = new Hphone();
		hPhone.startOs();

		phone mphone = new Mphone();
		mphone.startOs();

		mphone.setModel("Æ»¹û7");
		// mphone.printSelf();

		mphone.setVender("ÈýÐÇ");
		mphone.printSelf();

		// TODO Auto-generated method stub

	}

}
