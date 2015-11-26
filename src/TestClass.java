import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class TestClass {
   public static void main(String[] args){

      try {	
         File inputFile = new File("ContentsXmlwithXsd.xml");
         DocumentBuilderFactory dbFactory 
            = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         doc.getDocumentElement().normalize();
         
         System.out.println("Root element :" 
            + doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName("music");
         System.out.println("----------------------------");
         for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println("\nCurrent Element :" 
               + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("music kind : " 
                  + eElement.getAttribute("kind"));
               System.out.println("Title : " 
                  + eElement
                  .getElementsByTagName("title")
                  .item(0)
                  .getTextContent());
               System.out.println("artist : " 
               + eElement
                  .getElementsByTagName("artist")
                  .item(0)
                  .getTextContent());
               System.out.println("music_publisher : " 
               + eElement
                  .getElementsByTagName("music_publisher")
                  .item(0)
                  .getTextContent());
               System.out.println("year : " 
               + eElement
                  .getElementsByTagName("year")
                  .item(0)
                  .getTextContent());
               System.out.println("rate : " 
                       + eElement
                          .getElementsByTagName("rate")
                          .item(0)
                          .getTextContent());
               System.out.println("lyrics : " 
                       + eElement
                          .getElementsByTagName("lyrics")
                          .item(0)
                          .getTextContent());
               System.out.println("compose : " 
                       + eElement
                          .getElementsByTagName("compose")
                          .item(0)
                          .getTextContent());
               
            }
            
            /*
            
            NodeList movie_List = doc.getElementsByTagName("movie");
            System.out.println("----------------------------");
            for (int temp = 0; temp < movie_List.getLength(); temp++) {
               Node nNode = movie_List.item(temp);
               System.out.println("\nCurrent Element :" 
                  + nNode.getNodeName());
               if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                  Element eElement = (Element) nNode;
                  System.out.println("music kind : " 
                     + eElement.getAttribute("kind"));
                  System.out.println("Title : " 
                     + eElement
                     .getElementsByTagName("title")
                     .item(0)
                     .getTextContent());
                  System.out.println("artist : " 
                  + eElement
                     .getElementsByTagName("artist")
                     .item(0)
                     .getTextContent());
                  System.out.println("music_publisher : " 
                  + eElement
                     .getElementsByTagName("music_publisher")
                     .item(0)
                     .getTextContent());
                  System.out.println("year : " 
                  + eElement
                     .getElementsByTagName("year")
                     .item(0)
                     .getTextContent());
                  System.out.println("rate : " 
                          + eElement
                             .getElementsByTagName("rate")
                             .item(0)
                             .getTextContent());
                  System.out.println("lyrics : " 
                          + eElement
                             .getElementsByTagName("lyrics")
                             .item(0)
                             .getTextContent());
                  System.out.println("compose : " 
                          + eElement
                             .getElementsByTagName("compose")
                             .item(0)
                             .getTextContent());
                  
               }
            */
            
            
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}