package VetClinic;

import java.util.ArrayList;

import Animals.Animal;
import Staff.Staff;
import VetClinic.util.Assigner;
import VetClinic.util.Generator;
import VetClinic.util.Menu;

/**
 * VetClinic Class This class contains the main() method and it runs the main
 * menu
 * 
 */

public class VetClinic {

	private static ArrayList<Staff> medicalStaff = Generator.medicalGenerator();
	private static ArrayList<Animal> animals = Generator.animalGenerator();

	public static void main(String[] args) {

		Assigner.assign(animals, medicalStaff);

		Menu menu = new Menu();

		menu.mainMenu();

	}

}