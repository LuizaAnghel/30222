package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Penguin;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Flamingo;

public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.PENGUIN.equals(type)) {
			return new Penguin(); // leave empty constructor, for now!
		} else if (Constants.Animals.Birds.EAGLE.equals(type)) {
			return new Eagle();
		} else if (Constants.Animals.Birds.FLAMINGO.equals(type)) {
			return new Flamingo();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}