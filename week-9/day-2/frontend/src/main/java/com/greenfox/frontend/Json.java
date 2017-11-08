package com.greenfox.frontend;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonValue;

public class Json {
    long received;
    long result;

    public Json(long received) {
        this.received = received;
        this.result = received * 2;
    }

    public long getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public long getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
