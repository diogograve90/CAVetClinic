package Animals;

public class Rabbit extends Animal {
    
	public static final int RABBIT_AGE_LIMIT = 2;
	
    public Rabbit(int id, String name, int age, String medicalCondition) {
        super(id, name, age, medicalCondition);
    }

    public Rabbit() {

    }

    @Override
    public String toString() {
        return "Rabbit{"+ super.toString() +"} " ;
    }
}
