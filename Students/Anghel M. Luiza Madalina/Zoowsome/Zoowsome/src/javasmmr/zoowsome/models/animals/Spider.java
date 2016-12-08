package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Spider extends Insect {

	public Spider(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Spider() {
		this.setNrOfLegs(8);
		this.setName("Spider");
		this.setCanFly(false);
		this.setIsDangerous(true);
		this.setMaintenanceCost(2.5);
		this.setDangerPerc(0.5);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Insects.SPIDER);
	}
}
