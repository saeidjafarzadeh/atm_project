package com.atm.xmlconnector;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class XmlInverter {
    public static HashMap<String, String> validator() throws ParserConfigurationException, IOException, SAXException {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        String url = null;
        String username = null;
        String password = null;
        File file = new File("cfg.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("oracle");
        for (int itr = 0; itr < nodeList.getLength(); itr++) {
            Node node = nodeList.item(itr);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                url = eElement.getElementsByTagName("url").item(0).getTextContent();
                username = eElement.getElementsByTagName("username").item(0).getTextContent();
                password = eElement.getElementsByTagName("password").item(0).getTextContent();
            }
            hashMap.put("url", url);
            hashMap.put("username", username);
            hashMap.put("password", password);
        }
        return hashMap;
    }
}
