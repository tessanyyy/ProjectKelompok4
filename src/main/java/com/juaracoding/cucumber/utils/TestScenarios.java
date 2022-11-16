package com.juaracoding.cucumber.utils;

public enum TestScenarios {

    T1("User login valid"),
    T2("TCC.SILOAM.095 Membuka halaman return"),
    T3("TCC.SILOAM.096 Input complete status"),
    T4("TCC.SILOAM.097 Input pending status"),
    T5("TCC.SILOAM.098 Input start date"),
    T6("TCC.SILOAM.099 Input end date"),
    T7("TCC.SILOAM.100 klik button filter invalid hanya input start date"),
    T8("TCC.SILOAM.101 klik button filter invalid hanya input end date"),
    T9("TCC.SILOAM.102 klik button filter data complete valid"),
    T10("TCC.SILOAM.103 klik button filter data pending valid"),
    T11("TCC.SILOAM.104 klik button riset"),
    T12("TCC.SILOAM.106 Menginput data sesuai dengan kebutuhan"),
    T13("TCC.SILOAM.107 Klik button search"),
    T14(" TCC.SILOAM.105 Klik button search"),
    T15("TCC.SILOAM.109 show entries 10"),
    T16("TCC.SILOAM.110 show entries 20"),
    T17("TCC.SILOAM.111 show entries 50"),
    T18("TCC.SILOAM.112 show entries 100"),
    T19("TCC.SILOAM.114 Validasi auto number"),
    T20("TCC.SILOAM.115 Menampilkan nama"),
    T21("TCC.SILOAM.116 Menampilkan nomor BPJS"),
    T22("TCC.SILOAM.117 Menampilkan kota ktp"),
    T23("TCC.SILOAM.118 Menampilkan faskes asal"),
    T24("TCC.SILOAM.119 Menampilkan faskes tujuan");


    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
