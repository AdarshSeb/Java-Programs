package networking;
import java.io.*;
import java.net.*;
public class SockSer {

	public static void main(String[] args) {
		try
		{
			ServerSocket ss = new ServerSocket(1274);
			Socket as = ss.accept();
			System.out.println("connectio created");
			DataInputStream ois = new DataInputStream(as.getInputStream());
			String str=(String)ois.readUTF();
			System.out.println("message is "+str);
			ss.close();
			as.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
