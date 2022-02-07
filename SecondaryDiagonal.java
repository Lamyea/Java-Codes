/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondarydiagonal;

import java.util.Scanner;

/**
 *
 * @author Nowrin
 */
public class SecondaryDiagonal {

    /**
     * @param args the command line arguments
     */

	public static void main(String[] args) {
	   
	       int sum_sec = 0;
	       int sum_main = 0;

	       //Creating hardcoded 3x3 matrix  
	       //To create non-square matrix,
	       //have to add a row or column
	       int[][] matrix = {{1,3,5},
			         {4,9,2},
			         {7,4,8}};
               
               int row = matrix.length ;
	       int col = matrix[0].length ;

               // printing the matrix		   
	       System.out.println("The input matrix is ");
	       System.out.println();
	       for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
	                  System.out.print( matrix[i][j] + "  ");
			    }
		    System.out.println();
		    System.out.println();
	       }


	       System.out.println("Number of rows: " + row );
	       System.out.println("Number of columns: " + col );
              
	       //Checking for square matrix and
	       //Calculating secondary diagonal if possible
	       if(row == col){
			System.out.println("This is a square matrix.");
                        // Compute Sum of secodary diagonal elements
                        for (int i = 0, j = matrix[i].length - 1; i < matrix.length; i++, j--) {
                        sum_sec += matrix[i][j];
                        }
                         System.out.println("Sum of the Secondary diagonal Elements is " + sum_sec);
			 
	                //Comment out the next block 
			//to compute Sum of main diagonal elements
			
//                        for (int i = 0; i < matrix.length; i++) {
//	                      for (int j = 0; j < matrix[i].length; j++) {
//	                           if (i == j) {
//	                              sum_main += matrix[i][j];
//                                   }
//	                      }
//	               }
//                       System.out.println("Sum of the main diagonal Elements is " + sum_main);
		    }	
	       else {
			    System.out.println("This a not square matrix.");
	            }   
        }
}

               //Comment out the next code block to create
               //the matrix interactively

//	       Scanner sc = new Scanner(System.in);
//	       System.out.println("Enter matrix order 3x3");
//	       for (int i = 0; i < matrix.length; i++) {
//	            System.out.println("Enter elements of " + i + " row");
//	            for (int j = 0; j < matrix[i].length; j++) {
//	                   matrix[i][j] = getInt(sc, "");
//	            }
//	       }
//        public static int getInt(Scanner sc, String prompt) {
//		           int integer = 0;
//			   boolean isValid = false;
//		           while (isValid == false) {
//				   System.out.print(prompt);
//				   if (sc.hasNextInt()) {
//				       integer = sc.nextInt();
//				       isValid = true;
//				       } 
//				   else {
//				     System.err.println("Error! Invalid number. Try again.");
//				   }
//				   sc.nextLine();
//			   }
//			   return integer;
//	}
