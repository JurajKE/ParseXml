import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

public class Test {

    private ExportXmlToList exportXmlToList = new ExportXmlToList();
    private List<Student> studentList = new ArrayList<>();

    @Before
    public void setup() {
        Student student = new Student("101", "Naman" , "Kumar" , "Math" , "83");
        Student student2 = new Student("102", "Kapil" , "Kumar" , "Chemistry" , "60");
        Student student3 = new Student("103", "Harsh" , "Singh" , "English" , "70");
        Student student4 = new Student("104", "Jitesh" , "Singh" , "Physics" , "76");

        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
    }

    @org.junit.Test
    public void testParse() {

        List<Student> parsedStudents = exportXmlToList.iteration();
        //check size of array
        Assert.assertEquals(parsedStudents.size(), studentList.size());
        for (int i=0; i<parsedStudents.size(); i++) {
            //check object attribute values in array
            Assert.assertEquals(parsedStudents.get(i).toString(), studentList.get(i).toString());
        };
    }

}
