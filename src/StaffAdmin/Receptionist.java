package StaffAdmin;

import Staff.Staff;

public class Receptionist extends Staff {
	public Receptionist(int id, String name, String salary, String task) {
        super(id, name, salary, task);
    }

    public Receptionist() {
    	super();
    }
    @Override
    public String toString() {
        return "Receptionist{"+ super.toString() +"} " ;
    }
}