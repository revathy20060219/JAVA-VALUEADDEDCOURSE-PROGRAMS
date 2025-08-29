class bankaccount
{
private int balance=1000;
public synchronized void withdraw(String name,int amount)
{
if(balance>=amount)
{
System.out.println(name+"is trying to withdraw"+amount);
try
{
Thread.sleep(300);
}
catch(InterruptedException e)
{
e.printStackTrace();
}
balance-=amount;
System.out.println(name+"completed withdrawal.remaining balance:"+balance);
}
else
{
System.out.println(name+"tried to withdraw"+amount+"but insufficient balance!");
}
}
}
class customer extends Thread
{
bankaccount account;
int amount;
customer(bankaccount account,String name,int amount,int priority)
{
super(name);
this.account=account;
this.amount=amount;
this.setPriority(priority);
}
public void run()
{
System.out.println(getName()+"has priority:"+getPriority());
account.withdraw(getName(),amount);
}
}
public class prioritybankdem0
{
public static void main(String args[])
{
bankaccount account=new bankaccount();

customer c1=new customer(account,"alice",600,Thread.MAX_PRIORITY);
customer c2=new customer(account,"BOB",400,Thread.NORM_PRIORITY);
customer c3=new customer(account,"CHARLIE",300,Thread.MIN_PRIORITY);

System.out.println("Assigned Priorities:");
System.out.println("Alice: " + c1.getPriority());
System.out.println("Bob: " + c2.getPriority());
System.out.println("Charlie: " + c3.getPriority());

c1.start();
c2.start();
c3.start();
}
}







































































































































































































































































































