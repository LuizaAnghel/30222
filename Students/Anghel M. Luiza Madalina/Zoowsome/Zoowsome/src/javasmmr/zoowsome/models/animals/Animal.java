package javasmmr.zoowsome.models.animals;

import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Animal implements Killer_I {
	private Integer nrOfLegs;
	private String name;
	private Double maintenanceCost;
	private Double dangerPerc;
	private Boolean takenCareOf;

	public Integer getNrOfLegs() {
		return this.nrOfLegs;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String Name) {
		this.name = name;
	}

	public Double getMaintenanceCost() {
		return this.maintenanceCost;
	}

	public final void setMaintenanceCost(Double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public Double getDangerPerc() {
		return this.dangerPerc;
	}

	public final void setDangerPerc(Double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}

	public Boolean isTakenCareOf() {
		return this.takenCareOf;
	}

	public void setTakenCareOf(Boolean takenCareOf) {
		takenCareOf = false;
		this.takenCareOf = takenCareOf;
	}

	@Override
	public boolean kill() {
		Random random = new Random();
		int i = random.nextInt(1);
		if (i < this.getDangerPerc()) {
			return true;
		} else
			return false;
	}

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost",
				String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}

	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs")
				.item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element
				.getElementsByTagName("maintenanceCost").item(0)
				.getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc")
				.item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element
				.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}

}
