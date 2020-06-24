import pack.Balance.Account;
import java.util.*;
public class Test5
{
 public static void main(String args[])
 {
  Scanner i=new Scanner(System.in);
  System.out.println("Enter amount to pay");
  double amount=i.nextDouble();

  Account obj=new Account();
  obj.Display_Balance(amount);
 }
}
