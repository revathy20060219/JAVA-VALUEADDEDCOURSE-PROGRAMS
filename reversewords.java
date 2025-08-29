import java.util.*;
public class reversewords
{
public static void main(String args[])
{
String input="Amazon development centre,Chennai";
input=input.toLowerCase();
String[] words=input.split(" ");
System.out.print("Reversed string:");
for(int i = words.length-1;i>=0;i--)
{
System.out.print(words[i] + " ");
}
}
}