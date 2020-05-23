package VetClinic.util;

import java.util.ArrayList;
import java.util.Scanner;

import Animals.Animal;
import Staff.Staff;

public class Menu {
	private Scanner k = new Scanner(System.in);

	public Menu() {
		super();
	}

	private static ArrayList<Animal> animals = Generator.animalGenerator();

	public void listAllStaff() {
		ArrayList<Staff> staff = Generator.adminGenerator();
		staff.addAll(Generator.medicalGenerator());

		for (Staff s : staff) {
			System.out.println(s.toString());
		}

	}

	public void listStaffByCategories() {

		ArrayList<Staff> adminStaff = Generator.adminGenerator();
		ArrayList<Staff> medicalStaff = Generator.medicalGenerator();
		ArrayList<Staff> itNerds = Sorter.sortItNerd(adminStaff);
		ArrayList<Staff> receptionists = Sorter.sortReceptionist(adminStaff);
		ArrayList<Staff> nurses = Sorter.sortNurse(medicalStaff);
		ArrayList<Staff> traineeVets = Sorter.sortTraineeVet(medicalStaff);
		ArrayList<Staff> veterinarians = Sorter.sortVeterinarian(medicalStaff);

		System.out.println("PRESS 1 TO LIST ALL ADMIN STAFF");
		System.out.println("PRESS 2 TO LIST ALL MEDICAL STAFF");
		System.out.println("PRESS 3 TO LIST ALL IT NERDS");
		System.out.println("PRESS 4 TO LIST ALL RECEPTIONISTS");
		System.out.println("PRESS 5 TO LIST ALL NURSES");
		System.out.println("PRESS 6 TO LIST ALL TRAINEE VETS");
		System.out.println("PRESS 7 TO LIST ALL VETERINARIANS");
		System.out.println("PRESS 8 TO RETURN");

		int input = k.nextInt();

		switch (input) {

		case (1):

			for (Staff a : adminStaff) {
				System.out.println(a);
			}
			System.out.println("CONTINUE LISTING STAFF? 1 = YES / 2 = NO ");
			input = k.nextInt();
			if (input == 1) {
				listStaffByCategories();
			} else {
				mainMenu();
			}

			break;

		case (2):

			for (Staff a : medicalStaff) {
				System.out.println(a);
			}
			System.out.println("CONTINUE LISTING STAFF? 1 = YES / 2 = NO ");
			input = k.nextInt();
			if (input == 1) {
				listStaffByCategories();
			} else {
				mainMenu();
			}

			break;

		case (3):

			for (Staff a : itNerds) {
				System.out.println(a);
			}
			System.out.println("CONTINUE LISTING STAFF? 1 = YES / 2 = NO ");
			input = k.nextInt();
			if (input == 1) {
				listStaffByCategories();
			} else {
				mainMenu();
			}

			break;

		case (4):

			for (Staff a : receptionists) {
				System.out.println(a);
			}
			System.out.println("CONTINUE LISTING STAFF? 1 = YES / 2 = NO ");
			input = k.nextInt();
			if (input == 1) {
				listStaffByCategories();
			} else {
				mainMenu();
			}

			break;

		case (5):

			for (Staff a : nurses) {
				System.out.println(a);
			}
			System.out.println("CONTINUE LISTING STAFF? 1 = YES / 2 = NO ");
			input = k.nextInt();
			if (input == 1) {
				listStaffByCategories();
			} else {
				mainMenu();
			}

			break;

		case (6):

			for (Staff a : traineeVets) {
				System.out.println(a);
			}
			System.out.println("CONTINUE LISTING STAFF? 1 = YES / 2 = NO ");
			input = k.nextInt();
			if (input == 1) {
				listStaffByCategories();
			} else {
				mainMenu();
			}

			break;

		case (7):

			for (Staff a : veterinarians) {
				System.out.println(a);
			}
			System.out.println("CONTINUE LISTING STAFF? 1 = YES / 2 = NO ");
			input = k.nextInt();
			if (input == 1) {
				listStaffByCategories();
			} else {
				mainMenu();
			}

			break;

		case (8):

			mainMenu();

			break;
		}
	}

	public void mainMenu() {

		System.out.println("----------------------------------------------------------------------");
		System.out.println("WELCOME TO THE VET CLINIC!");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("");
		System.out.println("PRESS 1 TO LIST ALL STAFF");
		System.out.println("PRESS 2 TO LIST STAFF BY CATEGORIES");
		System.out.println("PRESS 3 TO LIST ALL ADMIN STAFF PERFORMING A CERTAIN TASK");
		System.out.println("PRESS 4 TO SEARCH FOR A SPECIFIC MEMBER OF STAFF BY NAME");
		System.out.println("PRESS 5 TO LIST ALL ANIMALS");
		System.out.println("PRESS 6 TO LIST ANIMALS BY VARIOUS TYPES");
		System.out.println("PRESS 7 TO SEARCH FOR A SPECIFIC ANIMAL BY NAME");
		System.out.println("PRESS 8 TO EXIT THE PROMPT");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------");

	}

}
