package Lab01;

public class AddMatrices {
    public static void main(String[] args) {
        int matrix1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        int matrix2[][] = {{3,2,1}, {6,5,4}, {9,7,8}};
        int sumMaxtrix[][] = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                sumMaxtrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < sumMaxtrix[i].length; j++){
                System.out.print(sumMaxtrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
