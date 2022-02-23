import java.util.*;

class Factorial{   public static long factorial(int num) 
  {
    if(num>=1)
   return num*factorial(num-1);
    else
    return 1;

   }
	public static void main(String[] args) {
		
      int num;
         System.out.println("Enter  Whole Number:");
        Scanner sc = new Scanner(System.in);
   num = sc.nextInt();
   long fact = factorial(num);
   System.out.println("Factorial of "+num+"  =  "+fact);
 
 
	}
}