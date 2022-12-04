package javaproject_2;

import java.util.ArrayList;

public class DataProcessing {
	/**
	 * Calculates the x standard deviation
	 * @param xValue: the array list of x values
	 * @param xAverage: the average of x values
	 * @param totalPairs: the total amount of pairs.
	 * @return: the x standard deviation
	 */
	static double xStandDev (ArrayList<Double> xValue, double xAverage, int totalPairs) {
		double xStandDev = 0;
		double sumOfAll = 0;
		int i;
		
		for (i = 0; i < totalPairs; i++) {
			// Adds the total value and iterates until the total amount of pairs has been met.
			sumOfAll += Math.pow(xValue.get(i) - xAverage, 2);
		}
		
		// After all the values have been stored into sumOfAll we can then calculate the standard deviation of x.
		xStandDev = Math.sqrt(sumOfAll / totalPairs);
		return xStandDev;
	}
	/**
	 * Calculates the y standard deviation
	 * @param yValue: the array list of y values
	 * @param yAverage: the average of y values
	 * @param totalPairs: the total amount of x-y pairs.
	 * @return: the y standard deviation
	 */
	static double yStandDev (ArrayList<Double> yValue, double yAverage, int totalPairs) {
		double yStandDev = 0;
		double sumOfAll = 0;
		int i;
		
		for (i = 0; i < totalPairs; i++) {
			// Adds the total value and iterates until the total amount of pairs has been met.
			sumOfAll += Math.pow(yValue.get(i) - yAverage, 2);
		}
		// After all the values have been stored into sumOfAll we can then calculate the standard deviation of y.
		yStandDev = Math.sqrt(sumOfAll / totalPairs);
		return yStandDev;
	}
	/**
	 * Calculates the correlation coefficient
	 * @param xValue: the array list of x values
	 * @param xAverage: the average of x values
	 * @param yValue: the array list of y values
	 * @param yAverage: the average of y values
	 * @param totalPairs: the total amount of x-y pairs
	 * @return: the correlation coefficient
	 */
	static double correlationCoefficient (ArrayList<Double> xValue, double xAverage, ArrayList<Double> yValue, double yAverage, int totalPairs) {
		// r represents the correlation coefficient
		double r = 0;
		double numerator = 0;
		double xDenominator = 0;
		double yDenominator = 0;
		double denominatorTotal = 0;
		int i;
		
		for (i = 0; i < totalPairs; i++) {
			// Iterate through the array lists and get the sum of the x and y side of the numerator.
			numerator += ((xValue.get(i) - xAverage) * (yValue.get(i) - yAverage));
			
			// Iterate through and figures out the sum of x and y side of the denominator.
			xDenominator += Math.pow(xValue.get(i) - xAverage, 2);
			yDenominator += Math.pow(yValue.get(i) - yAverage, 2);
		}
		// Square roots the denominator, then multiplies to get the total value of the denominator. 
		denominatorTotal = Math.sqrt(xDenominator) * Math.sqrt(yDenominator);
		
		// Calculates the final step of correlation coefficient by dividing numerator and denominator.
		r = numerator / denominatorTotal;
		return r;
	
	}
	/**
	 * Calculates the slope
	 * @param xValue: the array list of x values
	 * @param sumOfX: sum of all the x values
	 * @param yValue: the array list of y values
	 * @param sumOfY: sum of all the y values
	 * @param totalPairs: the total amount of x-y pairs
	 * @return: the slope
	 */
	static double linearFunction (ArrayList<Double> xValue, double sumOfX, ArrayList<Double> yValue, double sumOfY, int totalPairs) {
		double slope = 0;
		double numerator = 0;
		double denominator = 0;
		double sumOfNumerator = 0;
		double sumOfDenominator = 0;
		int i;
		
		for (i = 0; i < totalPairs; i++) {
			// Iterates through the x and y value array lists and multiplies, then the sum of those values is stored.
			sumOfNumerator += xValue.get(i) * yValue.get(i);
			
			// Iterates through the x value array list and squares the current value, then the sum of that value is stored.
			sumOfDenominator += Math.pow(xValue.get(i), 2);
		}
		numerator = totalPairs * sumOfNumerator - (sumOfX * sumOfY);
		denominator = totalPairs * sumOfDenominator - Math.pow(sumOfX, 2);
		
		slope = numerator / denominator;
		return slope;
		
	}
}
