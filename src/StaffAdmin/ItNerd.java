package StaffAdmin;

import Staff.Staff;

public class ItNerd extends Staff {

    public ItNerd(int id, String name, String salary) {
        super(id, name, salary);
    }

    @Override
    public String toString() {
        return "ItNerd{"+ super.toString() +"} " ;
    }
}
