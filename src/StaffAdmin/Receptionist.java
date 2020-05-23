package StaffAdmin;

import Staff.Staff;

/**
 * Receptionist Class
 */

public class Receptionist extends Staff {

	public static final String TYPE = "receptionist";

	public Receptionist(int id, String name, String salary, String task) {
		super(TYPE, id, name, salary, task);
	}

	public Receptionist() {
		super();
	}

	@Override
	public String toString() {
		return "Receptionist{" + super.toString() + "} ";
	}
}