import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.io.PrintStream;
import java.io.FileOutputStream;



public class ParseXML {

    public static void main(String[] args) throws Exception {
       
    	 PrintStream printStream = new PrintStream(new FileOutputStream("C:/Users/Perto/Desktop/Human_readable.txt"));
         System.setOut(printStream);
         
    	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(new File("C:/Program Files (x86)/Java/jdk1.8.0_45/preet.xml"));
        NodeList nodeList = document.getElementsByTagName("node");
        for(int x = 0, size = nodeList.getLength(); x < size; x++)
     
        	System.out.println(nodeList.item(x).getAttributes().getNamedItem("name").getTextContent());
        
         Replace.main(args);
        
    }
    

    

    
    
}
     
