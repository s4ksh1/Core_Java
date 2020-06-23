import java.util.*;
class Worker
{
	public String name;
	public double salary_rate,salary;
	public void compay()
	{
	}	
	public void getinfo()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		name=s.nextLine();
		System.out.println("Enter the salary rate");
		salary_rate=s.nextDouble();
	}
	public void showinfo()
	{
		System.out.println("Name:"+name);
		System.out.println("SAlary:"+salary);
	}
}
class Daily_worker extends Worker
{
	public Daily_worker()
	{
		System.out.println("daily worker");
	}
	
	public void compay(int hours)
	{
		salary=hours*salary_rate;
	}
}
class Salaried_worker extends Worker
{
	public Salaried_worker()
	{
		System.out.println("salaried worker");
	}
	public void compay()
	{
		salary=40*salary_rate;
	}
}
public class Driver1
{
	public static void main(String args[])
	{
		int h;
		Scanner s=new Scanner(System.in);
		Daily_worker d=new Daily_worker();
		System.out.println("enter the hours");
		h=s.nextInt();
		d.getinfo();
		d.compay(h);
		d.showinfo();
		System.out.println();
		Salaried_worker sa=new Salaried_worker();
		sa.getinfo();
		sa.compay();
		sa.showinfo();
	}
}


Output:
javac Driver1.java

java Driver1

daily worker
enter the hours
24
Enter the name
Ram
Enter the salary rate
5
Name:Ram
SAlary:120.0

salaried worker
Enter the name
Sham
Enter the salary rate
7
Name:Sham
SAlary:280.0

