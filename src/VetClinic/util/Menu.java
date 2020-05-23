package VetClinic.util;

import java.util.ArrayList;
import java.util.Scanner;

import Animals.Animal;
import Staff.Staff;

/**
 * Menu Class This class is used to manage the menu and to better contain the
 * algorithm of all the functionalities
 * 
 */

public class Menu {

	private Scanner k = new Scanner(System.in);

	public Menu() {
		super();
	}

	// this method is executed when you press 1 on the main menu
	// it just goes through the list of all staff
	public void listAllStaff() {
		ArrayList<Staff> staff = Generator.adminGenerator();
		staff.addAll(Generator.medicalGenerator());

		for (Staff s : staff) {
			System.out.println(s.toString());
		}

	}

	// this method is executed when you press 2 on the main menu
	// it then sends you to a sub menu to choose different options of what list to
	// display, and then gives you the option to either pick another one or go back
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
			}

			break;

		case (8):
			break;

		}
	}

	// this method is executed when you press 3 on the main menu
	// it receives an input from the user and goes through the list of admin staff
	// checking each object to see if it's assigned task matches with the input
	// it then gives you the option to either try another task or go back
	public void listAdminTask(String task) {

		ArrayList<Staff> adminStaff = Generator.adminGenerator();
		boolean found = false;

		for (Staff s : adminStaff) {
			if (s.getTask().trim().replaceAll(" ", "").toLowerCase()
					.contains(task.trim().replaceAll(" ", "").toLowerCase())) {
				found = true;
				System.out.println(s.toString());

			}
		}

		System.out.println("----------------------------------------------------------------------");
		if (found == false) {
			System.out.println("NO EMPLOYEES FOUND WITH A MATCHING TASK");
		}
		System.out.println("SEARCH USING ANOTHER TASK? 1 = YES / 2 = NO ");
		int input = k.nextInt();
		if (input == 1) {
			System.out.println("TYPE IN THE TASK THE EMPLOYEE IS ASSIGNED TO");
			String task2 = k.next();
			listAdminTask(task2);
		}
	}

	// this method is executed when you press 4 on the main menu
	// it receives an input from the user and goes through the list of staff
	// checking each object to see if it's assigned task matches with the input
	// it then gives you the option to either try another name or go back
	public void nameSearch(String name) {

		ArrayList<Staff> staff = Generator.adminGenerator();
		staff.addAll(Generator.medicalGenerator());
		boolean found = false;

		for (Staff s : staff) {
			if (s.getName().trim().replaceAll(" ", "").toLowerCase()
					.contains(name.trim().replaceAll(" ", "").toLowerCase())) {

				System.out.println(s.toString());
				found = true;
			}

		}

		System.out.println("----------------------------------------------------------------------");
		if (found == false) {
			System.out.println("NO EMPLOYEES FOUND WITH THAT NAME");
		}
		System.out.println("SEARCH ANOTHER NAME? 1 = YES / 2 = NO ");
		int input = k.nextInt();
		if (input == 1) {
			System.out.println("TYPE IN THE NAME OF THE EMPLOYEE");
			String name2 = k.next();
			nameSearch(name2);
		}

	}

	// this method is executed when you press 1 on the main menu
	// it just goes through the list of all animals
	public void listAllAnimals() {
		ArrayList<Animal> animal = Generator.animalGenerator();

		for (Animal s : animal) {

			System.out.println(s.toString());
		}

	}

	// this method is executed when you press 6 on the main menu
	// it receives an input from the user and goes through the list of animals
	// checking each object to see if it's assigned task matches with the input
	// it then gives you the option to either try another name or go back
	public void animalNameSearch(String name) {

		ArrayList<Animal> animals = Generator.animalGenerator();

		boolean found = false;

		for (Animal s : animals) {
			if (s.getName().trim().replaceAll(" ", "").toLowerCase()
					.contains(name.trim().replaceAll(" ", "").toLowerCase())) {

				System.out.println(s.toString());
				found = true;
			}

		}

		System.out.println("----------------------------------------------------------------------");
		if (found == false) {
			System.out.println("NO ANIMALS FOUND WITH THAT NAME");
		}
		System.out.println("SEARCH ANOTHER NAME? 1 = YES / 2 = NO ");
		int input = k.nextInt();
		if (input == 1) {
			System.out.println("TYPE IN THE NAME OF ANIMAL");
			String name2 = k.next();
			animalNameSearch(name2);
		}

	}

	// this method is executed when you press 2 on the main menu
	// it then sends you to a sub menu to choose different options of what list to
	// display, and then gives you the option to either pick another one or go back
	public void listAnimalsByType() {
		ArrayList<Animal> animals = Generator.animalGenerator();

		ArrayList<Animal> dogs = Sorter.sortDog(animals);
		ArrayList<Animal> cats = Sorter.sortCat(animals);
		ArrayList<Animal> rabbits = Sorter.sortRabbit(animals);

		System.out.println("PRESS 1 TO LIST ALL ANIMALS");
		System.out.println("PRESS 2 TO LIST ALL DOGS");
		System.out.println("PRESS 3 TO LIST ALL CATS");
		System.out.println("PRESS 4 TO LIST ALL RABBITS");
		System.out.println("PRESS 5 TO RETURN");

		int input = k.nextInt();

		switch (input) {

		case (1):

			for (Animal a : animals) {
				System.out.println(a);
			}
			System.out.println("CONTINUE LISTING ANIMALS? 1 = YES / 2 = NO ");
			input = k.nextInt();
			if (input == 1) {
				listAnimalsByType();
			}

			break;

		case (2):

			for (Animal a : dogs) {
				System.out.println(a);
			}
			System.out.println("CONTINUE LISTING ANIMALS? 1 = YES / 2 = NO ");
			input = k.nextInt();
			if (input == 1) {
				listAnimalsByType();
			}

			break;

		case (3):

			for (Animal a : cats) {
				System.out.println(a);
			}
			System.out.println("CONTINUE LISTING ANIMALS? 1 = YES / 2 = NO ");
			input = k.nextInt();
			if (input == 1) {
				listAnimalsByType();
			}

			break;

		case (4):

			for (Animal a : rabbits) {
				System.out.println(a);
			}
			System.out.println("CONTINUE LISTING ANIMALS? 1 = YES / 2 = NO ");
			input = k.nextInt();
			if (input == 1) {
				listAnimalsByType();
			}

			break;
		case (5):
			break;

		}
	}

	// this is the main menu of the Vet clinic, it has a switch case that takes in
	// the input of the user
	// and runs a certain method depending on what the user typed in
	public void mainMenu() {
		int repeat = 0;
		while (repeat != 1) {

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

			int input = k.nextInt();

			switch (input) {
			case (1):
				listAllStaff();
				break;
			case (2):
				listStaffByCategories();
				break;
			case (3):
				System.out.println("TYPE IN THE TASK THE EMPLOYEE IS ASSIGNED TO");
				String task = k.next();
				System.out.println("----------------------------------------------------------------------");
				listAdminTask(task);
				break;

			case (4):
				System.out.println("TYPE IN THE NAME OF THE EMPLOYEE");
				String name = k.next();
				System.out.println("----------------------------------------------------------------------");
				nameSearch(name);
				break;

			case (5):
				listAllAnimals();
				break;

			case (6):
				listAnimalsByType();
				break;
			case (7):
				System.out.println("TYPE IN THE NAME OF THE ANIMAL");
				String animalName = k.next();
				System.out.println("----------------------------------------------------------------------");
				animalNameSearch(animalName);
				break;
			case (8):
				System.out.println("----------------------------------------------------------------------");
				System.out.println("GOODBYE! THANKS FOR USING OUR VET CLINIC SYSTEM!");
				repeat++;

			}

		}
	}

}