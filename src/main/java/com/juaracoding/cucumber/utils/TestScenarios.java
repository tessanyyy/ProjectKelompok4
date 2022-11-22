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
    T14("TCC.SILOAM.105 Klik button reset textbox search"),
    T15("TCC.SILOAM.109 show entries 10"),
    T16("TCC.SILOAM.110 show entries 25"),
    T17("TCC.SILOAM.111 show entries 50"),
    T18("TCC.SILOAM.112 show entries 100"),
    T19("TCC.SILOAM show entries 10"),
    T20("TCC.SILOAM.114 Menampilkan auto number sesuai dengan data  yang di upload"),
    T21("TCC.SILOAM.115 Menampilkan nama"),
    T22("TCC.SILOAM.116 Menampilkan nomor BPJS"),
    T23("TCC.SILOAM.117 Menampilkan kota ktp"),
    T24("TCC.SILOAM.118 Menampilkan faskes asal"),
    T25("TCC.SILOAM.119 Menampilkan faskes tujuan"),
    T26("TCC.SILOAM.120 Menampilkan button aksi view data"),
    T27("TCC.SILOAM.121 Menampilkan halaman selanjutnya"),
    T28("TCC.SILOAM.122 Menampilkan halaman sebelumnya"),
    T29("TCC.SILOAM.063 Browser menampilkan halaman home siloam"),
    T30("Input form data"),
    T31("Upload data valid"),
    T32("TCC.SILOAM.064 Menampilkan nama karyawan"),
    T33("TCC.SILOAM.065 Menampilkan nama nomor bpjs"),
    T34("TCC.SILOAM.066 Menampilkan hasil inputan nomor KTP"),
    T35("TCC.SILOAM.067 Menampilkan hasil inputan alamat"),
    T36("TCC.SILOAM.068 Menampilkan inputan Kota KTP"),
    T37("TCC.SILOAM.069 Menampilkan Inputan Faskes Awal"),
    T38("TCC.SILOAM.070 Menampilkan Inputan Faskes Tujuan"),
    T39("TCC.SILOAM.071 User klik button edit"),
    T40("TCC.SILOAM.073 klik button simpan"),
    T41("TCC.SILOAM.074 Menampilkan foto before"),
    T42("TCC.SILOAM.075 Menampilkan foto after"),
    T43("TCC.SILOAM.076 Menampilkan auto number"),
    T44("TCC.SILOAM.077 Menampilkan tipe dokumen"),
    T45("TCC.SILOAM.078 Menampilkan file upload");



    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
