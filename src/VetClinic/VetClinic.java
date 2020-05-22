package VetClinic;

import java.util.ArrayList;

import Animals.Animal;
import Staff.Staff;
import VetClinic.util.Generator;

public class VetClinic {

	public static void main(String[] args) {

		ArrayList<Staff> adminStaff = Generator.adminGenerator();
		ArrayList<Staff> medicalStaff = Generator.medicalGenerator();
		ArrayList<Animal> animals = Generator.animalGenerator();
		int i = 0;
		int j = 0;
		int k = 0;

		for (Staff as : adminStaff) {
			
			i++;
			System.out.println(i + " " + as.toString());

		}

		for (int s = 0; s < 10; s++) {
			System.out.println("");
		}
		
		for(Staff ms : medicalStaff) {
			
			j++;
			System.out.println(j+" "+ms.toString());
			
		}
		
		for (int s = 0; s < 10; s++) {
			System.out.println("");
		}
		
		for(Animal an : animals ) {
			
			k++;
			System.out.println(k+" "+an.toString());
			
		}
		

	}

}