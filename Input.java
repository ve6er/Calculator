import java.io.*;
import java.util.*;

class Input{
	Scanner scan = new Scanner(System.in);
	public double[] inputNumbers(){
		double numbers[] = new double [2];
		
		System.out.println("Enter the first number: ");
		
		double n1 = scan.nextDouble();
		numbers[0]= n1;
		System.out.println("Enter the second number: ");
		double n2 = scan.nextDouble();
		numbers[1]= n2;
		
		return numbers;
	}

	public double[] inputArray(int n1){
		int i;
		double yee[] = new double[n1];
		for (i=0;i<n1;i++){
			yee[i]= scan.nextDouble();
		}

		return yee;
	}
}		
		