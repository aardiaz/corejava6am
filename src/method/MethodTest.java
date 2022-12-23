package method;

import java.util.Scanner;

public class MethodTest {
	
	public static void main(String[] args) {
		
		//sum();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any number ?");
//		int n = sc.nextInt();
//		
//		printTable(n);
		
//		int x = getSumOf1to100();
//		System.out.println("Sum of 1 to 100 = "+x);
//		
//	    int sv = findSmallestValue(4534, 456754);
//	    System.out.println("Smallest Value = "+sv);
		
		System.out.println(findFact(5));
		
		System.out.println(sumOf100noms(100));
	}
	
	//1. no return type with no arguments
	static void sum() {
		
		int a = 600;
		int b = 800;
		
		int s = a + b;
		System.out.println("Total sum = "+s);
	}
	
	//2. no return type with arguments
	static void printTable(int n) {
		
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
	
	
	//3. return type with no arguments
	
	static int getSumOf1to100(){
		
		int sum = 0;
		 
		for(int i=1; i<=100; i++) {
			 sum += i;//sum = sum + i
		 }
		
		return sum; 
	}
	
	//4. return type with arguments
	static int findSmallestValue(int x, int y) {
		
		 if(x<y)
     		return x;
		 else 
			 return y;
	}
	
	
	static int findFact(int n) {
		
		 if(n==1)
			 return 1;
		 
		 return n * findFact(n-1);
	}
	
	
	static int sumOf100noms(int n) {
		 
		if(n > 0)
			return n + sumOf100noms(n-1);
		
		return 0;
	}
	
}









