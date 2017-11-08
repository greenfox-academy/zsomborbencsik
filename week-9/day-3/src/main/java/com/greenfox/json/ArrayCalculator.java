package com.greenfox.json;

public class ArrayCalculator {
    int[] numbers;
    String what;

    public ArrayCalculator(int[] numbers) {
        this.numbers = numbers;
    }

    public ArrayCalculator() {
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }
}
