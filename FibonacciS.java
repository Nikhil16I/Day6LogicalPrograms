import java.util.Scanner;

public class FibonacciS {
   public static void main(String[] args) {
	Scanner Num = new Scanner(System.in);

	System.out.print("Input a  number =  ");
		int N = Num.nextInt();

    int x = 0;
    int y = 1;
    int S = 0;

        System.out.println("Fibonacci series for Number  " +N+ " is ");
		
            while(S <= N) {
		S = x + y;
		x = y;
		y = S;
	    if(S >= N) {
	    break;
	         }
	System.out.println("= " +S+ ".");
      }
   }
}
