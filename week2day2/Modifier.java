package week2day2;

public class Modifier {
	public void calls() {
		System.out.println("calls");
	}
	private void gallery() {
		System.out.println("gallery");
	}
	void dialCall() {
		System.out.println("dialCall");
	}
	protected void hiddenFolder() {
		System.out.println("hiddenFolder");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifier m=new Modifier();
		m.calls();
		m.gallery();
		m.dialCall();
		m.hiddenFolder();
		

	}

}
