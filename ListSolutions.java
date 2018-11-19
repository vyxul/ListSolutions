import java.util.Arrays;

public class ListSolutions {
    public static void main(String[] args) {
        final int finalSum = 12;
        int array[] = new int[9];
        int posSolutions = 0;
        int i0, i1, i2, i3, i4, i5, i6, i7, i8;
        System.out.println("This program tests see all the positive integer solutions for the equation: ");
        System.out.println("X1 + X2 + X3 + X4 + X5 + X6 + X7 + X8 + X9 = 12");
        System.out.println();
        
        for (i0 = 1; i0 <= finalSum - 8; i0++, array[0] = i0) {
            //array[0] = i0;

            for (i1 = 1; i1 <= finalSum - 8; i1++, array[1] = i1) {
                //array[1] = i1;

                for (i2 = 1; i2 <= finalSum - 8; i2++, array[2] = i2) {
                    //array[2] = i2;

                    for (i3 = 1; i3 <= finalSum - 8; i3++, array[3] = i3) {
                        //array[3] = i3;

                        for (i4 = 1; i4 <= finalSum - 8; i4++, array[4] = i4) {
                            //array[4] = i4;

                            for (i5 = 1; i5 <= finalSum - 8; i5++, array[5] = i5) {
                                //array[5] = i5;

                                for (i6 = 1; i6 <= finalSum - 8; i6++, array[6] = i6) {
                                    //array[6] = i6;

                                    for (i7 = 1; i7 <= finalSum - 8; i7++, array[7] = i7) {
                                        //array[7] = i7;

                                        for (i8 = 1; i8 <= finalSum - 8; i8++, array[8] = i8) {
                                            //array[8] = i8;


                                            if (arraySum(array) == finalSum) {
                                                posSolutions++;
                                                System.out.printf("%d + %d + %d + %d + %d + %d + %d + %d + %d = %d\n", 
                                                        array[0], array[1], array[2], array[3], array[4], array[5],
                                                        array[6], array[7], array[8], arraySum(array));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("There are a total of %d possible solutions.\n", posSolutions);
    }

    static int arraySum(int array[]) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
