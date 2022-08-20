import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	   //function to checkPalindrome

    public void checkPalindrome()  {
    	System.out.println("Enter sequence");
    	int a= sc.nextInt();  // enter input
    	int temp = a; 
    	int rev = 0;
    	 
    	 while (temp != 0) {
    	 int rem = temp % 10; // 1
    	 rev = rev * 10 + rem;
    	 temp = temp/10;
    	 }
    	 //System.out.println(rev);
    	 if (rev == a)
    		 System.out.println("It is a palindrome sequence");
    	 else
    		 System.out.println("It is not palindrome sequence");
   }



         //function to printPattern

    public void printPattern() {
    	System.out.println("Enter number of rows");
    	int n= sc.nextInt();
    	int i,j;
    	for (i=n-1;i>=0;i--) {
    		for(j=n-2; j>=i; j--) {
    			System.out.print(" ");
    		}
    		for(j=0;j<=i;j++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}

   }



       //function to check no is prime or not

     public void checkPrimeNumber() {
    	System.out.println("Enter number");
     	int a= sc.nextInt();
     	int i=2; int count = 0;
     	if(a==0||a==1)
     		System.out.println("It is a Prime Number");
     	else {
     	
     	while(i<a)
        {
           if(a%i == 0)
           {
              count++;
              break;
           }
           i++;
        }
        
        if(count==0)
           System.out.println("It is a Prime Number");
        else
           System.out.println("It is not a Prime Number");
     }
     }

       // function to print Fibonacci Series

       public void printFibonacciSeries() {
    	System.out.println("Enter number of terms");
       	int n= sc.nextInt();
       	int n1 = 0, n2 = 1;int temp = 0; //initialize the first and second value as 0,1 respectively.
     
        for (int i = 1; i <= n; ++i) {
          int c= n1 + n2;
          n1 = n2;
          n2 = c;
          System.out.println(c);
       }
        
       }


//main method which contains switch and do while loop

   public static void main(String[] args) {

             Main obj = new Main();

             int choice;

             Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();



choice = sc.nextInt();

switch (choice) {



case 0:

choice = 0;

break;



case 1: {

obj.checkPalindrome();

}

break;



case 2: {



obj.printPattern();

}

break;



case 3: {

obj.checkPrimeNumber();

}

break;



case 4: {



obj.printFibonacciSeries();

}

break;



default:

System.out.println("Invalid choice. Enter a valid no.\n");

}



} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}
}
