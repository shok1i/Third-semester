package Work_18;

public class Matrix<T> {
    private T[][] matrix;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = (T[][]) new Object[rows][columns];
    }

    public void setElement(int row, int column, T element) {
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
            throw new IndexOutOfBoundsException("Invalid row or column index");
        }
        matrix[row][column] = element;
    }

    public T getElement(int row, int column) {
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
            throw new IndexOutOfBoundsException("Invalid row or column index");
        }
        return matrix[row][column];
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        Matrix<T> result = new Matrix<>(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                T element1 = matrix[i][j];
                T element2 = other.matrix[i][j];
                if (element1 instanceof Number && element2 instanceof Number) {
                    result.setElement(i, j, (T) Double.valueOf(((Number) element1).doubleValue() + ((Number) element2).doubleValue()));
                } else {
                    throw new IllegalArgumentException("Unsupported data types");
                }
            }
        }
        return result;
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (columns != other.rows) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix");
        }

        Matrix<T> result = new Matrix<>(rows, other.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                T sum = null;
                for (int k = 0; k < columns; k++) {
                    T element1 = matrix[i][k];
                    T element2 = other.matrix[k][j];
                    if (element1 instanceof Number && element2 instanceof Number) {
                        double product = ((Number) element1).doubleValue() * ((Number) element2).doubleValue();
                        if (sum == null) {
                            sum = (T) Double.valueOf(product);
                        } else {
                            sum = (T) Double.valueOf(((Number) sum).doubleValue() + product);
                        }
                    } else {
                        throw new IllegalArgumentException("Unsupported data types");
                    }
                }
                result.setElement(i, j, sum);
            }
        }
        return result;
    }
}
