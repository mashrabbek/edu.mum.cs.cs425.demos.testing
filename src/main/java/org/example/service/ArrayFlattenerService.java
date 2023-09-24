package org.example.service;

public class ArrayFlattenerService {

    public int[] flattenArray(int[][] inputArray) {
        if (inputArray == null) {
            return null; // Handle null input
        }

        int numRows = inputArray.length;
        int totalCols = 0;
        for (int i = 0; i < numRows; i++) {
            if (inputArray[i] != null) {
                totalCols += inputArray[i].length;
            }
        }

        int[] resultArray = new int[totalCols];
        int currentIndex = 0;

        for (int i = 0; i < numRows; i++) {
            if (inputArray[i] != null) {
                for (int j = 0; j < inputArray[i].length; j++) {
                    resultArray[currentIndex++] = inputArray[i][j];
                }
            }
        }

        return resultArray;
    }


}

