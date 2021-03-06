package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {
	@Override
	public Animal getAnimal(String type) throws Exception {

		if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark(); // leave empty constructor, for now!
		} else if (Constants.Animals.Aquatics.Octopus.equals(type)) {
			return new Octopus();
		} else if (Constants.Animals.Aquatics.Fish.equals(type)) {
			return new Fish();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}
