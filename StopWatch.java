import java.util.Scanner;

public class StopWatch {
	public static void stopWatch() {
		Scanner Time = new Scanner(System.in);  
	long Start = 0;
		System.out.print(" Press 0 to Start ");
	long Num = Time.nextInt();

		if(Num == 0) {
			Start = System.nanoTime();  
		}
		else {
			System.out.println("Press 0  to start the Stopwatch.");
	        return;
	}

	long end = 0;
	int n = 0;
	while (n != 1) {
		n--;
	System.out.print(" Press  1 to stop ");
  int endI = Time.nextInt();
	if(endI == 1) {
	 end = System.nanoTime();     
	break;

	}
  }

 float ElapsedT = (float) ((end - Start)*Math.pow(10 , -9));
System.out.println("Elapsed time is =  " + ElapsedT + ".");  
		Time.close();
    }

public static void main(String[] args) {
		stopWatch();   
	
  }
}
