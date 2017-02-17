import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import java.sql.*;


public class NBAServer 
{

	public static void main(String[] args) 
	{
		try{
			ServerSocket ss = new ServerSocket(2006);
			
			while(true)
			{
				Socket s = ss.accept();
				
				NBAThread t = new NBAThread(ss, s);
				t.start();
				//ss.close();
			}
			}catch(IOException e){System.out.println("Server has this problem: "+e);}
	}

}
