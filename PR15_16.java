import java.util.Random;

public class PR15_16 {
    public static void main(String[] args) {
        Random rand = new Random();

        // Одномерный массив
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        System.out.print("Одномерный массив: ");
        for (int num : array) System.out.print(num + " ");
        System.out.println();

        int min = array[0], max = array[0];
        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Минимум: " + min + ", Максимум: " + max);

        // Квадратная матрица
        int size = 5;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (i == j) ? 1 : 0;
            }
        }

        System.out.println("\nКвадратная матрица (главная диагональ = 1):");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Треугольник Паскаля
        int rows = 6;
        int[][] pascal = new int[rows][];
        for (int i = 0; i < rows; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }

        System.out.println("\nТреугольник Паскаля (ступенчатый массив):");
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < rows - i - 1; k++) {
                System.out.print(" ");
            }
            for (int val : pascal[i]) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}