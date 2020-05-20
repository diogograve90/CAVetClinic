package StaffMedical;

import Staff.Staff;

public class TraineeVet extends Staff {
	public TraineeVet(int id, String name, String salary, String task) {
        super(id, name, salary, task );
    }

    public TraineeVet() {
    	super();
    }
    @Override
    public String toString() {
        return "TraineeVet{"+ super.toString() +"} " ;
    }
}
