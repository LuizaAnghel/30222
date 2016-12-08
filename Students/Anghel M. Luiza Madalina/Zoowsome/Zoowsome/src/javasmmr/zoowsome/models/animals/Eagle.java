package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Eagle extends Bird {

	public Eagle(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Eagle() {
		this.setNrOfLegs(2);
		this.setName("Eagle");
		this.setMigrates(true);
		this.setAvgFlightAltitude(10000);
		this.setMaintenanceCost(5.3);
		this.setDangerPerc(0.4);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Birds.EAGLE);
	}
}
