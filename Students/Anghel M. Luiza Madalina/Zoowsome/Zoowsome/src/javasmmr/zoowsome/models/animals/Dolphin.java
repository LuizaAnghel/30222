package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Dolphin extends Aquatic {

	public Dolphin(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Dolphin() {
		this.setNrOfLegs(0);
		this.setName("Dolphin");
		this.setAvgSwimDepth(300);
		WaterType waterType = WaterType.SaltWater;
		this.setMaintenanceCost(8.4);
		this.setDangerPerc(0.0);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Aquatics.DOLPHIN);
	}
}
