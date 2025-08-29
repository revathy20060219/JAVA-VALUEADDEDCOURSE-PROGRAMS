class Mythread extends Thread
{
@Override

public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(i+"excecuted by"+Thread.currentThread().getName());
}
}
}
public class ThreadExample
{
public static void main(String args[])
{
Mythread t1=new Mythread();
t1.start();
}
}






