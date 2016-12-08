package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Cockroach;

public class InsectFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.BUTTERFLY.equals(type)) {
			return new Butterfly(); // leave empty constructor, for now!
		} else if (Constants.Animals.Insects.SPIDER.equals(type)) {
			return new Spider();
		} else if (Constants.Animals.Insects.COCKROACH.equals(type)) {
			return new Cockroach();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}
}