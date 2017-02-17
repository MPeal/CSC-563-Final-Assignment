import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class NBAClient 
{

	public static void main(String[] args) throws Exception, ClassNotFoundException
	{
			/*//Ask user for host IP address, assign it to string
			System.out.println("What is the host IP address?");
			Scanner forIP = new Scanner(System.in);
			String ipAddress = forIP.next();
			forIP.close();*/
				
				try{
					//create socket
					Socket clientSocket = new Socket("10.76.141.141", 2006);

					//input stream & reader
					InputStream clientInputStream = clientSocket.getInputStream();
					BufferedReader clientReader = new BufferedReader(new InputStreamReader(clientInputStream));
					
					//create output stream & writer
					OutputStream clientOutputStream = clientSocket.getOutputStream();
					PrintWriter clientWriter = new PrintWriter(clientOutputStream, true);
					
					//server will ask for team selection, scanner gets it from user input
					String teamPrompt = clientReader.readLine();
					System.out.println(teamPrompt);
					Scanner forTeam = new Scanner(System.in);
					String team = forTeam.next();
					clientWriter.println(team);
					clientWriter.flush();
					//forTeam.close();
				
					//server will ask for player's first name, scanner gets it from user input
					String playerFirstPrompt = clientReader.readLine();
					System.out.println(playerFirstPrompt);
					Scanner forPlayerFirst = new Scanner(System.in);
					String playerFirst = forPlayerFirst.next();
					if(playerFirst.contains("'"))
					{
						playerFirst = playerFirst.replace("'", "''");
					}
					clientWriter.println(playerFirst);
					clientWriter.flush();
					
					//server asks for player's last name
					String playerLastPrompt = clientReader.readLine();
					System.out.println(playerLastPrompt);
					Scanner forPlayerLast = new Scanner(System.in);
					String playerLast = forPlayerFirst.next();
					if(playerLast.contains("'"))
					{
						playerLast = playerLast.replace("'", "''");
					}
					clientWriter.println(playerLast);
					clientWriter.flush();
					
					
					//get server's response
					String response;
					while ((response = clientReader.readLine()) != null)
					{
						System.out.println(response);
					}
					
					forPlayerFirst.close();
					forPlayerLast.close();
					clientReader.close();
					clientWriter.close();
					//clientSocket.close();							
				}catch(IOException e){System.out.println(e+" client error please connect and try again");}
	}
}
