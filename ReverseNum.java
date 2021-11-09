import java.util.Scanner;

public class ReverseNum {
  public static void main(String[] args) {
     Scanner Rev = new Scanner(System.in);
		int R=0;
		
  System.out.print("Input a Number = ");
	int N=Rev.nextInt();

  System.out.println();//Space
		
    while(N != 0) {
   R = R * 10 + N % 10;
	N = N / 10;
	}

  System.out.println("Reverse Value for entered Number is  " +R);

  }
}
