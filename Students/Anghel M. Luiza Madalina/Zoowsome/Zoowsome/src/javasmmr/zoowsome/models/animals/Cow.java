package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Cow extends Mammal {

	public Cow(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Cow() {
		this.setNrOfLegs(4);
		this.setName("Cow");
		this.setNormalBodyTemp(38);
		this.setPercBodyHair(80);
		this.setMaintenanceCost(4.5);
		this.setDangerPerc(0.0);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Mammals.COW);
	}
}
