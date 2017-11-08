package com.greenfox.frontend;

import javax.xml.bind.annotation.XmlRootElement;


public class Errormessage {
    String error;

    public Errormessage(String error) {
        this.error = error;
    }

    public Errormessage() {
    }

    public String getErrorMessage() {
        return error;
    }

    public void setErrorMessage(String error) {
        this.error = error;
    }
}
