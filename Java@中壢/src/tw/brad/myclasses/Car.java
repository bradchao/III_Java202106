package tw.brad.myclasses;

public class Car extends Object {
	private int color;

	// 建構子/建構式/建構方法/Constructor
	public Car() {
		// super();
		// 針對物件實體進行<初始化>的任務
		System.out.println("Car()");
	}
	
	public Car(int color) {
		// super();
		this.color = color;
		System.out.println("Car(int)");
	}
	
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
}
