package com.greenfox.json.responses;

public class AppendAResponse {
    String appended;

    public AppendAResponse(String appended) {
        this.appended = appended + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
