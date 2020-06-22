import java.util.*;
import java.lang.*;
class GradeCard
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int marks[]=new int[10];
String grade;
System.out.println("Enter marks of 10 Students of Java-");
for(int i=0;i<10;i++)
{
System.out.println("Enter student " +(i)+ " marks-");
marks[i]=s.nextInt();

}
System.out.println("Sorted Array in ascending order-");
Arrays.sort(marks);
System.out.println(Arrays.toString(marks));
System.out.println("Marks | Grade");
for(int i=0;i<10;i++)
{
if(marks[i]<=50)
{
System.out.println(+(marks[i])+ "    | FAIL");
}
else if(marks[i]>=51 && marks[i]<=75)
{
System.out.println(+(marks[i])+ "    | MERIT");
}
else if(marks[i]>75)
{
System.out.println(+(marks[i])+ "    | DISTINCTION");
}
}
}
}


Output:
javac grades.java

java GradeCard

Enter marks of 10 Students of Java-
Enter student 0 marks-
54
Enter student 1 marks-
24
Enter student 2 marks-
98
Enter student 3 marks-
46
Enter student 4 marks-
88
Enter student 5 marks-
98
Enter student 6 marks-
56
Enter student 7 marks-
49
Enter student 8 marks-
86
Enter student 9 marks-
90
Sorted Array in ascending order-
[24, 46, 49, 54, 56, 86, 88, 90, 98, 98]
Marks | Grade
24    | FAIL
46    | FAIL
49    | FAIL
54    | MERIT
56    | MERIT
86    | DISTINCTION
88    | DISTINCTION
90    | DISTINCTION
98    | DISTINCTION
98    | DISTINCTION
