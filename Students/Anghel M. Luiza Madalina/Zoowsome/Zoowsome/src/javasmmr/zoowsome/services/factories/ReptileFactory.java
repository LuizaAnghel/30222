package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Lizzard;
import javasmmr.zoowsome.models.animals.Crocodile;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Reptiles.SNAKE.equals(type)) {
			return new Snake(); // leave empty constructor, for now!
		} else if (Constants.Animals.Reptiles.LIZZARD.equals(type)) {
			return new Lizzard();
		} else if (Constants.Animals.Reptiles.CROCODILE.equals(type)) {
			return new Crocodile();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}
