package StaffMedical;

import Staff.Staff;

/**
 * Veterinarian Class
 */

public class Veterinarian extends Staff {

	public static final String TYPE = "veterinarian";

	public Veterinarian(int id, String name, String salary, String task) {
		super(TYPE, id, name, salary, task);
	}

	public Veterinarian() {
		super();
	}

	@Override
	public String toString() {
		return "Veterinarian{" + super.toString() + "} ";
	}
}