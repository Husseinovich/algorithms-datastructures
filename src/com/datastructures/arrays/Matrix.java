package com.datastructures.arrays;

import java.util.Arrays;
import java.util.Random;

public class Matrix {	
	public static double[][] add(double [][] a, double [][]b){
		int m = a.length;
		int n = a[0].length;
		double[][] c = new double [m][n];
		for (int i = 0 ; i < m; i++){
			for (int j = 0; j < n; j++){
				  double res = a[i][j] + b [i][j];
				  c[i][j]= round(res, 3);
			}
		}
		return c;
	}
	
	public static void printOut(double [][]a){
		int m = a.length;
		int n = a[0].length;
		
		for (int i = 0 ; i < m; i++){
			for(int j = 0; j < n; j++){
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static double [][] generateMatrix(int m, int n){
		double [][] randomMatrix = new double [m][n];
		for (int i = 0; i < m; i++){
			for (int j = 0 ; j < n; j++){
				randomMatrix[i][j] = randomDouble(1, 50);
			}
		}
		return randomMatrix;
		
	}
	
	public static double randomDouble(int rangeMin, int rangeMax){
		Random random = new Random();
		double num = rangeMin + (rangeMax - rangeMin) * random.nextDouble();
		return round(num, 3);
	}
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
	public static void deepPrint(double [][]a){
		System.out.println(Arrays.deepToString(a));
	}
	
	

}
