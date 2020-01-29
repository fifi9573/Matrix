//Name: Fiona Tong
//Date: 1/9/18
//Period: 6
public class Matrix {
    
    /** Will print a 2D array of ints
     * 
     * */
     public static void printArr(int[][] arr){//prints the 2D array with a loop
         for (int r = 0; r < arr.length; r++) {
	        for (int c = 0; c < arr[r].length; c++) {
		        System.out.print(arr[r][c]+ " ");
            }
            System.out.println();
        }
     }
     
     /** Scalar multiplication of a matrix
     * @param a 2-dimension int array
     * @param scalar scalar multiplier
     * @return the scalar product of a and c as a 2-dimension int array
     * Precondition: Dimensions of a and b are the same
    */
    public static int[][] scalarMultiply(int[][]a, int scalar) {
        int[][] ar = new int[a.length][a[0].length];
        for (int j = 0; j < a.length; j++) {
	        for (int k = 0; k < a[j].length; k++) {
		        ar[j][k] = a[j][k]*scalar;
            }
        }
        return ar;
    }
    
    /** Addition of two matrices
     * @param a 2-dimension int array
     * @param b 2-dimension int array
     * @return the sum of a and b as a 2-dimension int array
     * Precondition: Dimensions of a and b are the same
    */
    public static int[][] add(int[][]a, int[][]b) {//Must have same dimensions(2 by 2 for int [][]a means 2 by 2 for int[][]b 
        int[][] ar = new int[a.length][a[0].length];
        for (int j = 0; j < a.length; j++) {
	        for (int k = 0; k < a[j].length; k++) {
		        ar[j][k] = a[j][k] + b[j][k];
            }
        }
        return ar;
    }
    /** Difference of two matrices
     * @param a 2-dimension int array
     * @param b 2-dimension int array
     * @return the difference of a and b as a 2-dimension int array
     * Precondition: Dimensions of a and b are the same
    */
    public static int[][] subtract(int[][]a, int[][]b) {
        int[][] ar = new int[a.length][a[0].length];
        for (int j = 0; j < a.length; j++) {
	        for (int k = 0; k < a[j].length; k++) {
		        ar[j][k] = a[j][k] - b[j][k];
            }
        }
        return ar;
    }
    
    /** Multiplication of two matrices
     * @param a 2-dimension int array
     * @param b 2-dimension int array
     * @return the product of a and b as a 2-dimension int array
     * Precondition: Number of columns in a equals the number of rows in b
    */
    public static int[][] multiply(int[][]a, int[][]b) {
        int[][] ar = new int[a.length][a[0].length];
        for (int j = 0; j < a.length; j++) {
	        for (int k = 0; k < a[j].length; k++) {
		        ar[j][k] = a[j][k] * b[j][k];
            }
        }
        return ar;
    }
    
    /** Transpose of a matrix (rows become columns and columns become rows)
     * @param a 2-dimension int array
     * @return the transpose of a
    */
    public static int[][] transpose(int[][]a) {
        int[][] ar = new int[a.length][a[0].length];
        for (int j = 0; j < a.length; j++) {
	        for (int k = 0; k < a[j].length; k++) {
		        ar[j][k] = a[k][j];
            }
        }
        return ar;
    }
    
    public static boolean canAddSubtract(int[][]a, int[][]b){
        return a.length==b.length && a[0].length == b[0].length;
    }
    public static boolean canMultiplyDivide(int[][]a, int[][]b){
        return a.length==b.length;
    }
}
