import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Matrix {
    private int[][] matrix;

    Matrix(String matrixAsString) {
        String[] rows = matrixAsString.split("\n");
        int i, j;
        for(i = 0; i < rows.length; i++){
            String[] values = rows[i].split(" ");
            if(matrix == null){
                matrix = new int[rows.length][values.length];
            }
            for(j = 0; j < values.length; j++){
                matrix[i][j] = Integer.parseInt(values[j]);
            }
        }
    }

    int[] getRow(int rowIndex) {
        return matrix[rowIndex - 1];
    }

    int[] getColumn(int columnIndex) {
        columnIndex--;
        int[] column = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++){
            column[i] = matrix[i][columnIndex];
        }
        return column;
    }
}
