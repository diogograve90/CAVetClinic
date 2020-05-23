package Animals;

/**
 * Cat class
 */

public class Cat extends Animal {

	public static final int CAT_AGE_LIMIT = 16;
	public static final String TYPE = "cat";

	public Cat(int id, String name, int age, String medicalCondition) {
		super(TYPE, id, name, age, medicalCondition);
	}

	public Cat() {
	}

	@Override
	public String toString() {
		return "Cat{" + super.toString() + "} ";
	}
}