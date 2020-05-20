package StaffMedical;

import Staff.Staff;

public class Nurse extends Staff {
	public Nurse(int id, String name, String salary, String task) {
        super(id, name, salary, task);
    }
    
    public Nurse() {
    	super();
    }
    
    @Override
    public String toString() {
        return "Nurse{"+ super.toString() +"} " ;
    }
}