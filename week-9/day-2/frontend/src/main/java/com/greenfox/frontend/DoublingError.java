package com.greenfox.frontend;

public class DoublingError {
    String error;

    public DoublingError() {
    }
    public String getCustomErrorMessages(String field) {
        if (field.equals("name")) {
            this.error = "Please provide a name!";
        } else if (field.equals("number")) {
            this.error = "Please provide an input!";
        } else if (field.equals("title")) {
            this.error = "Please provide a name!";
        } return null;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


}
