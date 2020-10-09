# The-explanation-of-Java-Arrays-by-Shlomi-Aflalo
The explanation of Java Arrays by Shlomi Aflalo


import java.util.Arrays;

public class Arr {

    public static void main (String[]args){


        //THIS CLASS WILL TEACH YOU HOW TO DO THE 1D + 2D +3D ARRAYS +4D Arrays on java



        //Let's start with 1D Array//

        // 1 box with 3 variables inside

        System.out.println("It's a 1D array: \" 3 \"");
        System.out.println();
        int arr1[]=new int[3];
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=1;

        //

        // Or this way // int arr[]=new int[]{1,2,1};

        System.out.println(Arrays.toString(arr1));

        //2D Arrays
        System.out.println();
        System.out.println("It's a 2D arrays: \" 3x3 \"");
        System.out.println();
        int arr2[][]=new int[3][3];

        //3 boxes  - In each of every box you have 3 boxes (9 Boxes)


        arr2[0][0]=1;
        arr2[0][1]=2;
        arr2[0][2]=3;

        arr2[1][0]=4;
        arr2[1][1]=5;
        arr2[1][2]=6;

        arr2[2][0]=7;
        arr2[2][1]=8;
        arr2[2][2]=9;


        //or this way
        int arr3[][]=new int[][]{

                {

                        1, 2, 3
                },

                {

                        4, 5, 6

                },

                {

                        7, 8, 9

                }

        };


        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(arr3));
        System.out.println();
        System.out.println();
        System.out.println("****************************");




        //3D ARRAYS
        System.out.println("It's a 3D arrays: \" 2x5x2 \"");


        int arr4[][][] = new int[2][5][2];

        //location[0]  - 2 boxes  - In each of every box you have 5 boxes (10 Boxes) - in each of every box you have 2 boxes with numbers (20 boxes!)
        arr4[0][0][0] = 1;
        arr4[0][0][1] = 2;

        arr4[0][1][0] = 3;
        arr4[0][1][1] = 4;

        arr4[0][2][0] = 5;
        arr4[0][2][1] = 6;

        arr4[0][3][0] = 7;
        arr4[0][3][1] = 8;

        arr4[0][4][0] = 9;
        arr4[0][4][1] = 10;


        //location[1]
        arr4[1][0][0] = 11;
        arr4[1][0][1] = 12;

        arr4[1][1][0] = 13;
        arr4[1][1][1] = 14;

        arr4[1][2][0] = 15;
        arr4[1][2][1] = 16;

        arr4[1][3][0] = 17;
        arr4[1][3][1] = 18;

        arr4[1][4][0] = 19;
        arr4[1][4][1] = 20;


        int arrr4[][][] = new int[][][]{

                {

                        {1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}

                },

                {

                        {11, 12}, {13, 14}, {15, 16}, {17, 18}, {19, 20}


                }

        };

        System.out.println("****************************");
        System.out.println();
        System.out.println();
        System.out.println(Arrays.deepToString(arr4));
        System.out.println(Arrays.deepToString(arrr4));
        System.out.println();
        System.out.println();
        System.out.println("****************************");

        //4D Arrays

        // 3 big boxes  - In each of every box you have 3 main boxes - in each of every box you have 4 big boxes and in every one of them you have 10 little boxes (Variables).
        //360 Variables (U r welcome to count)

        System.out.println("It's a 4D arrays: \" 3x3x4x10 \"");
        int [][][][]arrays4D=new int[3][3][4][10];



        //location[0][0]
        arrays4D[0][0][0][0]=1;
        arrays4D[0][0][0][1]=2;
        arrays4D[0][0][0][2]=3;
        arrays4D[0][0][0][3]=4;
        arrays4D[0][0][0][4]=5;
        arrays4D[0][0][0][5]=6;
        arrays4D[0][0][0][6]=7;
        arrays4D[0][0][0][7]=8;
        arrays4D[0][0][0][8]=9;
        arrays4D[0][0][0][9]=10;

