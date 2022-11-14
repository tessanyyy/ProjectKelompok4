package com.juaracoding.cucumber.utils;

public enum TestScenarios {

    T1("TCC.SILOAM.001 Invalid URL"),
    T2("TCC.SILOAM.002 Valid URL"),
    T3("TCC.SILOAM.003 Input invalid username password"),
    T4("TCC.SILOAM.004 Input valid username password");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }
}
