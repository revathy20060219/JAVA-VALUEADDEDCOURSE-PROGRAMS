import java.util.*;

public class learnaccessmodifier1
{
public void depositamount()
{
System.out.println("5000");
}
private void atmpin()
{
System.out.println("12XX");
}

void knowsatmpin()
{
System.out.println("1234");

}

public static void main(String args[])
{
learnaccessmodifier1 access=new learnaccessmodifier1();

access.depositamount();
access.atmpin();
access.knowsatmpin();
}
}