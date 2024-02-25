public class TwoDArrayExample {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3]; // A 3x3 matrix
        
        // Initialize matrix elements
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        
        // Access and print matrix elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
