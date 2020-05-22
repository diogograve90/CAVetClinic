package Animals;

public class Dog extends Animal {
	
	public static final int DOG_AGE_LIMIT = 13;

    public Dog(int id, String name, int age, String medicalCondition) {
        super(id, name, age, medicalCondition);
    }

    public Dog() {

    }

    @Override
    public String toString() {
        return "Dog{"+ super.toString() +"} " ;
    }
}
