package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Flamingo extends Bird {

	public Flamingo(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Flamingo() {
		this.setNrOfLegs(2);
		this.setName("Flamingo");
		this.setMigrates(true);
		this.setAvgFlightAltitude(8000);
		this.setMaintenanceCost(7.5);
		this.setDangerPerc(0.0);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Birds.FLAMINGO);
	}
}
