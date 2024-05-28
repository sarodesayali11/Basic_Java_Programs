public class Odd
{
public static void main(String args[])
{
int i;
int sum = 0;
for(i=1;i<=20;i++)
{

if (i%2 == 1)
sum = sum + i;

}
System.out.println("sum of Number" +sum);
}
}