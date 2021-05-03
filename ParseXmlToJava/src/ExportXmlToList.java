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
import java.util.ArrayList;
import java.util.List;

public class ExportXmlToList {

    public static NodeList getNodeList() {
        //Get Document Builder
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("/Users/juraj/Downloads/ParseXmlToJava/src/xmlfile.xml"));
            return doc.getDocumentElement().getChildNodes();
        }catch (ParserConfigurationException | SAXException | IOException p){
            System.out.println(p.getMessage());
        }
         return null;
    }

    public static void iteration () {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0 ; i < getNodeList().getLength() ; i++){
            Node node = getNodeList().item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                String studentId =  eElement.getElementsByTagName("id").item(0).getTextContent();
                String firtstName = eElement.getElementsByTagName("firstname").item(0).getTextContent();
                String lastname = eElement.getElementsByTagName("lastname").item(0).getTextContent();
                String subject = eElement.getElementsByTagName("subject").item(0).getTextContent();
                String marks = eElement.getElementsByTagName("marks").item(0).getTextContent();
                studentList.add(new Student(studentId, firtstName, lastname, subject, marks));
            }
        }
        for (Student student: studentList){
            System.out.println(student.toString());
        }
    }

    public static void main(String[] args) {
        iteration();

    }

}
