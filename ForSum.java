public class ForSum {
       public static void main(String[] args)
{
       int[] numbers= {1,2,3,4,5,6,7,8,9,10};
       int sum = 0;
//Using for-each loop to iterate over elements of the array
       for(int n : numbers)
       sum = sum+n;

       System.out.println(sum);

}
}