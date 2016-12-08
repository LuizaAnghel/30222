package javasmmr.zoowsome.services.factories;

public final class Constants {

	public static final Integer NR_OF_ANIMALS = 15;
	public static final Integer NR_OF_CARETAKERS = 3;

	public static final class Species {
		public static final String MAMMALS = "Mammals";
		public static final String REPTILES = "Reptiles";
		public static final String BIRDS = "Birds";
		public static final String AQUATICS = "Aquatics";
		public static final String INSECTS = "Insects";
	}

	public static final class Animals {

		public static final class Mammals {
			public static final String TIGER = "TIGER";
			public static final String MONKEY = "MONKEY";
			public static final String COW = "COW";
		}

		public static final class Reptiles {
			public static final String LIZZARD = "LIZZARD";
			public static final String SNAKE = "SNAKE";
			public static final String CROCODILE = "CROCODILE";
		}

		public static final class Birds {
			public static final String PENGUIN = "PENGUIN";
			public static final String EAGLE = "EAGLE";
			public static final String FLAMINGO = "FLAMINGO";
		}

		public static final class Aquatics {
			public static final String SHARK = "SHARK";
			public static final String SEAL = "SEAL";
			public static final String DOLPHIN = "DOLPHIN";
		}

		public static final class Insects {
			public static final String BUTTERFLY = "BUTTERFLY";
			public static final String SPIDER = "SPIDER";
			public static final String COCKROACH = "COCKROACH";
		}
	}

	public static final class Employees {
		public static final class Caretakers {
			public static final String TCO_SUCCESS = "SUCCESS";
			public static final String TCO_KILLED = "KILLED";
			public static final String TCO_NO_TIME = "NO_TIME";
		}

		public static final String CARETAKER = "CARETAKER";
	}

	public static final class XML_TAGS {
		public static final String ANIMAL = "ANIMAL";
		public static final String EMPLOYEE = "EMPLOYEE";
		public static final String DISCRIMINANT = "DISCRIMINANT";
	}
}