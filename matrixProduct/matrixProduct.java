package matrixProduct;


import java.util.Scanner;

/**
 * @author eduardomartinez
 */
public class matrixProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULADORA DE PRODUCTO DE MATRICES");
        System.out.println("2X3 * 3X2");
        int n = 2;
        int m = 3;
        int[][] array1 = new int[n][m];
        int[][] array2 = new int[m][n];
        int[][] array3 = new int[n][n];
        // INSERT VALUES
        for (int a = 0; a < 2; a++) {
            if (a==1) {
                m=2;
                n=3;
            }
            System.out.println("Ingrese los valores de la matriz " + (a + 1));
            for (int i = 0; i < n; i++) {
                System.out.println("Renglon" + (i + 1));
                for (int j = 0; j < m; j++) {
                    System.out.print("Valor" + (j + 1) + ": ");
                    if (a == 0) {
                        array1[i][j] = sc.nextInt();
                    }

                    if (a == 1) {
                        array2[i][j] = sc.nextInt();
                    }

                }

            }
        }
        n=2;
        m=3;
        // DISPLAY VALUES
        for (int a = 0; a < 2; a++) {
            if (a==1) {
                m=2;
                n=3;
            }
            System.out.println("Matriz " + (a + 1));
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a == 0) {
                        System.out.print(array1[i][j] + " ");
                    }

                    if (a == 1) {
                        System.out.print(array2[i][j] + " ");
                    }

                }
                System.out.println("");
            }
        }
        // RESULTS
        int sum = 0;
        n = 2;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum = array1[i][0]*array2[0][j];
                sum += array1[i][1]*array2[1][j];
                sum += array1[i][2]*array2[2][j];
                array3[i][j] = sum;
            }
        }
        // DISPLAY RESULTS
        System.out.println("Resultado de la multiplicación");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array3[i][j]+" ");
            }
            System.out.println("");
        }
    }

}

