package VetClinic.util;

import java.util.ArrayList;
import java.util.Random;

import Staff.Staff;
import StaffAdmin.ItNerd;
import StaffAdmin.Receptionist;


public class Generator {
	protected static String[] arrayOfFirstNames = { "Joe", "Donna", "Ronald", "Sarah", "David", "Courtney", "Irwin",
			"Linda", "Michael", "Cindy", "Tom", "Rebekah", "Todd", "Tracy", "Peter", "Nicole", "Marcelo", "Jennifer",
			"Rick", "Andrea", "Bruce", "Jaclyn", "Doug", "Shirley", "Steve", "Liz", "Waldo", "Theresa", "Scott",
			"Colby", "Beth", "Larry", "Emily", "Paul", "Kate", "Sam", "Dianne", "Dustin", "Alethea", "Wayne",
			"Kristina", "Christian", "Danny", "Breya", "Andrew", "Alison", "Tim", "Mary", "Chris", "Susie", "Jeremy",
			"Willy", "Jessica", "Marcus", "Kelly", "Kyle", "Stephanie", "Isaiah", "Hillary", "Eric", "Julia", "Donald",
			"Meredith", "Kevin", "Leslie", "Blake", "Angela", "Cliff", "Debbie", "Dylan", "Erin", "Alex", "Monica",
			"Nathan", "Wendy", "Josh", "Megan", "Adam", "Michelle", "Carey", "Ashley", "Brian", "Jason", "Melanie",
			"Jim", "Monica", "Jamie", "Rhonda", "Steven", "Perry", "Byron", "Laura", "Harry", "Brooke", "Drew", "Vicki",
			"Gary", "Anita", "Felipe", "Josie" };
	protected static String[] arrayOfLastNames = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller",
			"Wilson", "Moore", "Taylor", "Washington", "Jefferson", "Lincoln", "Hamilton", "Jackson", "Grant",
			"Franklin", "McKinley", "Cleveland", "Madison", "Chase", "Nicholson", "Fauver", "Doe", "Southard",
			"Schmidt", "Hodson", "McDonald", "Stickley", "Miller", "Combs", "Bohus", "Krippner", "Amtower", "Banks",
			"Wallace", "Bannister", "Dehaven", "Yost", "Still", "Timbrook", "Peters", "Vaught", "Shellhammer",
			"Andrews", "Krippner", "McAlister", "Wright", "Kensinger", "McClellan", "Ganoe", "Shiley", "Layman",
			"Gearhart", "Yost", "Kushnir", "Bush", "Lowder", "Connolly", "Lowman", "Terveen", "Staton", "Settle",
			"Tinsman", "Nichols", "Baker", "Walters", "Dawe", "Renner", "Michaels", "Faircloth", "Looker", "Hastings",
			"Vaughan", "Anderson", "Zimmerman", "Deere", "Daher", "Lauck", "Stottlemyer", "Clinton", "Obama", "Reagan",
			"Montgomery", "Pugh", "Gavis", "Clark", "Bowers" };
	protected static String[] arrayOfDiseases = { "Kidney disease", "Diabetes", "Arthritis", "Fleas and ticks",
			"Rabies", "Distemper", "Parvovirus", "Dental disease", "Heartworm", "Obesity", "Lyme disease",
			"Psittacosis", "Plague", "Q fever", "Campylobacteriosis", "Leptospirosis", "Salmonellosis", "Toxoplasmosis",
			"Ringworm", "Roundworm", "Tapeworm", "Hookworm", "Capnocytophaga", "Strep zoo" };
	protected static String[] arrayOfTasksItNerd = { "Install office 365", "Unfreeze a computer", "Server maintenance",
			"Remove virus", "Format a computer", "Manage database", "Develop company's app", "Tech support" };
	protected static String[] arrayOfTasksReceptionist = { "Schedule exams", "Manage clients", "Payment checkout",
			"Receive new clients", "Remind clients of appointments" };
	protected static String[] arrayOfTasksVeterinarian = { "Treat wounded animal" };
	protected static String[] arrayOfTasksNurse = { " " };
	protected static String[] arrayOfTasksTraineeVet = { " " };

	
	
	public static String taskGenerator(String[] array) {

		Random r = new Random();
		int index = r.nextInt(array.length);

		return array[index];

	}

	public static String firstNameGenerator() {

		Random r = new Random();
		int index = r.nextInt(arrayOfFirstNames.length);

		return arrayOfFirstNames[index];

	}

	public static String lastNameGenerator() {

		Random r = new Random();
		int index = r.nextInt(arrayOfLastNames.length);

		return arrayOfLastNames[index];

	}

	public static ArrayList<Staff> adminGenerator() {

		ArrayList<Staff> returnedStaff = new ArrayList<Staff>();

		for (int k = 0; k < 10; k++) {

			Random r1 = new Random();
			Integer decision = r1.nextInt(2);

			if (decision == 1) {

				Staff itNerd = new ItNerd();

				int minSal = 1000;
				int maxSal = 3001;

				Random r2 = new Random();
				Integer salaryValue = r2.nextInt(maxSal - minSal) + minSal;
				String salary = salaryValue.toString();

				itNerd.setName(firstNameGenerator() + " " + lastNameGenerator());
				itNerd.setSalary(salary);
				itNerd.setTask(taskGenerator(arrayOfTasksItNerd));
				itNerd.setId(k + 1);

				returnedStaff.add(itNerd);

			} else {

				Staff receptionist = new Receptionist();

				int minSal = 1000;
				int maxSal = 3001;

				Random r3 = new Random();
				Integer salaryValue = r3.nextInt(maxSal - minSal) + minSal;
				String salary = salaryValue.toString();

				receptionist.setName(firstNameGenerator() + " " + lastNameGenerator());
				receptionist.setSalary(salary);
				receptionist.setTask(taskGenerator(arrayOfTasksReceptionist));
				receptionist.setId(k + 1);

				returnedStaff.add(receptionist);

			}

		}
		
		return returnedStaff;

	}
}
