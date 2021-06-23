package tw.brad.myclasses;

public class Scooter extends Bike {
	private int gear;	// 0
	
	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		if (gear >=0 && gear<=5) {
			this.gear = gear;
		}
	}

	// Override
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed*1.8;
	}
	
	 
}
