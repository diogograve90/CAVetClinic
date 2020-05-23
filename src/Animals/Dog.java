package Animals;

public class Dog extends Animal {
	
	public static final int DOG_AGE_LIMIT = 13;
	public static final String TYPE = "dog";

    public Dog(int id, String name, int age, String medicalCondition) {
        super(TYPE,id, name, age, medicalCondition);
    }

    public Dog() {

    }

    @Override
    public String toString() {
        return "Dog{"+ super.toString() +"} " ;
    }
}
