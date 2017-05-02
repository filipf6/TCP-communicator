package TCP.client;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


public class ClientTCP 
{
	private Socket socket=null;
	private PrintWriter out=null;
	private String username=null;
	
	public ClientTCP(String host,int port, String username) throws Exception
	{
		System.out.println("Tworzenie socketa klienta...");
		socket=new Socket(InetAddress.getByName(host),port);
		out=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
		this.username=username;
		out.print(username);
		System.out.println("Stworzono socket");
	}
	
	/*public void sendMessage()
	{
		Scanner sc=new Scanner(System.in);
		String msg;
		
		while(true)
		{
			msg=sc.nextLine();
		}
	}*/
	
}
