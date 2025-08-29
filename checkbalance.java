class Bank
{
private int balance=5000;
public synchronized void showbalance()
{
System.out.println(Thread.currentThread().getName()+"checking balance:"+balance);
}
}
class balanceworker extends Thread
{
private Bank bank;
public balanceworker(Bank bank)
{
this.bank=bank;
}
public void run()
{
bank.showbalance();
}
}
public class checkbalance
{
public static void main(String []args)
{
Bank myBank=new Bank();
Thread t1=new balanceworker(myBank);
Thread t2=new balanceworker(myBank);

t1.setName("worker1");
t2.setName("worker2");

t1.start();
t2.start();

}
}




















































