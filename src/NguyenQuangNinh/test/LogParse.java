package NguyenQuangNinh.test

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;

public class LogParse
{
    public static Collection<Integer> getIdsByMessage(String xmlStr, String message) {
        ArrayList<Integer> result = new ArrayList<>();

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(xmlStr));
            Document doc = builder.parse(is);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("entry");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("Message: " + eElement.getElementsByTagName("message").item(0).getTextContent());

                    if (eElement.getElementsByTagName("message").item(0).getTextContent().equals(message)) {
                        String attribute = eElement.getAttribute("id");
                        if(isNumeric(attribute)){
                            Integer itemInt = new Integer(attribute);
                            if(!result.contains(itemInt)){
                                result.add(itemInt);
                            }
                        }

                    }
                }
            }
        } catch (Exception e) {
            System.out.println("error");
        }

        return result;
    }

    public static boolean isNumeric(String str)
    {
        return java.util.regex.Pattern.matches("\\d+", str);
    }

    public static void main(String[] args) {
        String xml = "<?xml version=\"1.0\"?>\n" +
                "<log>\n" +
                "�� �� <entry id = \"1\">\n" +
                "�� �� <message>Application started</message>\n" +
                "�� �� </entry>\n" +
                "�� �� <entry id = \"2\">\n" +
                "�� �� <message>Application ended</message>\n" +
                "�� �� </entry>\n"+
                "�� �� <entry id = \"2\">\n" +
                "�� �� <message>Application ended</message>\n" +
                "�� �� </entry>\n"+
                "</log>";

        Collection<Integer> results = LogParse.getIdsByMessage(xml, "Application ended");

        for(int i : results) {
            System.out.print(i + " ");
        }
    }
}