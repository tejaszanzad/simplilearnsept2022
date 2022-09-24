package mypackage;

import java.util.*;

class Matrix {
	int arr[][];
	int r,c;
	
	Matrix(int r, int c) {
		this.r = r;
		this.c = c;
		arr = new int[r][c];
	}
	
	public int[][] getMatrix() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				arr[i][j] = sc.nextInt();
			}
		} 
		return arr;
	}
		
	 public int[][] findSum(int a[][],int b[][]) {
		int[][] temp = new int[r][c];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				temp[i][j] = a[i][j]+b[i][j];
			}
		}
		return temp;	
	}
	
	public void displayMatrix(int[][] res) {
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(res[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
}
    
public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix obj1 = new Matrix(3,3);
		Matrix obj2 = new Matrix(3,3);
		
		int x[][], y[][], z[][];
		System.out.println("Enter Element For First Matrix :");
		x= obj1.getMatrix();
		System.out.println("\nEnter Elements For Second Matrix :");
		y= obj2.getMatrix();
		z= obj1.findSum(x,y);
		System.out.println("\nThe Sum Matrix Is :");
		obj2.displayMatrix(z);
	}

}
