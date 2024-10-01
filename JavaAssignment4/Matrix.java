package JavaAssignment4;

import java.util.Scanner;

class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;

    
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    
    public int getRows() {
        return rows;
    }

    
    public int getColumns() {
        return columns;
    }

    
    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid index.");
        }
    }

    
    public int getElement(int i, int j) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            return elements[i][j];
        } else {
            System.out.println("Invalid index.");
            return -1; 
        }
    }

    // Method to add two matrices
    public Matrix add(Matrix other) {
        if (this.rows != other.getRows() || this.columns != other.getColumns()) {
            System.out.println("Matrices cannot be added.");
            return null;
        }
        
        Matrix result = new Matrix(this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.setElement(i, j, this.elements[i][j] + other.getElement(i, j));
            }
        }
        return result;
    }

    
    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns for the first matrix: ");
        int cols1 = scanner.nextInt();
        
        Matrix matrix1 = new Matrix(rows1, cols1);
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1.setElement(i, j, scanner.nextInt());
            }
        }

        // Input for the second matrix
        System.out.print("Enter number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns for the second matrix: ");
        int cols2 = scanner.nextInt();
        
        Matrix matrix2 = new Matrix(rows2, cols2);
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2.setElement(i, j, scanner.nextInt());
            }
        }

        
        Matrix resultMatrix = matrix1.add(matrix2);
        
        
        if (resultMatrix != null) {
            System.out.println("Resultant Matrix:");
            resultMatrix.display();
        }

        scanner.close();
    }
}
