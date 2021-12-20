package xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.IOException;



import org.w3c.dom.*;
import org.xml.sax.SAXException;


public class Usar_xml {

	public static void main(String[] args) {
		//creamos un objeto generador de documentos
		//Document builderFactory y DocumentBuilder permiten la generacion de un documento XML vacio almacenandolo en memoria
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
		//Devuelve un objeto  generador de documentos 
			DocumentBuilder builder = factory.newDocumentBuilder();
			try {
				//ponemos el nombre del archivo XML que queremos analizar 
				Document doc = builder.parse("C:\\Users\\34642\\Desktop\\DAM(casa)\\programacion\\InterfacesGraficas\\src\\xml\\NewFile.xml");
				//Obtenemos el nombre de las etiquetas persona del xml a traves de una lsita de nodos que nos devolvera dicho nombre
				NodeList personlist = doc.getElementsByTagName("person");
				//Contador que rrecore la laista de personas 1 de mi archivo XML
				for(int i=0; i<personlist.getLength(); i++) {
				//Nos devuelve los elementos de la lista de personas creadas
					Node p = personlist.item(i);
					//Condicion que compara los nodos del elemento persona
					if(p.getNodeType()==Node.ELEMENT_NODE) {
						Element person = (Element) p;
						//Conseguimos el valor del atributo id de las personas
						String id =person.getAttribute("id");
						//Atraves de la lsita de nodos conseguimos los apellidos de los elementos secundarios del XML
						NodeList nameList = person.getChildNodes();
						//Contador que rrecore la lista de personas 2 de mi archivo XML
						for(int j=0; j<nameList.getLength(); j++) {
							//nos devuelvelos elementos de la lista de nombres crerada 
							Node n = nameList.item(j);
							//Condicion que compara los nodos del elemento name de mi archivo XML
							if(n.getNodeType() == Node.ELEMENT_NODE) {
								Element name = (Element) n;
								System.out.println("person" + id + "." + name.getTagName() + "=" + name.getTextContent());
							}
						}
					}
					
				}
			}catch(SAXException e) {
				e.printStackTrace();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ParserConfigurationException e) {
			e.printStackTrace();
		}
	}

}
