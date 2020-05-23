package VetClinic.util;

import java.util.ArrayList;

import Staff.Staff;

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

}
