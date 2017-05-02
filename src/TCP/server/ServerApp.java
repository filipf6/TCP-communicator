package TCP.server;

public class ServerApp {

	public static void main(String[] args) 
	{
		ServerTCP server=new ServerTCP();
		server.setPort(8012);
		
		try 
		{
			server.newSocket();
			server.serverListener();
			server.closeSocket();
		} 
		catch (Exception e) 
		{
			System.out.println("BLAD: "+e.getMessage());
		}
	}

}
