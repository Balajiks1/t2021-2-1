
import java.util.Scanner;

public class Problem1 
{
	private double a;
	private double b;
	private String operation;

	public Problem1(double a, double b, String operation) 
	{
		this.a=a;
		this.b=b;
		this.operation=operation;
	}

	public double calculate() 
	{
		switch(operation) {
		case "+":
			return a+b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			if (b != 0) {
				return a / b;
			} else {
				throw new ArithmeticException("Division by zero is not allowed.");
			}
		default:
			throw new IllegalArgumentException("Invalid operation.");
		}

	}


	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the first number");
		double a=scan.nextDouble();
		System.out.println("Enter the second number");
		double b=scan.nextDouble();
		
		System.out.println("Enter type of operation");
		System.out.println("For Addition --> + ");
		System.out.println("For Substraction --> - ");
		System.out.println("For Multiplication --> * ");
		System.out.println("For Division --> / ");
		String opration=scan.next();

		Problem1 calc=new Problem1(a,b,opration);
        double result=calc.calculate();
        
        System.out.println("Result = " + result);
	}

}
