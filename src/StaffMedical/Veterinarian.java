package StaffMedical;

import Staff.Staff;

public class Veterinarian extends Staff {
	public Veterinarian(int id, String name, String salary, String task) {
        super(id, name, salary, task );
    }

    public Veterinarian() {
    	super();
    }
    @Override
    public String toString() {
        return "Veterinarian{"+ super.toString() +"} " ;
    }
}