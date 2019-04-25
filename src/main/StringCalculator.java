package main;


public class StringCalculator {

    public static int add(String numbers) {
        int returnValue = 0;
        if (numbers.isEmpty()) return returnValue;

        String[] numbersArray = numbers.split(",");
        /*if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {*/
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) { // After refactoring
                returnValue += Integer.parseInt(number);
            }
        }
        //}
        return returnValue;
    }

    public static void main(String[] args) {
        System.out.println("The result is::" + add("1,2"));

    }
}
