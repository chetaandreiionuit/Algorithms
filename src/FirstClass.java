// metoda care verifica daca numarul introdus face parte din diagonala principala
public class FirstClass {

    public static boolean MetodaApartenentaDiagPrincip(int a, int[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (i == j) {
                    if (b[i][j] == a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static boolean MetodaApartenentaDiagSec(int a, int[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (i + j == b.length - 1) {
                    if (b[i][j] == a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // metoda care face o foarma frumoasa
    public static void MetodaDodoFrustrat(int[][] b) {
        char[][] c = new char[b.length][b.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (i <= b.length / 2 - 1 && j > i && j <= b.length - 2) {
                    c[i][j] = '1';
                }
                if (i >= b.length / 2 + 1 && j < i && j >= 1) {
                    c[i][j] = '1';
                }
                if (i <= b.length - 1 && i >= 1 && j > b.length / 2 && i < j) {
                    c[i][j] = '0';
                }
                if (i < b.length - 1 && i >= 1 && j < b.length / 2 && i > j) {
                    c[i][j] = '0';
                }
                if (i == j) {
                    c[i][j] = '\\';
                }
                if (i + j == b.length - 1) {
                    c[i][j] = '/';
                }
                if (i == j && i + j == b.length - 1) {
                    c[i][j] = 'X';
                }

                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }














    public static void main(String[] args) {
        int[][] b = {{1, 2, 3, 4, 5, 6, 7, 8, 9},
                    {8, 9, 10, 11, 12, 13, 14, 15, 16},
                    {15, 16, 17, 18, 19, 20, 21, 22, 23},
                    {22, 23, 24, 25, 26, 27, 28, 22, 24},
                    {29, 30, 31, 32, 33, 34, 35, 22, 24},
                    {36, 37, 38, 39, 40, 41, 42, 23, 23},
                    {43, 44, 45, 46, 47, 48, 49, 50, 22},
                    {23, 24, 25, 26, 12, 12, 23, 54, 12},
                    {12, 45, 23, 23, 43, 67, 32, 23, 11}};

            MetodaBrad(b);


    }
}