        arrays4D[0][0][1][0]=11;
        arrays4D[0][0][1][1]=12;
        arrays4D[0][0][1][2]=13;
        arrays4D[0][0][1][3]=14;
        arrays4D[0][0][1][4]=15;
        arrays4D[0][0][1][5]=16;
        arrays4D[0][0][1][6]=17;
        arrays4D[0][0][1][7]=18;
        arrays4D[0][0][1][8]=19;
        arrays4D[0][0][1][9]=20;

        arrays4D[0][0][2][0]=21;
        arrays4D[0][0][2][1]=22;
        arrays4D[0][0][2][2]=23;
        arrays4D[0][0][2][3]=24;
        arrays4D[0][0][2][4]=25;
        arrays4D[0][0][2][5]=26;
        arrays4D[0][0][2][6]=27;
        arrays4D[0][0][2][7]=28;
        arrays4D[0][0][2][8]=29;
        arrays4D[0][0][2][9]=30;


        arrays4D[0][0][3][0]=31;
        arrays4D[0][0][3][1]=32;
        arrays4D[0][0][3][2]=33;
        arrays4D[0][0][3][3]=34;
        arrays4D[0][0][3][4]=35;
        arrays4D[0][0][3][5]=36;
        arrays4D[0][0][3][6]=37;
        arrays4D[0][0][3][7]=38;
        arrays4D[0][0][3][8]=39;
        arrays4D[0][0][3][9]=40;


        //location[0][1]

        arrays4D[0][1][0][0]=41;
        arrays4D[0][1][0][1]=42;
        arrays4D[0][1][0][2]=43;
        arrays4D[0][1][0][3]=44;
        arrays4D[0][1][0][4]=45;
        arrays4D[0][1][0][5]=46;
        arrays4D[0][1][0][6]=47;
        arrays4D[0][1][0][7]=48;
        arrays4D[0][1][0][8]=49;
        arrays4D[0][1][0][9]=50;


        arrays4D[0][1][1][0]=51;
        arrays4D[0][1][1][1]=52;
        arrays4D[0][1][1][2]=53;
        arrays4D[0][1][1][3]=54;
        arrays4D[0][1][1][4]=55;
        arrays4D[0][1][1][5]=56;
        arrays4D[0][1][1][6]=57;
        arrays4D[0][1][1][7]=58;
        arrays4D[0][1][1][8]=59;
        arrays4D[0][1][1][9]=60;


        arrays4D[0][1][2][0]=61;
        arrays4D[0][1][2][1]=62;
        arrays4D[0][1][2][2]=63;
        arrays4D[0][1][2][3]=64;
        arrays4D[0][1][2][4]=65;
        arrays4D[0][1][2][5]=66;
        arrays4D[0][1][2][6]=67;
        arrays4D[0][1][2][7]=68;
        arrays4D[0][1][2][8]=69;
        arrays4D[0][1][2][9]=70;



        arrays4D[0][1][3][0]=71;
        arrays4D[0][1][3][1]=72;
        arrays4D[0][1][3][2]=73;
        arrays4D[0][1][3][3]=74;
        arrays4D[0][1][3][4]=75;
        arrays4D[0][1][3][5]=76;
        arrays4D[0][1][3][6]=77;
        arrays4D[0][1][3][7]=78;
        arrays4D[0][1][3][8]=79;
        arrays4D[0][1][3][9]=80;


        //location[0][2]

        arrays4D[0][2][0][0]=81;
        arrays4D[0][2][0][1]=82;
        arrays4D[0][2][0][2]=83;
        arrays4D[0][2][0][3]=84;
        arrays4D[0][2][0][4]=85;
        arrays4D[0][2][0][5]=86;
        arrays4D[0][2][0][6]=87;
        arrays4D[0][2][0][7]=88;
        arrays4D[0][2][0][8]=89;
        arrays4D[0][2][0][9]=90;


