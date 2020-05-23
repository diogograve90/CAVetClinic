package Staff;

import java.util.ArrayList;

import Animals.Animal;

/**
 * Staff main class
 */

public class Staff {

	private String type;
	private int id;
	private String name;
	private String salary;
	private String task;
	private ArrayList<Animal> assignedAnimals;

	public Staff(String type, int id, String name, String salary, String task) {
		this.type = type;
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.task = task;
		this.assignedAnimals = new ArrayList<Animal>();
	}

	public Staff() {
		super();
		assignedAnimals = new ArrayList<Animal>();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public ArrayList<Animal> getAssignedAnimals() {
		return assignedAnimals;
	}

	public void assignAnimal(Animal animal) {
		this.assignedAnimals.add(animal);
	}

	@Override
	public String toString() {
		return "id=" + id + '\n' + "   name='" + name + '\'' + '\n' + "   salary='" + salary + '\'' + '\n';
	}
}