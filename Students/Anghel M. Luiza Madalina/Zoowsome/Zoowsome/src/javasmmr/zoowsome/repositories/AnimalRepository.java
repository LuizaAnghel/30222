package javasmmr.zoowsome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;




import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Flamingo;
import javasmmr.zoowsome.models.animals.Lizzard;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Penguin;
import javasmmr.zoowsome.models.animals.Seal;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.Constants.Animals;

public class AnimalRepository extends EntityRepository <Animal>{
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL); 
	}

	public ArrayList<Animal> load() throws ParserConfigurationException,
			SAXException, IOException {

		ArrayList<Animal> animals = new ArrayList<Animal>();

		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		org.w3c.dom.Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();

		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element
						.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT)
						.item(0).getTextContent();
				switch (discriminant) {
				case Constants.Animals.Insects.BUTTERFLY:
					Animal butterfly = new Butterfly();
					butterfly.decodeFromXml(element);
					animals.add(butterfly);

				case Constants.Animals.Insects.COCKROACH:
					Animal cockroach = new Cockroach();
					cockroach.decodeFromXml(element);
					animals.add(cockroach);

				case Constants.Animals.Insects.SPIDER:
					Animal spider = new Spider();
					spider.decodeFromXml(element);
					animals.add(spider);

				case Constants.Animals.Aquatics.DOLPHIN:
					Animal dolphin = new Dolphin();
					dolphin.decodeFromXml(element);
					animals.add(dolphin);

				case Constants.Animals.Aquatics.SEAL:
					Animal seal = new Seal();
					seal.decodeFromXml(element);
					animals.add(seal);

				case Constants.Animals.Aquatics.SHARK:
					Animal shark = new Shark();
					shark.decodeFromXml(element);
					animals.add(shark);

				case Constants.Animals.Birds.EAGLE:
					Animal eagle = new Eagle();
					eagle.decodeFromXml(element);
					animals.add(eagle);

				case Constants.Animals.Birds.FLAMINGO:
					Animal flamingo = new Flamingo();
					flamingo.decodeFromXml(element);
					animals.add(flamingo);

				case Constants.Animals.Birds.PENGUIN:
					Animal penguin = new Penguin();
					penguin.decodeFromXml(element);
					animals.add(penguin);

				case Constants.Animals.Mammals.COW:
					Animal cow = new Cow();
					cow.decodeFromXml(element);
					animals.add(cow);

				case Constants.Animals.Mammals.MONKEY:
					Animal monkey = new Monkey();
					monkey.decodeFromXml(element);
					animals.add(monkey);

				case Constants.Animals.Mammals.TIGER:
					Animal tiger = new Tiger();
					tiger.decodeFromXml(element);
					animals.add(tiger);

				case Constants.Animals.Reptiles.CROCODILE:
					Animal crocodile = new Crocodile();
					crocodile.decodeFromXml(element);
					animals.add(crocodile);

				case Constants.Animals.Reptiles.LIZZARD:
					Animal lizzard = new Lizzard();
					lizzard.decodeFromXml(element);
					animals.add(lizzard);

				case Constants.Animals.Reptiles.SNAKE:
					Animal snake = new Snake();
					snake.decodeFromXml(element);
					animals.add(snake);

				default:
					break;
				}
			}
		}
		return animals;
	}

	public static void createNode(XMLEventWriter eventWriter, String name,
			String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		// Create Start node
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		// Create Content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		// Create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}

	@Override
	protected XML_Parsable getEntityFromXmlElement(Element element) {
		// TODO Auto-generated method stub
		return null;
	}
}
