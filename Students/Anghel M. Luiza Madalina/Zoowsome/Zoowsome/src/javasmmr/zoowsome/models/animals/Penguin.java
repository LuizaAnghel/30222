package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Penguin extends Bird {

	public Penguin(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Penguin() {
		this.setNrOfLegs(2);
		this.setName("Penguin");
		this.setMigrates(false);
		this.setAvgFlightAltitude(0);
		this.setMaintenanceCost(6.5);
		this.setDangerPerc(0.0);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Birds.PENGUIN);
	}

}
