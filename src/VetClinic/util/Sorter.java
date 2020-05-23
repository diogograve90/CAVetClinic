package VetClinic.util;

import java.util.ArrayList;

import Animals.Animal;
import Staff.Staff;

/**
 * Sorter Class This class is used to help sort through the lists of animals and
 * staff members and assign the objects to more specific lists
 * 
 */

public class Sorter {
	public static ArrayList<Staff> sortItNerd(ArrayList<Staff> l) {

		ArrayList<Staff> adminStaff = Generator.adminGenerator();

		for (Staff s : adminStaff) {

			switch (s.getType()) {
			case ("itnerd"):
				l.add(s);
				break;
			}
		}
		return l;
	}

	public static ArrayList<Staff> sortReceptionist(ArrayList<Staff> l) {

		ArrayList<Staff> adminStaff = Generator.adminGenerator();

		for (Staff s : adminStaff) {

			switch (s.getType()) {
			case ("receptionist"):
				l.add(s);
				break;
			}
		}
		return l;
	}

	public static ArrayList<Staff> sortNurse(ArrayList<Staff> l) {

		ArrayList<Staff> medicalStaff = Generator.medicalGenerator();

		for (Staff s : medicalStaff) {

			switch (s.getType()) {
			case ("nurse"):
				l.add(s);
				break;

			}

		}
		return l;
	}

	public static ArrayList<Staff> sortTraineeVet(ArrayList<Staff> l) {

		ArrayList<Staff> medicalStaff = Generator.medicalGenerator();

		for (Staff s : medicalStaff) {

			switch (s.getType()) {
			case ("traineevet"):
				l.add(s);
				break;

			}

		}
		return l;
	}

	public static ArrayList<Staff> sortVeterinarian(ArrayList<Staff> l) {

		ArrayList<Staff> medicalStaff = Generator.medicalGenerator();

		for (Staff s : medicalStaff) {

			switch (s.getType()) {
			case ("veterinarian"):
				l.add(s);
				break;

			}

		}
		return l;
	}

	public static ArrayList<Animal> sortDog(ArrayList<Animal> l) {

		ArrayList<Animal> returned = new ArrayList<Animal>();

		ArrayList<Animal> animals = Generator.animalGenerator();

		for (Animal s : animals) {

			switch (s.getType()) {
			case ("dog"):
				returned.add(s);
				break;

			}

		}
		return returned;
	}

	public static ArrayList<Animal> sortRabbit(ArrayList<Animal> l) {

		ArrayList<Animal> returned = new ArrayList<Animal>();

		ArrayList<Animal> animals = Generator.animalGenerator();

		for (Animal s : animals) {

			switch (s.getType()) {
			case ("dog"):
				returned.add(s);
				break;

			}

		}
		return returned;

	}

	public static ArrayList<Animal> sortCat(ArrayList<Animal> l) {

		ArrayList<Animal> returned = new ArrayList<Animal>();

		ArrayList<Animal> animals = Generator.animalGenerator();

		for (Animal s : animals) {

			switch (s.getType()) {
			case ("cat"):
				returned.add(s);
				break;

			}

		}
		return returned;

	}

}
