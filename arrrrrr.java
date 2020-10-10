

import java.util.Arrays;

public class arrrrrr {

    public static void main(String[] args) {


        //3D ARRAYS
        System.out.println("It's a 3D arrays: \" 2x5x2 \"");

        int arr4[][][] = new int[2][5][2];

        int TWE = 0;
        for (int i = 0; i < arr4.length; i++) {

            for (int x = 0; x < arr4[i].length; x++) {


                for (int y = 0; y < arr4[i][x].length; y++) {


                    arr4[i][x][y] = TWE++;

                    System.out.println("Main box number: " + (i + 1) + " | with box number:  " + (x + 1) + " With Var number:" + (TWE) + " ");

                }

            }

            System.out.println();

        }


        System.out.println("**********");
        System.out.println();
        System.out.println();
        System.out.println(Arrays.deepToString(arr4));
        System.out.println();
        System.out.println();
        System.out.println("**********");


        //4D IN A DIFFERENT WAYS

          /*
        The purpose of using arrays is to Store a huge amount of Data. For example let's imagine that we wanna
         store 18M students names to the memory. We can't do that in a regular way of storing variables (We
         can but it can take months to write it down) : so we need to use arrays & for loop.
        This loop is the means of storing 18M vars using just 8 lines of code.
        */

        int MillionStudent[][][][] = new int[3][3][2][1000000]; //18Million VARS


        int V = 0;
        for (int i = 0; i < MillionStudent.length; i++) {

            for (int x = 0; x < MillionStudent[i].length; x++) {


                for (int y = 0; y < MillionStudent[i][x].length; y++)

                    for (int y1 = 0; y1 < MillionStudent[i][x][y].length; y1++) {

                        MillionStudent[i][x][y][y1] = V++;

                        System.out.println("Main SCHOOL number: " + (i + 1) + " | with CLASS number:  " + (x + 1) + " | In room number: " + (y + 1) + " With Student number:" + (V) + " ");

                    }

                System.out.println();

            }




        }

        System.out.println("**********");
        System.out.println();
        System.out.println();
        System.out.println(Arrays.deepToString(MillionStudent));
        System.out.println();
        System.out.println();
        System.out.println("**********");


        int arrays4D1[][][][] = new int[][][][]{

                {
                        {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, {21, 22, 23, 24, 25, 26, 27, 28, 29, 30}, {31, 32, 33, 34, 35, 36, 37, 38, 39, 40}}

                        , {{41, 42, 43, 44, 45, 46, 47, 48, 49, 50}, {51, 52, 43, 54, 55, 56, 57, 58, 59, 60}, {61, 62, 63, 64, 65, 66, 67, 68, 69, 70}, {71, 72, 73, 74, 75, 76, 77, 78, 79, 80}},

                        {{81, 82, 83, 84, 85, 86, 87, 88, 89, 90}, {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}, {101, 102, 103, 104, 105, 106, 107, 108, 109, 110}, {111, 112, 113, 114, 115, 116, 117, 118, 119, 120}}
                },


                {

                        {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, {21, 22, 23, 24, 25, 26, 27, 28, 29, 30}, {31, 32, 33, 34, 35, 36, 37, 38, 39, 40}}

                        , {{41, 42, 43, 44, 45, 46, 47, 48, 49, 50}, {51, 52, 43, 54, 55, 56, 57, 58, 59, 60}, {61, 62, 63, 64, 65, 66, 67, 68, 69, 70}, {71, 72, 73, 74, 75, 76, 77, 78, 79, 80}},

                        {{81, 82, 83, 84, 85, 86, 87, 88, 89, 90}, {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}, {101, 102, 103, 104, 105, 106, 107, 108, 109, 110}, {111, 112, 113, 114, 115, 116, 117, 118, 119, 120}}

                },


                {


                        {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}, {21, 22, 23, 24, 25, 26, 27, 28, 29, 30}, {31, 32, 33, 34, 35, 36, 37, 38, 39, 40}}

                        , {{41, 42, 43, 44, 45, 46, 47, 48, 49, 50}, {51, 52, 43, 54, 55, 56, 57, 58, 59, 60}, {61, 62, 63, 64, 65, 66, 67, 68, 69, 70}, {71, 72, 73, 74, 75, 76, 77, 78, 79, 80}},

                        {{81, 82, 83, 84, 85, 86, 87, 88, 89, 90}, {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}, {101, 102, 103, 104, 105, 106, 107, 108, 109, 110}, {111, 112, 113, 114, 115, 116, 117, 118, 119, 120}}

                },


        };

        //How to run the 4D arrays in a for Loop

        int a = 0;
        for (int i = 0; i < arrays4D1.length; i++) {

            for (int x = 0; x < arrays4D1[i].length; x++) {


                for (int y = 0; y < arrays4D1[i][x].length; y++)

                    for (int y1 = 0; y1 < arrays4D1[i][x][y].length; y1++) {

                        arrays4D1[i][x][y][y1] = a++;

                        System.out.println("Main box number: " + (i + 1) + " | with box number:  " + (x + 1) + " | with box number: " + (y + 1) + " With Var number:" + (a) + " ");

                    }

                System.out.println();

            }


        }


        System.out.println("**********");
        System.out.println();
        System.out.println();
        System.out.println(Arrays.deepToString(arrays4D1));
        System.out.println();
        System.out.println();
        System.out.println("**********");



    }}
