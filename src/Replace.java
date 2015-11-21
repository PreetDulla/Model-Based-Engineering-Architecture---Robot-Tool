import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     {
     try
         {
         File file = new File("C:/Users/Perto/Desktop/Human_readable.txt");
         BufferedReader reader = new BufferedReader(new FileReader(file));
         String line = "", oldtext = "";
         while((line = reader.readLine()) != null) 
             {
              oldtext += line + "\r\n";
         }
   
         String newtext = oldtext.replace("Select X-Y" , "G17").replace("Coolant OFF", "M09").replace("Spindle ON", "M04").replace("Spindle OFF", "M05").replace("Return Home", "G28").replace("Spindle Speed", "S").replace("Simple Drilling", "G81").replace("Coolant ON", "M08").replace("Boring Cycle", "G76");
       
        
         
         FileWriter writer = new FileWriter("C:/Users/Perto/Desktop/CNC_Program.txt");
        
         writer.write(newtext); 
         
         writer.close();
         reader.close();
     }
     catch (IOException ioe)
         {
         ioe.printStackTrace();
     }
     }
}
}