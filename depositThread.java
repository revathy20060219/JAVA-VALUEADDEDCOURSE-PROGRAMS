class bankaccount
{
private int balance;
  public bankaccount(int initialbalance)
{
this.balance=initialbalance;
}

public synchronized void deposit(int amount, String depositor)
{
System.out.println(depositor+"is depositing:"+amount);
int newbalance=balance + amount;
try
{
Thread .sleep(500);
}
catch(InterruptedException e)
{
System.out.println("thread interrupted");
}
balance=newbalance;
System.out.println(depositor+"completed deposit.new balance="+balance);
}
}
class deposit extends Thread
{
private bankaccount account;
private int amount;
private String depositor;

public deposit(bankaccount account,int amount,String depositor)
{


this.account=account;
this.amount=amount;
this.depositor=depositor;
}
@Override

public void run()
{
account.deposit(amount,depositor);
}

}
public class depositThread
{
public static void main(String[] args)
{
bankaccount account=new bankaccount(1000);

deposit d1=new deposit(account,500, "alice");
deposit d2=new deposit(account,700, "bob");

d1.start();
d2.start();

}
}



















































































































































