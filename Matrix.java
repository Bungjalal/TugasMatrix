/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrix;

/**
 *
 * @author Acer
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
         int[] [] array1 = {
            {5,6,7},
            {8,9,10},
            {11,12,12}
        };
        int[] [] array2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        System.out.println("======== Penjumlahan =========");
        
        PrintArrays(array1);
        System.out.println("");
        PrintArrays(array2);
        System.out.println("");
                
        
        int[][] resultpenjumlahan = Penjumlahan(array1, array2);
        PrintArrays(resultpenjumlahan);
        
        
    }
        
    private static int[] [] Penjumlahan (int [][] array_a2, int [][] array_b2){
        int row_a = array_a2.length;
        int column_a = array_a2[0].length;
        
        int[][]  result = new int[row_a] [column_a];
        for (int i = 0; i < row_a; i++) {
            for(int j = 0; j < column_a; j++) {
                result[i] [j] = array_a2[i] [j] + array_b2[i] [j];  
            }
        }
        return result; 
        
    }
    
    
    

    private static void PrintArrays (int[][] valuearrays) {
        int row  = valuearrays.length;
        int column = valuearrays[0].length;
  
        for (int i = 0; i < row; i++) {
            System.out.print("[");
            for (int j = 0; j < column; j++) {
                System.out.print(valuearrays[i][j]);
                if (j < (column -1)) {
                    System.out.print(",");
                
                } else {
                    System.out.print("]");     
                }
            }
            System.out.println("");
        }
    } 
    
}
