package VetClinic.util;

import java.util.ArrayList;
import java.util.Random;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Rabbit;
import Staff.Staff;
import StaffAdmin.ItNerd;
import StaffAdmin.Receptionist;
import StaffMedical.Nurse;
import StaffMedical.TraineeVet;
import StaffMedical.Veterinarian;


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
	protected static String[] arrayOfAnimalNames = { "" };

	
	
	public static String taskGenerator(String[] array) {

		Random r = new Random();
		int index = r.nextInt(array.length);

		return array[index];

	}
	
	public static String animalNameGenerator() {
		

		Random r = new Random();
		int index = r.nextInt(arrayOfAnimalNames.length);

		return arrayOfAnimalNames[index];

		
	}
	
	public static int animalAgeGenerator(int ageLimit) {
		
		Random r = new Random();
		int age = r.nextInt(ageLimit)+1;

		return age;

		
	}
	
	public static String animalDiseaseGenerator() {
		

		Random r = new Random();
		int index = r.nextInt(arrayOfDiseases.length);

		return arrayOfDiseases[index];

		
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

	public static ArrayList<Staff> medicalGenerator() {

		ArrayList<Staff> returnedStaff = new ArrayList<Staff>();

		for (int i = 0; i < 5; i++) {
			
			Staff vet = new Veterinarian();

			int minSal = 3000;
			int maxSal = 8001;

			Random r = new Random();
			Integer salaryValue = r.nextInt(maxSal - minSal) + minSal;
			String salary = salaryValue.toString();

			vet.setName(firstNameGenerator() + " " + lastNameGenerator());
			vet.setSalary(salary);
			vet.setTask(taskGenerator(arrayOfTasksVeterinarian));
			vet.setId(i + 1);
			
			returnedStaff.add(vet);

		} 

		for (int j = 5; j < 30; j++) {

			Random r1 = new Random();
			Integer decision = r1.nextInt(3);

			switch (decision) {

			case (0):
				
				Staff vet = new Veterinarian();

				int minSalVet = 3000;
				int maxSalVet = 8001;

				Random r2 = new Random();
				Integer salaryValueVet = r2.nextInt(maxSalVet - minSalVet) + minSalVet;
				String salaryVet = salaryValueVet.toString();

				vet.setName(firstNameGenerator() + " " + lastNameGenerator());
				vet.setSalary(salaryVet);
				vet.setTask(taskGenerator(arrayOfTasksVeterinarian));
				vet.setId(j + 1);
				
				returnedStaff.add(vet);

				break;

				
			case (1):
				Staff nurse = new Nurse();

				int minSalNurse = 1500;
				int maxSalNurse = 5001;

				Random r3 = new Random();
				Integer salaryValueNurse = r3.nextInt(maxSalNurse - minSalNurse) + minSalNurse;
				String salaryNurse = salaryValueNurse.toString();

				nurse.setName(firstNameGenerator() + " " + lastNameGenerator());
				nurse.setSalary(salaryNurse);
				nurse.setTask(taskGenerator(arrayOfTasksNurse));
				nurse.setId(j + 1);
				
				returnedStaff.add(nurse);

				break;

			case (2):
				
				Staff trainee = new TraineeVet();

				int minSalTrainee = 1500;
				int maxSalTrainee = 5001;

				Random r4 = new Random();
				Integer salaryValueTrainee = r4.nextInt(maxSalTrainee - minSalTrainee) + minSalTrainee;
				String salaryTrainee = salaryValueTrainee.toString();

				trainee.setName(firstNameGenerator() + " " + lastNameGenerator());
				trainee.setSalary(salaryTrainee);
				trainee.setTask(taskGenerator(arrayOfTasksTraineeVet));
				trainee.setId(j + 1);
				
				returnedStaff.add(trainee);

				break;

			} 

		}

		return null;
	}
	
	public static ArrayList<Animal> animalGenerator() {

		ArrayList<Animal> returnedAnimals = new ArrayList<Animal>();

		for (int i = 0; i < 1000; i++) {
			Random r1 = new Random();
			Integer decision = r1.nextInt(3);

			switch (decision) {

			case (0):
				
				Animal dog = new Dog();
				dog.setId(i+1);
				dog.setName(animalNameGenerator());
				dog.setAge(animalAgeGenerator(Dog.DOG_AGE_LIMIT));
				dog.setMedicalCondition(animalDiseaseGenerator());			  			
				returnedAnimals.add(dog);
				
				break;

			case (1):

				Animal cat = new Cat();
				cat.setId(i+1);
				cat.setName(animalNameGenerator());
				cat.setAge(animalAgeGenerator(Cat.CAT_AGE_LIMIT));
				cat.setMedicalCondition(animalDiseaseGenerator());			  			
				returnedAnimals.add(cat);
				
				break;

			case (2):

				Animal rabbit = new Rabbit();
				rabbit.setId(i+1);
				rabbit.setName(animalNameGenerator());
				rabbit.setAge(animalAgeGenerator(Rabbit.RABBIT_AGE_LIMIT));
				rabbit.setMedicalCondition(animalDiseaseGenerator());			  			
				returnedAnimals.add(rabbit);
				
				break;
			}


		}

		return returnedAnimals;
	}
}