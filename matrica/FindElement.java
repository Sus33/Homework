package matrica;

public class FindElement {
    public static void main(String[] args) {
        int[][] num = {{12, 20, 30, 40}, {15, 25, 35, 45}, {24, 29, 39, 51}, {35, 30, 39, 50}, {50, 60, 75, 72}};

        int rows = 5;
        int searchElement = 39;
        int[] find = find(num, rows - 1, 0, searchElement);
        System.out.println("Position of " + searchElement + " in the matrix is (" + find[0] + "," + find[1] + ")");
    }

    private static int[] find(int[][] num, int row, int col, int searchElement) {

        int[] elementPos = {-1, -1};
        if (row < 0 || col >= num[row].length) {
            return elementPos;
        }
        if (num[row][col] == searchElement) {
            elementPos[0] = row;
            elementPos[1] = col;
            return elementPos;
        }
        else if (num[row][col] > searchElement) {
            return find(num, row - 1, col, searchElement);
        }
        return find(num, row, col + 1, searchElement);
    }
}

