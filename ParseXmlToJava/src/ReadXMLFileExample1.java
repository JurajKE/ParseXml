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
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ReadXMLFileExample1 {



//    public static void getItems(File file) throws IOException, SAXException, ParserConfigurationException {
//        getDataFromXml(file);
//        createArrayOfStudents();
//
//
//
//
//    }
//
//    public static NodeList getDataFromXml(File file) throws ParserConfigurationException, IOException, SAXException {
//        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//        DocumentBuilder db = dbf.newDocumentBuilder();
//        Document doc = db.parse(file);
//        doc.getDocumentElement().normalize();
//        NodeList nodeList = doc.getElementsByTagName("student");
//        return nodeList;
//    }
//
//    public static void createArrayOfStudents(){
//        Student[] students = new Student[getDataFromXml.getLength()];
//    }



    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {


        //Get Document Builder
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        // Load the input XML document, parse it and return an instance of the
        // Document class.
        Document doc = db.parse(new File("/Users/juraj/Downloads/ParseXmlToJava/src/xmlfile.xml"));

        List<Student> studentList = new ArrayList<Student>();

//        doc.getDocumentElement().normalize();
//        NodeList nodeList = doc.getElementsByTagName("student");
        NodeList nodeList = doc.getDocumentElement().getChildNodes();

//        Student[] students = new Student[nodeList.getLength()];

//        for (int i = 0 ; i < nodeList.getLength() ; i++){
//            Node node = nodeList.item(i);
//            if (node.getNodeType() == Node.ELEMENT_NODE){
//                Element eElement = (Element) node;
//
//            }
//        }





        for (int itr = 0; itr < nodeList.getLength(); itr++) {
            Node node = nodeList.item(itr);
//            System.out.println("\nNode Name :" + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
//                System.out.println("Student id: " + eElement.getElementsByTagName("id").item(0).getTextContent());
                String studentId =  eElement.getElementsByTagName("id").item(0).getTextContent();
//                System.out.println("First Name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                String firtstName = eElement.getElementsByTagName("firstname").item(0).getTextContent();
//                System.out.println("Last Name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                String lastname = eElement.getElementsByTagName("lastname").item(0).getTextContent();
//                System.out.println("Subject: " + eElement.getElementsByTagName("subject").item(0).getTextContent());
                String subject = eElement.getElementsByTagName("subject").item(0).getTextContent();
//                System.out.println("Marks: " + eElement.getElementsByTagName("marks").item(0).getTextContent());
                String marks = eElement.getElementsByTagName("marks").item(0).getTextContent();

                studentList.add(new Student(studentId, firtstName, lastname, subject, marks));

//                Student student = new Student(studentId ,firtstName , lastname , subject , marks );
//                students[itr] = student;



//                System.out.println("///////////////////////////////////");
//
//                System.out.printf("Student ID: '%s' %nfirst name: '%s' %nlast name: '%s' %nSubject: '%s' %nMarks: '%s' %n" ,
//                        students[itr].getId(), students[itr].getFirstname() , students[itr].getSurname() , students[itr].getSubject() , students[itr].getMarks());
//
            }


        }

        for (Student student: studentList){
            System.out.println(student.toString());
        }

        }


}
