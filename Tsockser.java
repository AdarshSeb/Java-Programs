package networking;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class Tsockser {

	public static void main(String[] args) {
		try
		{
			ServerSocket ss = new ServerSocket(1239);
			Socket as = ss.accept();
			DataInputStream kin = new DataInputStream(System.in);
			DataInputStream cin = new DataInputStream(as.getInputStream());
			DataOutputStream dout = new DataOutputStream(as.getOutputStream());
			String str;
			System.out.println("enter data to sent");
			str=kin.readLine();
			dout.writeUTF(str);
			while(true)
			{
				str = cin.readUTF();
				System.out.println("message is "+str);
				if(str.equals("#"))
				{
					break;
				}
				System.out.println("enter data to sent");
				dout.writeUTF("mca");
			}
			ss.close();
			as.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
