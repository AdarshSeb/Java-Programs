class Implicit1
{
	public static void main(String args[])
	{
		String str;
		int r;
		double int a;
		System.out.println("enter the radius");
		DataInputStream dis=new DataInputStream(System.in);
		try
		{
			r=Integer.parseInt(dis.readLine());
		}
		catch(IOException e){System.out.println(e);}
		area=3.14*r*r;
		System.out.println("The area is :"+r);
	}
}
