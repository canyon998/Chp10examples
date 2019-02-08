package canyon.rodgers.exaples;

public class Car {
	String color = "blue";
	int year = 2019;
	double cost = 100.99;
	char model = 'a';
	boolean gas = false;
	boolean electric = true;
	
	
	void start() {
		System.out.println("start car");
	}
	void stop() {
		System.out.println("stop car");
	}
	void display() {
		System.out.println(color);
		System.out.println(year);
		System.out.println(cost);
		
	}
	public static void main(String[] args) {
		Car mustang = new Car();
		mustang.start();
		mustang.display();
		mustang.stop();
	}
	

}
