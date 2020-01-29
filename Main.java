/**
 * 1) Complete the 5 methods of the Matrix class
 * 2) In your main method, declare and initialize matrices to test each method
 * 3) Test each method and Print out each result
 * 4) Add methods in the Matrix class to test whether or not you can
 *    add or subtract two matrices
 * 5) Add methods in the Matrix class to test whether or not you can
 *    multiply two matrices
 * 6) Make your code work intuitively with the two methods above
 *    (Ex: Print out "cannot add these matrices" if you cannot add the matrices.)
 */

public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];//2 rows, 4 columns
        int i=0;
        for (int j = 0; j < arr.length; j++) {
	        for (int k = 0; k < arr[j].length; k++) {
		        arr[j][k] = i;
		        i++;
            }
        }

        int[][] arr1 = new int[3][3];//2 rows, 4 columns
        int z=1;
        for (int o = 0; o < arr1.length; o++) {
	        for (int p = 0; p < arr1[o].length; p++) {
		        arr1[o][p] = z;
		        z++;
            }
        }
        
        
        Matrix.printArr(arr);//prints and array
        System.out.println();
        
        Matrix.printArr(arr1);//prints my second array so i know what i am adding and subtracting
        System.out.println();
        
        Matrix.printArr(Matrix.scalarMultiply(arr,2));//multiplies my matrix by a constant
        System.out.println();
        
        Matrix.printArr(Matrix.add(arr,arr1));//adds two arrays
        System.out.println();
        
        Matrix.printArr(Matrix.subtract(arr1,arr));//subtracts two arrays
        System.out.println();
        
        Matrix.printArr(Matrix.multiply(arr1,arr));//multiplies two arrays
        System.out.println();
        
        Matrix.printArr(Matrix.transpose(arr));//transposes the array
        System.out.println();
    }
}
