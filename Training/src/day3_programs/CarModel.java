package day3_programs;

public class CarModel1 
{
	private String model;
	private int year;
	public CarModel1(String model, int year) {
		this.model = model;
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	

}
public class CarModel{
	public static void main(String[] args) {
		CarModel1 c1 = new CarModel1("Maruti",2000);
	}
}
