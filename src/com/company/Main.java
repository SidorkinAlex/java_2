package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result;
        String[][] arrayString = {
                {"1","2","3","4"},
                {"1","2","3","4", "5"},
                {"1","2","3","4"},
                {"1","2","3","4"},
        };
        try {
            result =Main.checkArray(arrayString);
            System.out.println(result);
        } catch (MyArraySizeException e){
            e.printStackTrace();
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }
        String[][] arrayString1 = {
                        {"1","2","3","4"},
                        {"1","2","3","4"},
                        {"1","2","dfg","4"},
                        {"1","2","3","4"},
                };
        try {
            result =Main.checkArray(arrayString1);
            System.out.println(result);
        } catch (MyArraySizeException e){
            e.printStackTrace();
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }
        String[][] arrayString2 = {
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
        };
        try {
            result =Main.checkArray(arrayString2);
            System.out.println(result);
        } catch (MyArraySizeException e){
            e.printStackTrace();
        } catch (MyArrayDataException e){
            e.printStackTrace();
        }

    }

    public static int checkArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int amount = 0;

        if (array.length == 4) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].length != 4) {
                    throw new MyArraySizeException("Array is not 4X4 array[" + i + "].length=" + array[i].length);
                }
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        amount += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("error parse array i=" + i + "  j=" + j);
                    }
                }
            }
        } else {
            throw new MyArraySizeException("Array is not 4X4 array.length=" + array.length);
        }
        return amount;
    }
}