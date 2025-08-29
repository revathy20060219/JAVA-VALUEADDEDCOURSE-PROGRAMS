import java.util.Arrays;
public class learnarrays
{
public static void main(String[] args)
{
int[] marks=new int[5];

marks[0]=81;
marks[1]=89;
marks[2]=72;
marks[3]=62;
marks[4]=100;

int scores[]={81,89,72,62,100};
int arrayoflength=scores.length;
System.out.println("total number of scores:"+arrayoflength);

Arrays.sort(scores);
		
		   
System.out.println("scores of 2nd person:"+scores[2]);
for(int i=0;i<scores.length;i++)
{
System.out.println(scores[i]);
}
System.out.println("Least Value:"+scores[0]);
System.out.println("Largest value:"+scores[arrayoflength-1]);

}
}