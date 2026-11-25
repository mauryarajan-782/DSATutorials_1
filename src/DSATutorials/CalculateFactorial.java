package DSATutorials;

public class CalculateFactorial {

	public static void main(String[] args) {
		
		int n = 5;			//assignment statement
		int fact = 1;		//assignment statement
		
		for(int i=1; i<n; i++) {		//loop
			fact = fact*i;
		}
		System.out.println("Factorial of "+n+" is : "+fact);		//print
	}

}

//f(n) = 2 + n + 1
//f(n) = n + 3
//f(n) = 3