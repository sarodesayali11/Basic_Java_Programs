public class Sum_Digit
{
public static void main(String args[])
{
int no = Integer.parseInt(args[0]);
int sum = 0;
int rem;

while(no!= 0)
{
  rem = no%10;
  sum = sum+rem;
  no = no/10;
}
System.out.println(" Sum of digits is " +sum);
}
}