package TCP.client;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ClientApp {

	public static void main(String[] args) 
	{
		try 
		{
			ClientTCP clientTCP=new ClientTCP("WINDOWS-342UTCI",8012,"pizdzielec");
		} 
		catch (Exception e) {
			System.out.println("B£AD KLIENTA: "+e.getMessage());
		}
	}

}
