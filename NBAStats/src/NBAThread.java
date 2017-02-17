import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.*;



public class NBAThread extends Thread
{
	public ServerSocket ss;
	public Socket myS;
	
	public NBAThread(ServerSocket ss, Socket s) //constructor, which takes in a socket to connect to
	{
		this.ss = ss;
		this.myS = s;
	}

	public void run()
	{
		try{
		//establish input/output streams
		BufferedReader bf = new BufferedReader(new InputStreamReader(myS.getInputStream()));
		PrintWriter out = new PrintWriter(myS.getOutputStream(), true);
		
		//get which team the user is looking for
		out.println("Select a team (by team name. For 76ers, use 'Sixers.' For Trail Blazers, use 'Blazers.'");
		out.flush();
		String chosenTeam = bf.readLine();
		String teamLower = chosenTeam.toLowerCase();
		
		//get which player the user is looking for
		out.println("Enter player's first name.");
		out.flush();
		String playerFirst = bf.readLine();
		
		out.println("Enter player's last name.");
		out.flush();
		String playerLast = bf.readLine();
		
		//concatenate the first/last names due to limitations of bf.readLine()
		String playerUpper = playerFirst.toUpperCase()+ " "+playerLast.toUpperCase();
		
		
		 String jdbcDriver = "com.mysql.jdbc.Driver";
		 String protocolHeader = "jdbc:mysql://localhost/";
		 String user = "root";
		 String password = "";
		 
		//connect to JDBC class database
		 Class.forName(jdbcDriver);
	     Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	      //create the statement to be sent to the SQL database
	     Statement query = cntn.createStatement();
	     String request = "SELECT * from nba_stats."+teamLower+" WHERE NAME='"+playerUpper+"'";
	     ResultSet rs = query.executeQuery(request);
		 
	     String name= "";
	     String games = "";
	     String mins = "";
	     String points = "";
	     String rebounds = "";
	     String assists = "";
	     String steals = "";
	     String blocks = "";
	     String per = "";
		 
	     if(rs.next())
	     {
			 name = rs.getString("NAME"); out.println("Player: "+name);
			 games = rs.getString("GAMES"); out.println("Games played: "+games);
			 points = rs.getString("POINTS"); out.println("Points per game: "+points);
			 rebounds = rs.getString("REBOUNDS"); out.println("Rebounds per game: "+rebounds);
			 assists = rs.getString("ASSISTS"); out.println("Assists per game: "+assists);
			 steals = rs.getString("STEALS"); out.println("Steals per game: "+steals);
			 //out.println(name+" has played "+games+" games and averages "+mins+" minutes per game while scoring "+points+" points per game.");
	     }
	     else
	     {
	    	 out.println("No player with that name found on that team.");
	     }
	 
		 cntn.close();
		 out.close();
		}catch(Exception ex){ex.printStackTrace();}
	}
}
