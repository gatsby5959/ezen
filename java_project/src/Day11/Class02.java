package Day11;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
//		c.color = "red";
//		c.power = true;
		
		c.getColor();
		c.getSpeed();
		c.getPower();
		
		c.speedUp();
//		System.out.println("My Car color : "+ c.color);
//		System.out.println("My Car color : "+ (c.power?"On":"Off"));
//		System.out.println("My Car color : "+ c.speed);
		
		System.out.println("My Car color : "+ c.getColor());
		System.out.println("My Car color : "+ (c.getPower()?"On":"Off"));
		System.out.println("My Car color : "+ c.getSpeed());
		
		
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		
//		System.out.println("My Car color : "+ c.speed);
		System.out.println("My Car color : "+ c.getSpeed());
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
//		System.out.println("My Car color : "+ c.speed);
		System.out.println("My Car color : "+ c.getSpeed());
		Car c2 = new Car();
//		System.out.println("My Car color : "+ c2.color);
//		System.out.println("My Car color : "+ (c2.power?"On":"Off"));
//		System.out.println("My Car color : "+ c2.speed);
	}

} //end class

class Car{ //클래스명은 대문자로 시작
	//멤버변수
	private String color;
	private boolean power;
	private int speed;
	
	public void power() {
		power = !power;
	}
	public void speedUp() {
		speed+=10;
	}
	public void speedDown() {
		speed-=10;
	}
	
	//getter
	public String getColor() {
		return this.color;
	}
	//setter
	public void setColor(String color) {
		this.color = color;
	}
	
	//getter
	public boolean getPower() {
		return this.power;
	}
	//setter
	public void setPower(boolean power) {
		this.power = power;
	}
	
	//getter
	public int getSpeed() {
		return this.speed;
	}
	//setter
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}