        arrays4D[0][2][1][0]=91;
        arrays4D[0][2][1][1]=92;
        arrays4D[0][2][1][2]=93;
        arrays4D[0][2][1][3]=94;
        arrays4D[0][2][1][4]=95;
        arrays4D[0][2][1][5]=96;
        arrays4D[0][2][1][6]=97;
        arrays4D[0][2][1][7]=98;
        arrays4D[0][2][1][8]=99;
        arrays4D[0][2][1][9]=100;


        arrays4D[0][2][2][0]=101;
        arrays4D[0][2][2][1]=102;
        arrays4D[0][2][2][2]=103;
        arrays4D[0][2][2][3]=104;
        arrays4D[0][2][2][4]=105;
        arrays4D[0][2][2][5]=106;
        arrays4D[0][2][2][6]=107;
        arrays4D[0][2][2][7]=108;
        arrays4D[0][2][2][8]=109;
        arrays4D[0][2][2][9]=110;

        arrays4D[0][2][3][0]=111;
        arrays4D[0][2][3][1]=112;
        arrays4D[0][2][3][2]=113;
        arrays4D[0][2][3][3]=114;
        arrays4D[0][2][3][4]=115;
        arrays4D[0][2][3][5]=116;
        arrays4D[0][2][3][6]=117;
        arrays4D[0][2][3][7]=118;
        arrays4D[0][2][3][8]=119;
        arrays4D[0][2][3][9]=120;


        //location[1][0]

        arrays4D[1][0][0][0]=1;
        arrays4D[1][0][0][1]=2;
        arrays4D[1][0][0][2]=3;
        arrays4D[1][0][0][3]=4;
        arrays4D[1][0][0][4]=5;
        arrays4D[1][0][0][5]=6;
        arrays4D[1][0][0][6]=7;
        arrays4D[1][0][0][7]=8;
        arrays4D[1][0][0][8]=9;
        arrays4D[1][0][0][9]=10;

        arrays4D[1][0][1][0]=11;
        arrays4D[1][0][1][1]=12;
        arrays4D[1][0][1][2]=13;
        arrays4D[1][0][1][3]=14;
        arrays4D[1][0][1][4]=15;
        arrays4D[1][0][1][5]=16;
        arrays4D[1][0][1][6]=17;
        arrays4D[1][0][1][7]=18;
        arrays4D[1][0][1][8]=19;
        arrays4D[1][0][1][9]=20;

        arrays4D[1][0][2][0]=21;
        arrays4D[1][0][2][1]=22;
        arrays4D[1][0][2][2]=23;
        arrays4D[1][0][2][3]=24;
        arrays4D[1][0][2][4]=25;
        arrays4D[1][0][2][5]=26;
        arrays4D[1][0][2][6]=27;
        arrays4D[1][0][2][7]=28;
        arrays4D[1][0][2][8]=29;
        arrays4D[1][0][2][9]=30;


        arrays4D[1][0][3][0]=31;
        arrays4D[1][0][3][1]=32;
        arrays4D[1][0][3][2]=33;
        arrays4D[1][0][3][3]=34;
        arrays4D[1][0][3][4]=35;
        arrays4D[1][0][3][5]=36;
        arrays4D[1][0][3][6]=37;
        arrays4D[1][0][3][7]=38;
        arrays4D[1][0][3][8]=39;
        arrays4D[1][0][3][9]=40;


        //location[1][1]

        arrays4D[1][1][0][0]=41;
        arrays4D[1][1][0][1]=42;
        arrays4D[1][1][0][2]=43;
        arrays4D[1][1][0][3]=44;
        arrays4D[1][1][0][4]=45;
        arrays4D[1][1][0][5]=46;
        arrays4D[1][1][0][6]=47;
        arrays4D[1][1][0][7]=48;
        arrays4D[1][1][0][8]=49;
        arrays4D[1][1][0][9]=50;


