// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Task {
//  public static int[][] twoDimArray;
//  public static int[][] twoDimReversed;
//  public static int revRow;
//  public static int revCol;
  public static void main(String[] args) {
    // put your code here
    gcd(1, 3);


//    int x = 15;
//    int y = 20;
//    int output = 0;
////    output = (x < y) ? (y + x) : (y - x)
//    if (x < y) {
//      output = y + x;
//    } else {
//      output = y - x;
//    }
//
//    System.out.println(output);
//
//
//    19 9
//    0 1 0 0 0 0 0 0 1
//    1 1 1 0 0 0 1 0 1
//    0 0 1 0 1 0 0 0 1
//    1 0 1 1 0 1 1 1 0
//    0 1 0 1 0 0 1 1 1
//    1 1 0 0 0 1 0 1 1
//    1 1 1 0 1 0 0 1 1
//    0 1 0 0 1 1 0 0 0
//    1 1 1 0 0 0 1 0 1
//    1 0 0 0 0 1 1 0 1
//    1 0 0 0 1 1 1 0 1
//    0 1 1 0 1 0 0 1 1
//    0 0 0 1 1 1 0 1 1
//    0 1 1 1 0 0 0 1 1
//    0 0 0 0 1 1 0 1 0
//    1 1 1 0 0 1 0 1 1
//    0 0 1 1 0 0 1 0 1
//    0 1 1 1 0 1 1 1 1
//    1 0 1 1 1 1 1 1 0
//    7

//    Scanner input = new Scanner(System.in);
//    int rowIn = input.nextInt();
//    int colIn = input.nextInt();
//    twoDimArray = new int[rowIn][colIn];
//    for (int i = 0; i < twoDimArray.length; i++) {
//      for (int j = 0; j < twoDimArray[0].length; j++) {
//        twoDimArray[i][j] = input.nextInt();
//      }
//    }
//
//    int row = twoDimArray.length;
//    int col = twoDimArray[0].length;
//    twoDimReversed = new int[row][col];
//
//    for (int i = 0; i < row; i++) {
//      int n = col;
//      for (int j = 0; j < col; j++) {
//        twoDimReversed[i][n - 1] = twoDimArray[i][j];
//        n = n - 1;
//      }
//    }
//
//    for (int i = 0; i < row; i++) {
//      for (int j = 0; j < col; j++) {
//        twoDimArray[i][j] = twoDimReversed[i][j];
//      }
//    }
//
//    int corner1 = twoDimArray[0][0];
//    int corner2 = twoDimArray[0][twoDimArray[0].length - 1];
//    int corner3 = twoDimArray[twoDimArray.length - 1][0];
//    int corner4 = twoDimArray[twoDimArray.length - 1][twoDimArray.length - 1];
//
//    System.out.println(corner1 + " " + corner2);
//    System.out.println(corner3 + " " + corner4);
//
//    for (int i = 0; i < twoDimArray.length; i++) {
//      for (int j = 0; j < twoDimArray.length; j++) {
//        if (i == 0 && j == 0) {
//          System.out.print(twoDimArray[i][j] + " ");
//        } else if (i == 0 && j == twoDimArray.length - 1) {
//          System.out.print(twoDimArray[i][j] + " ");
//        }
//      }
//      System.out.println();
//
//      for (i = twoDimArray.length - 1; i < twoDimArray.length; i++) {
//        for (int j = 0; j < twoDimArray.length; j++) {
//          if (i == twoDimArray.length - 1 && j == 0) {
//            System.out.print(twoDimArray[i][j] + " ");
//          } else if (i == twoDimArray.length - 1 && j == twoDimArray.length - 1) {
//            System.out.print(twoDimArray[i][j] + " ");
//          }
//        }
//        System.out.println();
//      }
//    }
  }

  public static int gcd(int a, int b) {
    while (b > 0) {
      int c = a % b;
      a = b;
      b = c;
    }
    System.out.println(a);
    return a;
  }
}