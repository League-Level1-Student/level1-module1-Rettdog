
public class Person {
	String name = "";
	String superpower = "";

	String getName() {
		return name;

	}

	String getPower() {
		return superpower;

	}

	void setName(String name) {
		this.name = name;

	}

	void setPower(String power) {
		superpower = power;

	}

	public String toString() {
		String sentence = name + " has mad " + superpower + " skills!";
		return sentence;

	}
}
