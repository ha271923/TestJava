package aaaa;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;

// 
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
// 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class Folders {
	public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {

		DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = docBuilder.parse(new InputSource(new StringReader(xml)));

		ArrayList<String> folderNames = new ArrayList<String>();
		NodeList folderNodes = doc.getElementsByTagName("folder");

		for (int idx = 0; idx < folderNodes.getLength(); idx++) {
			Element folderNode = (Element) folderNodes.item(idx);
			String folderName = folderNode.getAttribute("name");
			if (folderName.charAt(0) == startingLetter)
				folderNames.add(folderName);
		}

		return folderNames;
	}
}
