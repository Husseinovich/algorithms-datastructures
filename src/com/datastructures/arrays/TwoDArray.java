package com.datastructures.arrays;

public class TwoDArray {

	public static void main(String[] args) {
	/*	double [][] a = new double [][]{
				{ 1.0, 2.5, 6.5, 7.0 }, 
				{ 1.0, 20.5, 6.5, 7.0 },
				{ 1.0, 24.5, 13.5, 5.0 },
				{ 1.0, 20.5, 6.5, 3.0 }
		};
		double [][] b = new double [][]{
			{ 5.0, 2.5, 6.5, 7.0 }, 
			{ 6.0, 7.5, 2.5, 7.0 },
			{ 1.0, 2.5, 3.5, 7.0 },
			{ 1.0, 4.0, 5.5, 7.0 }
	};
	*/
		
	double [][] a = Matrix.generateMatrix(5, 5);
	
	double [][] b = Matrix.generateMatrix(5, 5);
	
	System.out.println("Matrix A: ");
	Matrix.printOut(a);

	System.out.println("Matrix B: ");
	Matrix.printOut(b);
	System.out.println("Matrix Res: ");

	double [][] c = Matrix.add(a, b);
	Matrix.printOut(c);
	}
}