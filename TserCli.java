package networking;
import java.io.*;
import java.net.Socket;

public class TserCli {

	public static void main(String[] args) {
		try
		{
			Socket cs = new Socket("localhost",1239);
			DataInputStream kin = new DataInputStream(System.in);
			DataInputStream sin = new DataInputStream(cs.getInputStream());
			DataOutputStream dout = new DataOutputStream(cs.getOutputStream());
			String str;
			while(true)
			{
				str=sin.readUTF();
				System.out.println("message is "+str);
				if(str.equals("#"))
				{
					break;
				}
				System.out.println("enter data to sent");
				str=kin.readLine();
				dout.writeUTF(str);
				if(str.equals("#"))
				{
					break;
				}
			}
			cs.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
