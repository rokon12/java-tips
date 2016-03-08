package com.bazlur.tips;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/25/16.
 */

class Array2DDemo {

  public static void main(String[] args) {
    int[][] myArray = new int[12][8]; // A 12x8 grid, in [row][col] or [y][x]
    int numRows = myArray.length; // 12
    int numCols = myArray[0].length; // 8

    // Fill in grid
    for (int row = 0; row < numRows; ++row) {
      for (int col = 0; col < numCols; ++col) {
          myArray[row][col] = row * numCols + col + 1;
      }
    }

    // Print grid
    for (int row = 0; row < numRows; ++row) {
      for (int col = 0; col < numCols; ++col) {
          System.out.printf("%3d", myArray[row][col]);
      }
      System.out.println();
    }
  }
}

