package StaffMedical;

import Staff.Staff;

/**
 * TraineeVet Class
 */

public class TraineeVet extends Staff {

	public static final String TYPE = "traineevet";

	public TraineeVet(int id, String name, String salary, String task) {
		super(TYPE, id, name, salary, task);
	}

	public TraineeVet() {
		super();
	}

	@Override
	public String toString() {
		return "TraineeVet{" + super.toString() + "} ";
	}
}
