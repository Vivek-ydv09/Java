class Student
{
	private int rollno,age;
	private String name;

	public void setRollno(int a)
	{
		rollno=a;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setAge(int b)
	{
		age=b;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String c)
	{
		name=c;
	}
	public String getName()
	{
		return name;
	}
}
public class StudentDemo
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.setRollno(1);
		s1.setAge(22);
		s1.setName("vivek");

		System.out.println(s1.getRollno()+"\t"+s1.getName()+"\t"+s1.getAge());
	}
}


		