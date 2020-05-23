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

/**
 * Generator Class This class is used to generate the necessary objects in
 * runtime, as per the CA document
 * 
 */

public class Generator {
	protected static String[] arrayOfAnimalNames = { "Aardvark", "Albatross", "Alligator", "Alpaca", "Ant", "Anteater",
			"Antelope", "Ape", "Armadillo", "Donkey", "Baboon", "Badger", "Barracuda", "Bat", "Bear", "Beaver", "Bee",
			"Bison", "Boar", "Buffalo", "Butterfly", "Camel", "Capybara", "Caribou", "Cassowary", "Cat", "Caterpillar",
			"Cattle", "Chamois", "Cheetah", "Chicken", "Chimpanzee", "Chinchilla", "Chough", "Clam", "Cobra",
			"Cockroach", "Cod", "Cormorant", "Coyote", "Crab", "Crane", "Crocodile", "Crow", "Curlew", "Deer",
			"Dinosaur", "Dog", "Dogfish", "Dolphin", "Dotterel", "Dove", "Dragonfly", "Duck", "Dugong", "Dunlin",
			"Eagle", "Echidna", "Eel", "Eland", "Elephant", "Elk", "Emu", "Falcon", "Ferret", "Finch", "Fish",
			"Flamingo", "Fly", "Fox", "Frog", "Gaur", "Gazelle", "Gerbil", "Giraffe", "Gnat", "Gnu", "Goat",
			"Goldfinch", "Goldfish", "Goose", "Gorilla", "Goshawk", "Grasshopper", "Grouse", "Guanaco", "Gull",
			"Hamster", "Hare", "Hawk", "Hedgehog", "Heron", "Herring", "Hippopotamus", "Hornet", "Horse", "Human",
			"Hummingbird", "Hyena", "Ibex", "Ibis", "Jackal", "Jaguar", "Jay", "Jellyfish", "Kangaroo", "Kingfisher",
			"Koala", "Kookabura", "Kouprey", "Kudu", "Lapwing", "Lark", "Lemur", "Leopard", "Lion", "Llama", "Lobster",
			"Locust", "Loris", "Louse", "Lyrebird", "Magpie", "Mallard", "Manatee", "Mandrill", "Mantis", "Marten",
			"Meerkat", "Mink", "Mole", "Mongoose", "Monkey", "Moose", "Mosquito", "Mouse", "Mule", "Narwhal", "Newt",
			"Nightingale", "Octopus", "Okapi", "Opossum", "Oryx", "Ostrich", "Otter", "Owl", "Oyster", "Panther",
			"Parrot", "Partridge", "Peafowl", "Pelican", "Penguin", "Pheasant", "Pig", "Pigeon", "Pony", "Porcupine",
			"Porpoise", "Quail", "Quelea", "Quetzal", "Rabbit", "Raccoon", "Rail", "Ram", "Rat", "Raven", "Red deer",
			"Red panda", "Reindeer", "Rhinoceros", "Rook", "Salamander", "Salmon", "Sand Dollar", "Sandpiper",
			"Sardine", "Scorpion", "Seahorse", "Seal", "Shark", "Sheep", "Shrew", "Skunk", "Snail", "Snake", "Sparrow",
			"Spider", "Spoonbill", "Squid", "Squirrel", "Starling", "Stingray", "Stinkbug", "Stork", "Swallow", "Swan",
			"Tapir", "Tarsier", "Termite", "Tiger", "Toad", "Trout", "Turkey", "Turtle", "Viper", "Vulture", "Wallaby",
			"Walrus", "Wasp", "Weasel", "Whale", "Wildcat", "Wolf", "Wolverine", "Wombat", "Woodcock", "Woodpecker",
			"Worm", "Wren", "Yak", "Zebra" };

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
			"Remove virus", "Format a pc", "Manage database", "Develop company's app", "Tech support", };
	protected static String[] arrayOfTasksReceptionist = { "Schedule exams", "Manage clients", "Payment checkout",
			"Receive new client" };
	protected static String[] arrayOfTasksVeterinarian = { "Treat wounded animal", "Surgery", "Yearly checkup" };
	protected static String[] arrayOfTasksNurse = { "Take care of animal", "Assist veterinarian", "Give shots" };
	protected static String[] arrayOfTasksTraineeVet = { "Watch veterinarian working", "Assist nurse",
			"Watch an animal " };

	// this method picks a random task from a list
	public static String taskGenerator(String[] array) {

		Random r = new Random();
		int index = r.nextInt(array.length);

		return array[index];

	}

	// this method returns a random animal name
	public static String animalNameGenerator() {

		Random r = new Random();
		int index = r.nextInt(arrayOfAnimalNames.length);

		return arrayOfAnimalNames[index];

	}

	// this method returns an animal age within a certain limit
	public static int animalAgeGenerator(int ageLimit) {

		Random r = new Random();
		int age = r.nextInt(ageLimit) + 1;

		return age;

	}

	// this method returns a random disease from a list
	public static String animalDiseaseGenerator() {

		Random r = new Random();
		int index = r.nextInt(arrayOfDiseases.length);

		return arrayOfDiseases[index];

	}

	// this method returns a random first name from a list
	public static String firstNameGenerator() {

		Random r = new Random();
		int index = r.nextInt(arrayOfFirstNames.length);

		return arrayOfFirstNames[index];

	}

	// this method returns a random last name from a list
	public static String lastNameGenerator() {

		Random r = new Random();
		int index = r.nextInt(arrayOfLastNames.length);

		return arrayOfLastNames[index];

	}

	// this method generates 10 admin staff as per the CA document
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
				itNerd.setType(ItNerd.TYPE);

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
				receptionist.setType(Receptionist.TYPE);

				returnedStaff.add(receptionist);

			}

		}

		return returnedStaff;

	}

	// this method generates 30 medical staff as per the CA document
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
			vet.setType(Veterinarian.TYPE);

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
				vet.setType(Veterinarian.TYPE);

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
				nurse.setType(Nurse.TYPE);

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
				trainee.setType(TraineeVet.TYPE);

				returnedStaff.add(trainee);

				break;

			}

		}

		return returnedStaff;
	}

	// this method generates 1000 animals as per the CA document
	public static ArrayList<Animal> animalGenerator() {

		ArrayList<Animal> returnedAnimals = new ArrayList<Animal>();

		for (int i = 0; i < 1000; i++) {
			Random r1 = new Random();
			Integer decision = r1.nextInt(3);

			switch (decision) {

			case (0):

				Animal dog = new Dog();
				dog.setId(i + 1);
				dog.setName(animalNameGenerator());
				dog.setAge(animalAgeGenerator(Dog.DOG_AGE_LIMIT));
				dog.setMedicalCondition(animalDiseaseGenerator());
				dog.setType(Dog.TYPE);
				returnedAnimals.add(dog);

				break;

			case (1):

				Animal cat = new Cat();
				cat.setId(i + 1);
				cat.setName(animalNameGenerator());
				cat.setAge(animalAgeGenerator(Cat.CAT_AGE_LIMIT));
				cat.setMedicalCondition(animalDiseaseGenerator());
				cat.setType(Cat.TYPE);
				returnedAnimals.add(cat);

				break;

			case (2):

				Animal rabbit = new Rabbit();
				rabbit.setId(i + 1);
				rabbit.setName(animalNameGenerator());
				rabbit.setAge(animalAgeGenerator(Rabbit.RABBIT_AGE_LIMIT));
				rabbit.setMedicalCondition(animalDiseaseGenerator());
				rabbit.setType(Rabbit.TYPE);
				returnedAnimals.add(rabbit);

				break;
			}

		}

		return returnedAnimals;
	}

}