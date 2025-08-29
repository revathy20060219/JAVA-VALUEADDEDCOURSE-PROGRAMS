class bankaccount
{
int balance=1000;
synchronized void deposit(int amt)
{
balance+=amt;
System.out.println("deposited:"+amt+"| balance:"+balance);
}
synchronized void withdraw(int amt)
{
if(balance>=amt)
{
balance-=amt;
System.out.println("withdraw:"+amt+"|balance:"+balance);
}
else
{
System.out.println("insufficient balance!");
}
}
}
public class banking
{
public static void main(String args[])
{
bankaccount acc=new bankaccount();
Thread t1=new Thread(() -> acc.deposit(500));
Thread t2=new Thread(() ->acc.withdraw(700));
t1.start();
t2.start();
}
}



































































