package StaffAdmin;

/**
 * IT Nerd Class
 */

import Staff.Staff;

public class ItNerd extends Staff {

	public static final String TYPE = "itnerd";

	public ItNerd(int id, String name, String salary, String task) {
		super(TYPE, id, name, salary, task);
	}

	public ItNerd() {
		super();
	}

	@Override
	public String toString() {
		return "ItNerd{" + super.toString() + "} ";
	}
}