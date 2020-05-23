package VetClinic.util;

import java.util.ArrayList;

import Animals.Animal;
import Staff.Staff;

/**
 * Assigner Class This class is used to assign each animal to a staff member,
 * and add this animal to the list of animals of said staff member
 * 
 */

public class Assigner {

	// This method works by going through the list of animals and picking one, then
	// going through the list of staff and assigning this animal to a staff member
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
