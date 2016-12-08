package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Snake extends Reptile {

	public Snake(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Snake() {
		this.setNrOfLegs(0);
		this.setName("Snake");
		this.setLaysEggs(true);
		this.setMaintenanceCost(4.3);
		this.setDangerPerc(0.7);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Reptiles.SNAKE);
	}
}
