package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Seal;
import javasmmr.zoowsome.models.animals.Dolphin;

public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Aquatics.SHARK.equals(type)) {
			return new Shark(); // leave empty constructor, for now!
		} else if (Constants.Animals.Aquatics.SEAL.equals(type)) {
			return new Seal();
		} else if (Constants.Animals.Aquatics.DOLPHIN.equals(type)) {
			return new Dolphin();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}