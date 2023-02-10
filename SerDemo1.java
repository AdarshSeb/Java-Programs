import java.io.*;

class SerDemo
{
    public static void main(String abc[])
    {
        try
        {
        Student s = new Student("adarsh",21,03);
        FileOutputStream fout = new FileOutputStream("s.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(s);
        s.Disp();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}
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