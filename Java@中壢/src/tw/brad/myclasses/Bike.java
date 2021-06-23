package tw.brad.myclasses;

public class Bike {
	// has-a member (屬性, 方法)
	// has-a speed, upSpeed(), downSpeed(), getSpeed()
	// myBike.member
	protected double speed;	// public, protected, 沒有, private
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed*1.2;
	}
	
	// Overload 覆載
	public void upSpeed(boolean isUphill) {
		if (isUphill) {
			speed = speed < 1 ? 1 : speed*1.1;
		}else {
			speed = speed < 1 ? 1 : speed*1.4;
		}
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed*0.7;
	}
	
	public double getSpeed() {
		return speed;
	}
}
