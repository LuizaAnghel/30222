package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Employee implements XML_Parsable {
	private String name;
	public Long id;
	private BigDecimal salary;
	public boolean isDead;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Long id) {
		long number1 = (long) Math.floor(Math.random() * 9000000000000L) + 1000000000000L;
		this.id = number1;
	}

	public Long getId() {
		return this.id;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Boolean getIsDead() {
		return this.isDead;
	}

	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}

	/*
	 * public Employee(String name, BigDecimal salary, Boolean isDead) {
	 * this.setName(name); this.setSalary(salary); this.setIsDead(isDead); }
	 */

	public void encodeToXml(XMLEventWriter eventWriter)
			throws XMLStreamException {
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
	}

	public void decodeFromXml(Element element) {
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setId(id);
		setSalary(BigDecimal.valueOf(element.getElementsByTagName("salary")
				.item(0).getTextContent()));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead")
				.item(0).getTextContent()));
	}
}
