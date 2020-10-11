package ppj;

public class TrafficLight extends Light implements TrafficColor {
	public TrafficLight(String color) {
		setColor(color);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void green() {
		if (getColor().equals("green")) {
			System.out.println("The light is already green.");
		} else if (getColor().equals("red")) {
			System.out.println("The light has " + getColor() + " color but must be yellow before it can became green");
		} else {
			setColor("green");
			System.out.println("The light is now green.");
		}
	}

	public void yellow() {
		if (getColor().equals("green") || getColor().equals("red")) {
			setColor("yellow");
			System.out.println("The light is now yellow.");
		} else {
			System.out.println("The light is already yellow.");
		}
	}

	public void red() {
		if (getColor().equals("red")) {
			System.out.println("The light is already red.");
		} else if (getColor().equals("green")) {
			System.out.println("The light has " + getColor() + " color but must be yellow before it can became red");
		} else {
			setColor("red");
			System.out.println("The light is now red.");
		}
	}
}
