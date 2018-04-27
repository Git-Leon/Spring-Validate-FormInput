package com.gitleon.gsvalidateforminput;

/**
 * @author leon on 4/27/18.
 */
public enum WebTemplate {
    FORM("form.html"),
    RESULTS("results.html");
    private final String fullFilePath;

    WebTemplate(String fileName) {
        final String currentProjectPath =  System.getProperty("user.dir");
        this.fullFilePath = String.format("%s/main/resources/", currentProjectPath) + fileName;
    }

    public String getName() {
        return name().toLowerCase();
    }

    public String getFullFilePath() {
        return fullFilePath;
    }
}
