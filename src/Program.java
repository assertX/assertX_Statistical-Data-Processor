package javaproject_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;





public class Program {
	static public void main(String[] args) throws IOException {
		
		// Open files, the scanner, and writer.
		FileInputStream inputFile = new FileInputStream("data.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("results.txt");
		PrintWriter writer = new PrintWriter(outputFile);
		
		// Two array lists for x and y.
		ArrayList<Double> xValue = new ArrayList<>();
		ArrayList<Double> yValue = new ArrayList<>();
		
		// Loop through input file and store in the appropriate array lists.
		int totalPairs = 0;
		double sumOfX = 0;
		double sumOfY = 0;
		while (scanner.hasNextDouble()) {
			
			// Stores the xValues to the array list
			double xNum = scanner.nextDouble();
			xValue.add(xNum);
			sumOfX += xNum;
			
			// Stores the yValues to the array list
			double yNum = scanner.nextDouble();
			yValue.add(yNum);
			sumOfY += yNum;
			
			// Calculates the total amount of pairs
			totalPairs++;
		}
	
		// Figure out the average for x and y.
		double xAverage = sumOfX / totalPairs;
		double yAverage = sumOfY / totalPairs;
		
		
		// Call the data function required.
		double xStandDev = DataProcessing.xStandDev(xValue, xAverage, totalPairs);
		double yStandDev = DataProcessing.yStandDev(yValue, yAverage, totalPairs);
		double corrCoe = DataProcessing.correlationCoefficient(xValue, xAverage, yValue, yAverage, totalPairs);
		double slope = DataProcessing.linearFunction(xValue, sumOfX, yValue, sumOfY, totalPairs);
		double intercept = (sumOfY - slope * sumOfX) / totalPairs;
		
		// Write to the output file in the correct format.
		writer.println("Number of x-y pairs read: " + totalPairs);
		writer.printf("\nAlgebraic average of x: %.4f\n", xAverage);
		writer.printf("Algebraic average of y: %.4f\n", yAverage);
		writer.printf("Standard deviation of x: %.4f\n",xStandDev);
		writer.printf("Standard deviation of y: %.4f\n",yStandDev);
		writer.printf("\nCorrelation coefficient: %.4f\n", corrCoe);
		writer.println("\nLinear fitting function:\n");
		writer.printf("y = %.4fx + %.4f\n", slope, intercept);
		writer.printf("\nSlope: %.4f\n", slope);
		writer.printf("Intercept: %.4f\n", intercept);
		
		
		
		// Close files, scanner, and writer.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();
	}
}
