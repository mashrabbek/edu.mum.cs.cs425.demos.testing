package org.example;

import org.example.service.ArrayFlattenerService;


public class Main {
    public static void main(String[] args) {

        int[][] twoDArray = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        ArrayFlattenerService flattenerService = new ArrayFlattenerService();
        int[] oneDArray = flattenerService.flattenArray(twoDArray);

        // Print the flattened array
        for (int num : oneDArray) {
            System.out.print(num + " ");
        }
    }
}