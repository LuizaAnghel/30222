package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Mammals.TIGER.equals(type)) {
			return new Tiger(); // leave empty constructor, for now!
		} else if (Constants.Animals.Mammals.MONKEY.equals(type)) {
			return new Monkey();
		} else if (Constants.Animals.Mammals.COW.equals(type)) {
			return new Cow();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
