package tw.brad.myclasses;

public class Scooter extends Bike {
	private int gear;	// 0
	
	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		if (gear >=0 && gear<=5) {
			if (Math.abs(this.gear - gear) == 1) {
				this.gear = gear;
			}
		}
	}

	// Override
	public void upSpeed() {
		if (gear > 0) {
			speed = speed < 1 ? 1 : speed + 2*gear;
		}
	}
	
	
	
	 
}
