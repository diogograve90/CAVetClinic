package VetClinic.util;

import java.util.ArrayList;

import Animals.Animal;
import Staff.Staff;

public class Assigner {
	
	public static void assign(ArrayList<Animal> animal, ArrayList<Staff> staff) {

		for (Animal a : animal) {
			for (Staff s : staff) {

				switch (s.getType()) {

				case ("nurse"):

					a.setStaffResponsible(s);
					s.assignAnimal(a);
					break;

				case ("traineevet"):

					a.setStaffResponsible(s);
					s.assignAnimal(a);
					break;

				case ("veterinarian"):

					a.setStaffResponsible(s);
					s.assignAnimal(a);
					break;
				}
			}
		}
	}
}
