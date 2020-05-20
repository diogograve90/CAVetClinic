package VetClinic;

import java.util.ArrayList;

import Staff.Staff;
import VetClinic.util.Generator;



public class VetClinic {
	public static void main(String[] args) {

		ArrayList<Staff> adminStaff = Generator.adminGenerator();
		int i = 0;

		for (Staff as : adminStaff) {
			
			i++;
			System.out.println(i + " " + as.toString());

		}

	}

}
