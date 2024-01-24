/*Veer Kukreja
AIML B3
PRN: 22070126130*/

import java.io.*;
import java.util.*;
import java.lang.Math;

class Main{
	public static void main(String args[]){
		Calculator calc = new Calculator();
		Input inp = new Input();
		Fibonacci fib = new Fibonacci();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Operation: ");
		System.out.println("+ for Addition");
		System.out.println("- for Subtraction");
		System.out.println("* for Multiplication");
		System.out.println("/ for division");
		System.out.println("f for Fibonacci");
		System.out.println("++ for Array Addition");
		System.out.println("-- for Array Subtraction");
		System.out.println("v for Variance of an Array");
		System.out.println("s for Standard Deviation");
		
		String operator = scan.nextLine();

		switch(operator){
			case "+" :{
				double numbers[] = inp.inputNumbers();
		
				double n1 = numbers[0];
				double n2 = numbers[1];
				System.out.println("The Addition of "+n1+" and "+n2+" is "+calc.addition(n1,n2));
				break;
		
				}
			case "-" :{
				double numbers[] = inp.inputNumbers();
		
				double n1 = numbers[0];
				double n2 = numbers[1];
				System.out.println("The Subtraction of "+n1+" and "+n2+" is "+calc.subtraction(n1,n2));
				break;
				}
			case "*" :{
				double numbers[] = inp.inputNumbers();
		
				double n1 = numbers[0];
				double n2 = numbers[1];
				System.out.println("The Multiplication of "+n1+" and "+n2+" is "+calc.multiplication(n1,n2));
				break;
				}
			case "/" :{
				double numbers[] = inp.inputNumbers();
		
				double n1 = numbers[0];
				double n2 = numbers[1];
				System.out.println("The Division of "+n1+" and "+n2+" is "+calc.division(n1,n2));
				break;
				}
			
			case "f" :{
				System.out.print("Enter the number of elements: ");
				int v = scan.nextInt();
				fib.givfib(v);
				break;
				}
			case "++":{
				System.out.print("Enter the number of elements: ");
				int v = scan.nextInt();
				double k1[] = new double[v];
				double k2[] = new double[v];
				double k3[] = new double[v];
				System.out.println("Enter the elements of the first array: ");
				k1=inp.inputArray(v);
				System.out.println("Enter the elements of the second array:");
				k2=inp.inputArray(v);
				k3=calc.aradd(k1,k2,v);
				System.out.print("\nThe resultant array is: ");
				for (int i=0;i<v;i++){
					System.out.print(k3[i]+" ");
				}	
				break;
			}
			case "--":{
				System.out.print("Enter the number of elements: ");
				int v = scan.nextInt();
				double k1[] = new double[v];
				double k2[] = new double[v];
				double k3[] = new double[v];
				System.out.println("Enter the elements of the first array: ");
				k1=inp.inputArray(v);
				System.out.println("Enter the elements of the second array:");
				k2=inp.inputArray(v);
				k3=calc.arsub(k1,k2,v);
				System.out.print("\nThe resultant array is: ");
				for (int i=0;i<v;i++){
					System.out.print(k3[i]+" ");
				}	
				break;
			}
			case "v":{
				System.out.print("Enter the number of elements: ");
				int v = scan.nextInt();
				double k1[] = new double[v];
				System.out.println("Enter the elements of the array: ");
				k1=inp.inputArray(v);
				double var= calc.arvar(k1, v);
				System.out.println("\nThe variance of the array is "+var);
				break;
			}
			case "s":{
				System.out.print("Enter the number of elements: ");
				int v = scan.nextInt();
				double k1[] = new double[v];
				System.out.println("Enter the elements of the array: ");
				k1=inp.inputArray(v);
				double var= calc.arvar(k1, v);
				System.out.println("\nThe Standard Deviation of the array is "+Math.sqrt(var));
				break;
			}
			default:{
				System.out.println("Please enter a valid input");
			}
		}
	}
}		