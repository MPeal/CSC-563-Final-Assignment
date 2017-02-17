import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLparse 
{
	public static void blazers() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.blazers");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/blazers/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.blazers VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Blazers updated");
	}
	public static void bucks() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.bucks");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/bucks/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.bucks VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Bucks updated");
	}
	public static void bulls() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.bulls");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/bulls/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.bulls VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Bulls updated");
	}
	public static void celtics() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.celtics");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/celtics/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.celtics VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Celtics updated");
	}
	public static void clippers() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.clippers");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/clippers/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.clippers VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Clippers updated");
	}
	public static void grizzlies() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.grizzlies");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/grizzlies/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.grizzlies VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Grizzlies updated");		
	}
	public static void hawks() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.hawks");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/hawks/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.hawks VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Hawks updated");
	}
	public static void heat() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.heat");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/heat/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.heat VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Heat updated");
	}
	public static void hornets() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.hornets");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/hornets/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.hornets VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Hornets updated");
	}
	public static void jazz() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.jazz");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/jazz/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.jazz VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Jazz updated");
	}
	public static void kings() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.kings");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/kings/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.kings VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Kings updated");
	}
	public static void knicks() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.knicks");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/knicks/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.knicks VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Knicks updated");
	}
	public static void lakers() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.lakers");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/lakers/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.lakers VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Lakers updated");
	}
	public static void magic() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.magic");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/magic/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.magic VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Magic updated");
	}
	public static void mavericks() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.mavericks");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("https://www.mavs.com/team/team-stats/").get();
		
		//access the season averages table
		Element table = doc.select("table[class=player-stats-table").first();
		Elements rows = table.select("tr");
		for (int i =1; i < rows.size(); i++) //start at 1 because index0 is the headers
		{
			Element row = rows.get(i);
			Elements headers = row.select("th");
			String currentPlayer = headers.text();
			if (currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			
			Elements cols = row.select("td");
			String currentGames = cols.eq(0).text(); //games is the first column
			String currentPoints = cols.eq(14).text(); //points is the last column
			String currentRebs = cols.eq(8).text(); //rebs is the 6th column
			String currentAsts = cols.eq(9).text(); //asts is the 7th column
			String currentStls = cols.eq(10).text(); //stls is the 8th column
			
			String update = "INSERT into nba_stats.mavericks VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Mavericks updated");
		}
	public static void nets() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.nets");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/nets/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.nets VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Nets updated");
	}
	public static void nuggets() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.nuggets");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/nuggets/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.nuggets VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Nuggets updated");
	}
	public static void pacers() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.pacers");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/pacers/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.pacers VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Pacers updated");
	}
	public static void pelicans() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.pelicans");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/pelicans/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.pelicans VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Pelicans updated");
	}
	public static void pistons() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.pistons");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/pistons/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.pistons VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Pistons updated");
	}
	public static void raptors() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.raptors");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/raptors/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.raptors VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Raptors updated");
	}
	public static void rockets() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.rockets");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/rockets/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.rockets VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Rockets updated");
	}
	public static void spurs() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.spurs");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/spurs/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.spurs VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Spurs updated");
	}
	public static void suns() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.suns");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/suns/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.suns VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Suns updated");
	}
	public static void sixers() throws IOException, Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.sixers");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/sixers/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.sixers VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Sixers updated");
	}
	public static void thunder() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.thunder");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/thunder/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.thunder VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Thunder updated");
	}
	public static void timberwolves() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.timberwolves");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/timberwolves/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.timberwolves VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Timberwolves updated");
	}
	public static void warriors() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.warriors");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/warriors/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.warriors VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Warriors updated");
	}
	public static void wizards() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.wizards");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/wizards/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			
			String update = "INSERT into nba_stats.wizards VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}
		System.out.println("Wizards updated");
	}	
	public static void cavaliers() throws Exception
	{
		String jdbcDriver = "com.mysql.jdbc.Driver";
		String protocolHeader = "jdbc:mysql://localhost/";
		String user = "root";
		String password = "";
		 
		//connect to JDBC class database
		Class.forName(jdbcDriver);
	    Connection cntn = DriverManager.getConnection(protocolHeader, user, password);
	       
	    //create the statement to be sent to the SQL database
	    Statement query = cntn.createStatement();
	    
	    //empty the table before updating
	    query.executeUpdate("TRUNCATE TABLE nba_stats.cavaliers");
	     
		//access the team's stat page
		Document doc = Jsoup.connect("http://www.nba.com/cavaliers/stats").get();
		
		//access the season averages table
		Element table = doc.select("table[class=stats-table player-stats season-averages table table-striped table-bordered sticky-enabled]").first();
		
		Elements rows = table.select("tr");
		for(int j=1; j<rows.size(); j++)
		{
			Element row = rows.get(j);
			Elements cols = row.select("td");
			Elements names = table.getElementsByClass("playerName");
			String currentPlayer = names.eq(j-1).text();
			if(currentPlayer.contains("'"))
			{
				currentPlayer = currentPlayer.replace("'", "''");
			}
			String currentGames = cols.eq(1).text();
			if(currentGames.equals("—")) //some players may have not accumulated certain stats. replace these null values with 0.0				
			{
					currentGames = "0";
			}
			String currentPoints = cols.eq(2).text();
			if(currentPoints.equals("—"))
			{
				currentPoints = "0.0";
			}
			String currentRebs = cols.eq(9).text();
			if(currentRebs.equals("—"))
			{
				currentRebs = "0.0";				
			}
			String currentAsts = cols.eq(10).text();
			if(currentAsts.equals("—"))
			{
				currentAsts = "0.0";
			}
			String currentStls = cols.eq(11).text();
			if(currentStls.equals("—"))
			{
				currentStls = "0.0";
			}
			String update = "INSERT into nba_stats.cavaliers VALUES ('"+currentPlayer+"', '"+currentGames+"', '"+currentPoints+"', '"+currentRebs+"', '"+currentAsts+"', '"+currentStls+"')";
			query.executeUpdate(update);
		}	
		System.out.println("Cavaliers updated");
	}

	public static void main(String[] args) throws IOException, Exception
	{
		/*blazers();
		bucks();
		bulls();
		cavaliers();
		celtics();
		clippers();
		grizzlies();
		hawks();
		heat();
		hornets();
		jazz();
		kings();
		knicks();
		lakers();
		magic();*/
		mavericks();
		nets();
		nuggets();
		pacers();
		pistons();
		pelicans();
		raptors();
		rockets();
		sixers();
		spurs();
		suns();
		thunder();
		timberwolves();
		warriors();
		wizards();
	}
}