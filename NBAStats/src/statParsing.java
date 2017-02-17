import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class statParsing 
{

	public static void Celts() throws Exception
	{
		URL url = new URL("http://www.nba.com/celtics/stats");
		
		//set up a reader that reads in input and writes it into an XML doc
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		FileWriter fw = new FileWriter("celtics.txt");
		PrintWriter fp = new PrintWriter(fw);
		String line = "";
		
		//loop to print each line to XML doc while lines exist
		while((line = br.readLine()) != null)
		{
			fp.println(line);
			fp.flush(); //flush after each line (important!)
		}
		br.close(); //close buffered reader
		fp.close();
		
		File xmlfile = new File("celtics.txt");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlfile);
		
		//in cnn xml file, each news item is contained within an <item> tag
		//NodeList nList = doc.get
	}

	
	public static void main(String[] args) throws Exception
	{
		Celts();
	}
}
