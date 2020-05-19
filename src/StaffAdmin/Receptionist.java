package StaffAdmin;

import Staff.Staff;

public class Receptionist extends Staff {
    public Receptionist(int id, String name, String salary) {
        super(id, name, salary);
    }

    @Override
    public String toString() {
        return "Receptionist{"+ super.toString() +"} " ;
    }
}