        arrays4D[1][1][1][0]=51;
        arrays4D[1][1][1][1]=52;
        arrays4D[1][1][1][2]=53;
        arrays4D[1][1][1][3]=54;
        arrays4D[1][1][1][4]=55;
        arrays4D[1][1][1][5]=56;
        arrays4D[1][1][1][6]=57;
        arrays4D[1][1][1][7]=58;
        arrays4D[1][1][1][8]=59;
        arrays4D[1][1][1][9]=60;


        arrays4D[1][1][2][0]=61;
        arrays4D[1][1][2][1]=62;
        arrays4D[1][1][2][2]=63;
        arrays4D[1][1][2][3]=64;
        arrays4D[1][1][2][4]=65;
        arrays4D[1][1][2][5]=66;
        arrays4D[1][1][2][6]=67;
        arrays4D[1][1][2][7]=68;
        arrays4D[1][1][2][8]=69;
        arrays4D[1][1][2][9]=70;



        arrays4D[1][1][3][0]=71;
        arrays4D[1][1][3][1]=72;
        arrays4D[1][1][3][2]=73;
        arrays4D[1][1][3][3]=74;
        arrays4D[1][1][3][4]=75;
        arrays4D[1][1][3][5]=76;
        arrays4D[1][1][3][6]=77;
        arrays4D[1][1][3][7]=78;
        arrays4D[1][1][3][8]=79;
        arrays4D[1][1][3][9]=80;


        //location[1][2]

        arrays4D[1][2][0][0]=81;
        arrays4D[1][2][0][1]=82;
        arrays4D[1][2][0][2]=83;
        arrays4D[1][2][0][3]=84;
        arrays4D[1][2][0][4]=85;
        arrays4D[1][2][0][5]=86;
        arrays4D[1][2][0][6]=87;
        arrays4D[1][2][0][7]=88;
        arrays4D[1][2][0][8]=89;
        arrays4D[1][2][0][9]=90;


        arrays4D[1][2][1][0]=91;
        arrays4D[1][2][1][1]=92;
        arrays4D[1][2][1][2]=93;
        arrays4D[1][2][1][3]=94;
        arrays4D[1][2][1][4]=95;
        arrays4D[1][2][1][5]=96;
        arrays4D[1][2][1][6]=97;
        arrays4D[1][2][1][7]=98;
        arrays4D[1][2][1][8]=99;
        arrays4D[1][2][1][9]=100;


        arrays4D[1][2][2][0]=101;
        arrays4D[1][2][2][1]=102;
        arrays4D[1][2][2][2]=103;
        arrays4D[1][2][2][3]=104;
        arrays4D[1][2][2][4]=105;
        arrays4D[1][2][2][5]=106;
        arrays4D[1][2][2][6]=107;
        arrays4D[1][2][2][7]=108;
        arrays4D[1][2][2][8]=109;
        arrays4D[1][2][2][9]=110;

        arrays4D[1][2][3][0]=111;
        arrays4D[1][2][3][1]=112;
        arrays4D[1][2][3][2]=113;
        arrays4D[1][2][3][3]=114;
        arrays4D[1][2][3][4]=115;
        arrays4D[1][2][3][5]=116;
        arrays4D[1][2][3][6]=117;
        arrays4D[1][2][3][7]=118;
        arrays4D[1][2][3][8]=119;
        arrays4D[1][2][3][9]=120;


        //location[2][0]

        arrays4D[2][0][0][0]=1;
        arrays4D[2][0][0][1]=2;
        arrays4D[2][0][0][2]=3;
        arrays4D[2][0][0][3]=4;
        arrays4D[2][0][0][4]=5;
        arrays4D[2][0][0][5]=6;
        arrays4D[2][0][0][6]=7;
        arrays4D[2][0][0][7]=8;
        arrays4D[2][0][0][8]=9;
        arrays4D[2][0][0][9]=10;

