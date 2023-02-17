package networking;
import java.io.*;
import java.net.*;
public class SockCli {

	public static void main(String[] args) {
		try
		{
			Socket s = new Socket("localhost",1274);
			System.out.println("ready to sent");
			DataOutputStream oos = new DataOutputStream(s.getOutputStream());
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("enter data to sent");
			String str = dis.readLine();
			oos.writeUTF(str);
			s.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
