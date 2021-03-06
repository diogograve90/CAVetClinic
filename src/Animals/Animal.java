package Animals;

import Staff.Staff;

/**
 * Animal main class
 */

public abstract class Animal {

	private String type;
	private int id;
	private String name;
	private int age;
	private String medicalCondition;
	private Staff staffResponsible;

	public Animal(String type, int id, String name, int age, String medicalCondition) {
		this.type = type;
		this.id = id;
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
	}

	public Animal() {

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	public Staff getStaffResponsible() {
		return staffResponsible;
	}

	public void setStaffResponsible(Staff staffResponsible) {
		this.staffResponsible = staffResponsible;
	}

	@Override
	public String toString() {
		return "id=" + id + '\n' + "name='" + name + '\'' + '\n' + "age=" + age + '\n' + "medicalCondition='"
				+ medicalCondition + '\'' + '\n';
	}
}