        arrays4D[2][0][1][0]=11;
        arrays4D[2][0][1][1]=12;
        arrays4D[2][0][1][2]=13;
        arrays4D[2][0][1][3]=14;
        arrays4D[2][0][1][4]=15;
        arrays4D[2][0][1][5]=16;
        arrays4D[2][0][1][6]=17;
        arrays4D[2][0][1][7]=18;
        arrays4D[2][0][1][8]=19;
        arrays4D[2][0][1][9]=20;

        arrays4D[2][0][2][0]=21;
        arrays4D[2][0][2][1]=22;
        arrays4D[2][0][2][2]=23;
        arrays4D[2][0][2][3]=24;
        arrays4D[2][0][2][4]=25;
        arrays4D[2][0][2][5]=26;
        arrays4D[2][0][2][6]=27;
        arrays4D[2][0][2][7]=28;
        arrays4D[2][0][2][8]=29;
        arrays4D[2][0][2][9]=30;


        arrays4D[2][0][3][0]=31;
        arrays4D[2][0][3][1]=32;
        arrays4D[2][0][3][2]=33;
        arrays4D[2][0][3][3]=34;
        arrays4D[2][0][3][4]=35;
        arrays4D[2][0][3][5]=36;
        arrays4D[2][0][3][6]=37;
        arrays4D[2][0][3][7]=38;
        arrays4D[2][0][3][8]=39;
        arrays4D[2][0][3][9]=40;


        //location[2][1]


        arrays4D[2][1][0][0]=41;
        arrays4D[2][1][0][1]=42;
        arrays4D[2][1][0][2]=43;
        arrays4D[2][1][0][3]=44;
        arrays4D[2][1][0][4]=45;
        arrays4D[2][1][0][5]=46;
        arrays4D[2][1][0][6]=47;
        arrays4D[2][1][0][7]=48;
        arrays4D[2][1][0][8]=49;
        arrays4D[2][1][0][9]=50;


        arrays4D[2][1][1][0]=51;
        arrays4D[2][1][1][1]=52;
        arrays4D[2][1][1][2]=53;
        arrays4D[2][1][1][3]=54;
        arrays4D[2][1][1][4]=55;
        arrays4D[2][1][1][5]=56;
        arrays4D[2][1][1][6]=57;
        arrays4D[2][1][1][7]=58;
        arrays4D[2][1][1][8]=59;
        arrays4D[2][1][1][9]=60;


        arrays4D[2][1][2][0]=61;
        arrays4D[2][1][2][1]=62;
        arrays4D[2][1][2][2]=63;
        arrays4D[2][1][2][3]=64;
        arrays4D[2][1][2][4]=65;
        arrays4D[2][1][2][5]=66;
        arrays4D[2][1][2][6]=67;
        arrays4D[2][1][2][7]=68;
        arrays4D[2][1][2][8]=69;
        arrays4D[2][1][2][9]=70;



        arrays4D[2][1][3][0]=71;
        arrays4D[2][1][3][1]=72;
        arrays4D[2][1][3][2]=73;
        arrays4D[2][1][3][3]=74;
        arrays4D[2][1][3][4]=75;
        arrays4D[2][1][3][5]=76;
        arrays4D[2][1][3][6]=77;
        arrays4D[2][1][3][7]=78;
        arrays4D[2][1][3][8]=79;
        arrays4D[2][1][3][9]=80;


        //location[2][2]

        arrays4D[2][2][0][0]=81;
        arrays4D[2][2][0][1]=82;
        arrays4D[2][2][0][2]=83;
        arrays4D[2][2][0][3]=84;
        arrays4D[2][2][0][4]=85;
        arrays4D[2][2][0][5]=86;
        arrays4D[2][2][0][6]=87;
        arrays4D[2][2][0][7]=88;
        arrays4D[2][2][0][8]=89;
        arrays4D[2][2][0][9]=90;


