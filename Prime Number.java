public class Prime
{
public static void main(String args[])
{
int f = 0;
int no = Integer.parseInt(args[0]);
int i;
for(i=2;i<no;i++)
{
if(no%i==0)
f=1;
break;
}
if(f==1)
   System.out.println("Not Prime");
else
   System.out.println("Prime");

}}