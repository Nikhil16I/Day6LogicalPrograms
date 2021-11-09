import java.util.Scanner;

public class PerfectNum {

  public static void main(String[] args) {
     Scanner Num = new Scanner(System.in);
                int Sum=0;

   System.out.print("Input a Number = ");
                int N = Num.nextInt();

        for(int i=1;i<=N/2;i++) {
        if(N % i == 0) {
        Sum=Sum+i;


        }
    }
        if(Sum == N) {
   System.out.println( " = "+ N +" , Is is Perfect Number");
     }
      else {
   System.out.println(" = "+ N + " , Is is Not Perfect Number");

   }
  }
}

