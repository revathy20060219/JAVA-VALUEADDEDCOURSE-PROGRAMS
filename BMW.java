import java.util.*;
public class BMW extends car
{
public void sevenseater()
{
System.out.println("7 seater");
}
public static void main(String[] args)
{
BMW bm=new BMW();
bm.sevenseater();
bm.fourwheelerenabled();
bm.applybrake();
bm.applyhorn();
}
}