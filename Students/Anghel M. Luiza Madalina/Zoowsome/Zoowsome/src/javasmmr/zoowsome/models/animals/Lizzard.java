package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Lizzard extends Reptile {

	public Lizzard(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Lizzard() {
		this.setNrOfLegs(4);
		this.setName("Lizzard");
		this.setLaysEggs(true);
		this.setMaintenanceCost(2.3);
		this.setDangerPerc(0.1);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Reptiles.LIZZARD);
	}
}
