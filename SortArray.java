import java.io.*;
public class SortArray
{
public static void main(String args[])
{
float a[],temp;
int n,i,j;
try
{
DataInputStream dis =new DataInputStream(System.in);
System.out.println("enter the size of array");
n=Integer.parseInt(dis.readLine());
a=new float[n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
	a[i]=Float.parseFloat(dis.readLine());
}
for(i=0;i<n;i++)
{
	for(j=i;j<n;j++);
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
System.out.println("array after sorting is");
for(i=0;i<n;i++)
{
	System.out.println(a[i]);
}
}
catch(Exception e){System.out.println(e);}
}
}