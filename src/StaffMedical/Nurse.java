package StaffMedical;

import Staff.Staff;

public class Nurse extends Staff {
    public Nurse(int id, String name, String salary) {
        super(id, name, salary);
    }

    @Override
    public String toString() {
        return "Nurse{"+ super.toString() +"} " ;
    }
}
