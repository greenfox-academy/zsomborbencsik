package com.greenfox.json.responses;

public class ArrayResponse {
    int result;

    public ArrayResponse(String what, int[] numbers) {
        if (what.equals("sum")) {
            this.result = sumArray(numbers);
        } else if (what.equals("multiply")) {
            this.result = multiplyArray(numbers);
        }
    }
    public int sumArray(int[] numbers) {
        int arraySum = 0;
        for (int i = 0; i < numbers.length; i++) {
            arraySum += numbers[i];
        }
        return arraySum;
    }
    public int multiplyArray(int[] numbers) {
        int arrayMultiplication = 1;
        for (int i = 0; i <= numbers.length -1; i++) {
            arrayMultiplication *= numbers[i];
        }
        return arrayMultiplication;
    }
    public int[] doubleArrayElements(int[] numbers) {
        int[] doubledArrayElements = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            doubledArrayElements[i] = numbers[i] * 2;
        }
        return doubledArrayElements;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
