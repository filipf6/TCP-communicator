package TCP.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP 
{
	private int port;
	private ServerSocket serverSocket=null;
	private static int countClients=0;
	
	ServerTCP()
	{
		port=0;
	}
	
	public ServerTCP(int port) throws Exception {
		
		this.port = port;
		serverSocket = new ServerSocket(port);
	}


	public void setPort(int port) {
		this.port = port;
	}

	public void newSocket() throws Exception
	{
		System.out.println("Tworzenie gniazda serwera...");
		serverSocket=new ServerSocket(port);
		System.out.println("Stworzono gniazdo");
	}
	
	public void serverListener() throws Exception
	{
		
		while(true)
		{
			Socket socket=serverSocket.accept();
			if(socket.isConnected())
			{
				System.out.println("Polaczono z nowym uzytkownikiem o ID "+countClients++);
				BufferedReader inFromClient = new BufferedReader(new InputStreamReader (socket.getInputStream()));
                //create output stream attached to socket
               //PrintWriter outToClient = new PrintWriter(new OutputStreamWriter(connectionSocket.getOutputStream()));
                //read in line from the socket
                String clientSentence = inFromClient.readLine();
                System.out.println(clientSentence);
			}
			
		}
	}
	
	public void closeSocket() throws IOException
	{
		System.out.println("Zamykanie gniazda serwera...");
		serverSocket.close();
		System.out.println("Zamknieto gniazdo serwera");
		
	}
	
	
}
