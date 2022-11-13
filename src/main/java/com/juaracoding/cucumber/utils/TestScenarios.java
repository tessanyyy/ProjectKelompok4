package com.juaracoding.cucumber.utils;

public enum TestScenarios {

    T1("User login valid"),
    T2(" Membuka halaman return"),
    T3("Input start date");


    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
