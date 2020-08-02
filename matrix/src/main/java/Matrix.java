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
            if(this.matrix == null){
                this.matrix = new int[rows.length][values.length];
            }
            for(j = 0; j < values.length; j++){
                this.matrix[i][j] = Integer.parseInt(values[j]);
            }
        }
    }

    int[] getRow(int rowIndex) {
        return this.matrix[rowIndex - 1];
    }

    int[] getColumn(int columnIndex) {
        columnIndex--;
        int[] column = new int[this.matrix.length];
        for(int i = 0; i < this.matrix.length; i++){
            column[i] = this.matrix[i][columnIndex];
        }
        return column;
    }
}
