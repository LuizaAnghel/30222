package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Butterfly extends Insect {

	public Butterfly(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Butterfly() {
		this.setNrOfLegs(4);
		this.setName("Butterfly");
		this.setCanFly(true);
		this.setIsDangerous(false);
		this.setMaintenanceCost(0.5);
		this.setDangerPerc(0.0);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Insects.BUTTERFLY);
	}
}
