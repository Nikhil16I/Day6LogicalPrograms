import java.util.Scanner;

public class coupon {
	public static int random(int N) {
		return (int)(Math.random()*N);   
	}

public static int distinctCoupon(int N) {
   boolean[] isCollected = new boolean[N];  
   int count = 0;
   int distinct = 0; 

while(distinct < N) {
	int value = random(N);
	count++;
if( !isCollected[value] ) {
	distinct++;
	isCollected[value] = true;
    }
  }
return count;
	}
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
	System.out.println("INput Number = ");

  int N = input.nextInt();
 int count = distinctCoupon(N);  
	System.out.println( "= " +count+ ".");
		
         input.close();
 }

}
