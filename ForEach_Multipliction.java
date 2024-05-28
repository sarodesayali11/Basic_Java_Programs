public class ForEach_Mul {
       public static void main(String[] args)
{
       int[] Table= {1,2,3,4,5,6,7,8,9,10};
       int no = 5;
       int ans = 1;
//Using for-each loop to iterate over elements of the array
       for(int Tbl : Table){
       ans = no*Tbl;


       System.out.println(ans);
}

}
}