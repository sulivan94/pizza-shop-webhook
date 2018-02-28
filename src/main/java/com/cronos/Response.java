package com.cronos;

public class Response {

    private String speech;
    private String displayText;
    private static final String source = "Pizza-Shop-Webhook";

    public Response(String speech, String displayText) {
        this.speech = speech;
        this.displayText = displayText;
    }

    public String getSpeech() {
        return speech;
    }

    public String getDisplayText() {
        return displayText;
    }

    public String getSource() {
        return source;
    }
}