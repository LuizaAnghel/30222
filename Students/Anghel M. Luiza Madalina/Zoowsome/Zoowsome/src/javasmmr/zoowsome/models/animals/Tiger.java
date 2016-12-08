package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Tiger extends Mammal {

	public Tiger(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Tiger() {
		this.setNrOfLegs(4);
		this.setName("Tiger");
		this.setNormalBodyTemp(37);
		this.setPercBodyHair(90);
		this.setMaintenanceCost(3.2);
		this.setDangerPerc(0.8);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Mammals.TIGER);
	}
}
