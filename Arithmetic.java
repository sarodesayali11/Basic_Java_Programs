public class Arithmetic
{
public static void main(String args[])
{
int op = Integer.parseInt(args[0]);
int a = Integer.parseInt(args[1]);
int b = Integer.parseInt(args[2]);
switch (op){
case 1:
   System.out.println("Addition" +(a+b));
break;
case 2:
   System.out.println("Subtraction" +(a-b));
break;
case 3:
   System.out.println("Multiplication" +(a*b));
break;
case 4:
   System.out.println("Division" +(a/b));
break;
          }
}
}