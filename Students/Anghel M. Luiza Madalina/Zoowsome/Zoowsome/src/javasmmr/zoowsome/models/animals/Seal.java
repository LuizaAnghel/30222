package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.models.animals.Aquatic.WaterType;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public class Seal extends Aquatic {

	public Seal(int legs, String name) {
		this.setNrOfLegs(legs);
		this.setName(name);
	}

	public Seal() {
		this.setNrOfLegs(0);
		this.setName("Seal");
		this.setAvgSwimDepth(4100);
		WaterType waterType = WaterType.SaltWater;
		this.setMaintenanceCost(4.6);
		this.setDangerPerc(0.0);
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
				Constants.Animals.Aquatics.SEAL);
	}
}
