import java.util.Scanner;

public class SystemAndScannerClass {
	//Instance variable
	

	public static void main(String[] args) {

		System.out.println("Hello Java world");//System class
		
		
		int value;//Local variable
		System.out.println("Enter a value?");
		Scanner sc = new Scanner(System.in);//Scanner class
		value = sc.nextInt();
		System.out.println(value);
		
		

	}

}
