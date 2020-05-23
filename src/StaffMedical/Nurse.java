package StaffMedical;

import Staff.Staff;

/**
 * Nurse Class
 */

public class Nurse extends Staff {

	public static final String TYPE = "nurse";

	public Nurse(int id, String name, String salary, String task) {
		super(TYPE, id, name, salary, task);
	}

	public Nurse() {
		super();
	}

	@Override
	public String toString() {
		return "Nurse{" + super.toString() + "} ";
	}
}