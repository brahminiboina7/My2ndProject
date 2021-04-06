import java.util.Scanner;
class PrimeOrNot{
	public static void main(String[]args){
	int x;
	int count=0;
	int i;
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER A NUMBER:");
	x=sc.nextInt();
 	for(i=1; i<x; i++){
	 if(x%i==0){
	   count++;
	  }
	}
	if(count == 1){
	 System.out.println("Given number:"  +x+ " is a prime number");
	}
	else{
	 System.out.println("Given number:" +x+ " is not a prime number");
	}

	}
}