public class maths
{
public int add(int a,int b)
{
return a+b;
}
public int multiply(int a,int b)
{
return a*b;
}
public double divide(double a,double b)
{
if(b!=0)
{
return (double) a / b;
}
else
{
System.out.println("error:Division by zero not allowed");
return 0;
}
}
public static void main(String args[])
{
maths math=new maths();
int sum=math.add(10,5);
int product=math.multiply(10,5);
double quotient=math.divide(10,5);
System.out.println("addition:"+sum);
System.out.println("multiplication:"+product);
System.out.println("division:"+quotient);
}
}