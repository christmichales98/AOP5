package test;

public class Mobil extends Vehicle{
	private int speed;
	private String merk;
	private int width, length;
	private int platenumber;
	
	public Mobil(int speed, String merk){
		this.setSpeed(speed);
		this.setMerk(merk);
	}
	
	public Mobil(int width, int length,int platenumber){
		this.setWidth(width);
		this.setLength(length);
		this.setPlatenumber(platenumber);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getPlatenumber() {
		return platenumber;
	}

	public void setPlatenumber(int platenumber) {
		this.platenumber = platenumber;
	}
}
