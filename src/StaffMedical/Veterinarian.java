package StaffMedical;

import Staff.Staff;

public class Veterinarian extends Staff {
    public Veterinarian(int id, String name, String salary) {
        super(id, name, salary);
    }

    @Override
    public String toString() {
        return "Veterinarian{"+ super.toString() +"} " ;
    }
}