        arrays4D[2][2][1][0]=91;
        arrays4D[2][2][1][1]=92;
        arrays4D[2][2][1][2]=93;
        arrays4D[2][2][1][3]=94;
        arrays4D[2][2][1][4]=95;
        arrays4D[2][2][1][5]=96;
        arrays4D[2][2][1][6]=97;
        arrays4D[2][2][1][7]=98;
        arrays4D[2][2][1][8]=99;
        arrays4D[2][2][1][9]=100;


        arrays4D[2][2][2][0]=101;
        arrays4D[2][2][2][1]=102;
        arrays4D[2][2][2][2]=103;
        arrays4D[2][2][2][3]=104;
        arrays4D[2][2][2][4]=105;
        arrays4D[2][2][2][5]=106;
        arrays4D[2][2][2][6]=107;
        arrays4D[2][2][2][7]=108;
        arrays4D[2][2][2][8]=109;
        arrays4D[2][2][2][9]=110;

        arrays4D[2][2][3][0]=111;
        arrays4D[2][2][3][1]=112;
        arrays4D[2][2][3][2]=113;
        arrays4D[2][2][3][3]=114;
        arrays4D[2][2][3][4]=115;
        arrays4D[2][2][3][5]=116;
        arrays4D[2][2][3][6]=117;
        arrays4D[2][2][3][7]=118;
        arrays4D[2][2][3][8]=119;
        arrays4D[2][2][3][9]=120;



        // 3 big boxes  - In each of every box you have 3 main boxes - in each of every box you have 4 big boxes and in every one of them you have 10 little boxes (Variables).


        int arrays4D1[][][][]=new int[][][][]{

                        {
                                {  {1,2,3,4,5,6,7,8,9,10} , {11,12,13,14,15,16,17,18,19,20} , {21,22,23,24,25,26,27,28,29,30} ,{31,32,33,34,35,36,37,38,39,40}  }

                                ,{ {41,42,43,44,45,46,47,48,49,50} ,{51,52,43,54,55,56,57,58,59,60},{61,62,63,64,65,66,67,68,69,70},{71,72,73,74,75,76,77,78,79,80}  },

                                {   {81,82,83,84,85,86,87,88,89,90},{91,92,93,94,95,96,97,98,99,100},{101,102,103,104,105,106,107,108,109,110},{111,112,113,114,115,116,117,118,119,120}  }
                        },


                        {

                                {  {1,2,3,4,5,6,7,8,9,10} , {11,12,13,14,15,16,17,18,19,20} , {21,22,23,24,25,26,27,28,29,30} ,{31,32,33,34,35,36,37,38,39,40}  }

                                ,{ {41,42,43,44,45,46,47,48,49,50} ,{51,52,43,54,55,56,57,58,59,60},{61,62,63,64,65,66,67,68,69,70},{71,72,73,74,75,76,77,78,79,80}  },

                                {   {81,82,83,84,85,86,87,88,89,90},{91,92,93,94,95,96,97,98,99,100},{101,102,103,104,105,106,107,108,109,110},{111,112,113,114,115,116,117,118,119,120}  }

                        },


                        {


                                {  {1,2,3,4,5,6,7,8,9,10} , {11,12,13,14,15,16,17,18,19,20} , {21,22,23,24,25,26,27,28,29,30} ,{31,32,33,34,35,36,37,38,39,40}  }

                                ,{ {41,42,43,44,45,46,47,48,49,50} ,{51,52,43,54,55,56,57,58,59,60},{61,62,63,64,65,66,67,68,69,70},{71,72,73,74,75,76,77,78,79,80}  },

                                {   {81,82,83,84,85,86,87,88,89,90},{91,92,93,94,95,96,97,98,99,100},{101,102,103,104,105,106,107,108,109,110},{111,112,113,114,115,116,117,118,119,120}  }

                        },



                };


        System.out.println("****************************");
        System.out.println();
        System.out.println();
        System.out.println(Arrays.deepToString(arrays4D));
        System.out.println(Arrays.deepToString(arrays4D1));
        System.out.println();
        System.out.println();
        System.out.println("****************************");

    }


    }
