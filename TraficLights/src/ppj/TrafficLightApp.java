package ppj;

public class TrafficLightApp {
	public static void main(String[] args) {
		TrafficLight light1 = new TrafficLight("green");
		TrafficColor light2 = new TrafficLight("red");

		System.out.println("The color of light1 is " + light1.getColor());
		light1.yellow();
		System.out.println("The color of light1 is " + light1.getColor());
		light2.green();
		System.out.println("The color of light2 is " + ((TrafficLight) light2).getColor());
		light2.yellow();
		System.out.println("The color of light2 is " + ((TrafficLight) light2).getColor());
	}
}
