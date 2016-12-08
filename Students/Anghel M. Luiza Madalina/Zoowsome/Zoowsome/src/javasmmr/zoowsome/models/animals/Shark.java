package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.models.animals.Aquatic.WaterType;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Shark extends Aquatic {

	public Shark(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Shark() {
		super();
		this.setNrOfLegs(0);
		this.setName("Shark");
		this.setAvgSwimDepth(2000);
		WaterType waterType = WaterType.SaltWater;
		this.setMaintenanceCost(6.5);
		this.setDangerPerc(0.9);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Aquatics.SHARK);
	}
}
