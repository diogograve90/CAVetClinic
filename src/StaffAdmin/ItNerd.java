package StaffAdmin;

import Staff.Staff;

public class ItNerd extends Staff {

	public ItNerd(int id, String name, String salary, String task ) {
        super(id, name, salary, task);
    }

    public ItNerd() {
    	super();
    }
    @Override
    public String toString() {
        return "ItNerd{"+ super.toString() +"} " ;
    }
}