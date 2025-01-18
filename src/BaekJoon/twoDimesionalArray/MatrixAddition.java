package BaekJoon.twoDimesionalArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2738
 * N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
 */
public class MatrixAddition {
    public void letsAddThemAll() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = bf.readLine();
        StringTokenizer st = new StringTokenizer(inputLine, " ");
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        int [][] firstMatrix = new int[row][column];
        int [][] secondMatrix = new int[row][column];
        int [][] outputMatrix = new int[row][column];

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < row ; i++) {
            String firstRow = bf.readLine();
            StringTokenizer columns = new StringTokenizer(firstRow, " ");
            for(int j = 0 ; j < column ; j++) {
                firstMatrix[i][j] = Integer.parseInt(columns.nextToken());
            }
        }

        for(int i = 0 ; i < row ; i++) {
            String firstRow = bf.readLine();
            StringTokenizer columns = new StringTokenizer(firstRow, " ");
            for(int j = 0 ; j < column ; j++) {
                secondMatrix[i][j] = Integer.parseInt(columns.nextToken());
            }
        }

        for (int i = 0 ; i < row; i++ ) {
            for(int j = 0 ; j <column ; j++) {
                outputMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                sb.append(outputMatrix[i][j]);
                sb.append(" ");
            }
            sb.append(System.lineSeparator());
        }

        bf.close();
        System.out.println(sb);
    }
}
