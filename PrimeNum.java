import java.util.Scanner; 

 public class PrimeNum { 
     public static void main(String args[]) { 
       Scanner Num=new Scanner(System.in);
                  
         int N,b,c; 
       System.out.println("Input A Number"); 
       
          N =Num.nextInt(); 
             b=2;c=0;
           while(b<= N)
                    	   
         { 
         if((N%b)==0) 
            c=c+1; 
             b++; 
         } 
          if(c==0) {
                 
         System.out.println(N +" is a prime number");
      System.out.println(); //SPACE
          }
        else {
        System.out.println(N +" is not a prime number"); 

    } 

 }
}
