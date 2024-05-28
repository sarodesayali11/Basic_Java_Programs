public class Palindrome
{
public static void main(String args[])
{
int rem;
int rev=0;
int no= Integer.parseInt(args[0]);
int or;
or = no;
 while(no!=0)
{
rem = no%10;
rev = rev * 10 + rem;
no = no/10;
}
if(or==rev)
System.out.println("  Palindrome");
else 
System.out.println(" Not Palindrome");

}
}