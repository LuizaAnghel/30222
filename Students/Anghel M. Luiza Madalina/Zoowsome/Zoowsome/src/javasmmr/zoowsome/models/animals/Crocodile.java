package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Crocodile extends Reptile {

	public Crocodile(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Crocodile() {
		this.setNrOfLegs(4);
		this.setName("Crocodile");
		this.setLaysEggs(true);
		this.setMaintenanceCost(5.6);
		this.setDangerPerc(0.9);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Reptiles.CROCODILE);
	}
}
