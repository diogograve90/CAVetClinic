package VetClinic;

import java.util.ArrayList;

import Animals.Animal;
import Staff.Staff;
import VetClinic.util.Generator;

public class VetClinic {

	ArrayList<Staff> adminStaff = Generator.adminGenerator();
	ArrayList<Staff> medicalStaff = Generator.medicalGenerator();
	ArrayList<Animal> animals = Generator.animalGenerator();




	for (Staff as : adminStaff) {
		
		int i;
		i++;
		System.out.println(i + " " + as.toString());

	}

	for (int s1 = 0; s < 10; s++) {
		System.out.println("");
	}
	
	for(Staff ms : medicalStaff) {
		
		int j;
		j++;
		System.out.println(j+" "+ms.toString());
		
	}
	
	for (int s = 0; s < 10; s++) {
		System.out.println("");
	}
	
	for(Animal an : animals ) {
		
		int k;
		k++;
		System.out.println(k+" "+an.toString());
		
		}
		
	}
	
}