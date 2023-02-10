import java.io.*;
import java.lang.*;
class Student implements Serializable
{
    String name;
    int age;
    int rno;
    public Student(String name,int age,int rno)
    {
        this.name=name;
        this.age=age;
        this.rno=rno;
    }
    public void Disp()
    {
        System.out.println("name is "+name);
        System.out.println("age is "+age);
        System.out.println("rno is "+rno);
    }
}
public class DeSerDemo
{
    public static void main(String abc[])
    {
        try{
            Student S = null;
            FileInputStream fin = new FileInputStream("s.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            S=(Student)ois.readObject();
            S.Disp();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        catch(ClassNotFoundException f)
        {
            System.out.println(f);
        }
    }
}
