package VetClinic;

import java.util.ArrayList;

import Staff.Staff;
import VetClinic.util.Generator;

public class VetClinic {
	public static void main(String[] args) {

		ArrayList<Staff> adminStaff = Generator.adminGenerator();
		ArrayList<Staff> medicalStaff = Generator.medicalGenerator();
		int i = 0;
		int j = 0;

		for (Staff as : adminStaff) {
			
			i++;
			System.out.println(i + " " + as.toString());

		}

		for (int k = 0; k < 10; k++) {
			System.out.println("");
		}
		
		for(Staff ms : medicalStaff) {
			
			j++;
			System.out.println(j+" "+ms.toString());
			
		}

	}

}
