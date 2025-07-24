package day5_programs;
class Vehicle_drive{
	void speed() {
		System.out.println("speed : 100kmph" );	
	}
	void brand() {
		System.out.println("Brand : TATA.....");
	}
}
class Car extends Vehicle_drive{
	@Override
	void speed() {
		// TODO Auto-generated method stub
		super.speed();
		System.out.println("Speed is now 80 kmph");
	}
	
	@Override
	void brand() {
		// TODO Auto-generated method stub
		super.brand();
		System.out.println("CAR is now AUDIIII...");
	}
}
class Bike extends Vehicle_drive{
	@Override
	void speed() {
		// TODO Auto-generated method stub
		super.speed();
		System.out.println("Speed is now 120 kmph");
	}
	@Override
	void brand() {
		// TODO Auto-generated method stub
		super.brand();
		System.out.println("Brand is Royal Enfield");
	}
}
public class Vehicle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I will drive a vehicle");
		Vehicle_drive c= new Vehicle_drive();
        Car car = new Car();
        Bike bike = new Bike();
		c.brand();
		c.speed();
		
		bike.speed();
		bike.brand();
		
		car.brand();
		car.speed();

	}

}
