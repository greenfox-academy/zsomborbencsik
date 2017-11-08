package com.greenfox.json.responses;

public class DoUntilResponse {
    int result;

    public DoUntilResponse(int until, String what) {
        if (what.equals("sum")) {
            this.result = sum(until);
        } else if (what.equals("factor")) {
            this.result = factorial(until);
        }
    }

    public int sum(int until) {
        for (int i = 0; i <= until; i++) {
            this.result += i;
        }
        return result;
    }
    public int factorial(int until) {
        int n = until;
        if (n == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
