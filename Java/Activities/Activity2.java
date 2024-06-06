package org.example;

public class Activity2 {
    public static void main(String[] args) {

        int[] arrNum = {10, 77, 10, 54, -11, 10};
        int findnum = 10;
        int sumvalue = 30;

        System.out.println("Result: " + result(arrNum, findnum, sumvalue));
    }
        public static boolean result(int[] numbers, int findnum, int sumvalue ) {
            int temp=0;
            for (int number : numbers) {
                //If value is 10
                if (number == findnum) {
                    //Add them
                    temp += findnum;
                    System.out.println("temp"+temp);
                }

                //Sum should not be more than 30
                if (temp > sumvalue) {
                    break;
                }
            }
            System.out.println("sumvalue:"+sumvalue);

            //Return true if condition satisfies
            return temp== sumvalue;
        }
    }

