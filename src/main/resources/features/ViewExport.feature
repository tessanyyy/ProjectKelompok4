Feature: ViewExport

  Scenario: TCC.SILOAM.007 Input start date
    When TCC.SILOAM.007 Klik start date
    And TCC.SILOAM.007 Input data tanggal sesuai yang di tampilkan
    Then TCC.SILOAM.007 Berhasil menampilkan input start date

  Scenario: TCC.SILOAM.008 Input end date
    When TCC.SILOAM.008 Klik end date
    And TCC.SILOAM.008 Input data tanggal sesuai yang di tampilkan
    Then TCC.SILOAM.008 Berhasil menampilkan input end date

  Scenario: TCC.SILOAM.009 Mencari data dengan inputan yang sesuai
    When TCC.SILOAM.009 Klik tombol filter
    Then TCC.SILOAM.009 Berhasil menampilkan data

  Scenario: TCC.SILOAM.010 Mencari data tanpa inputan
    When TCC.SILOAM 010 Klik tombol filter tanpa mengisi inputan
    Then TCC.SILOAM.010 Data tidak tampil dan muncul notifikasi

  Scenario: TCC.SILOAM.011 Mencari data dengan 1 inputan start date
    When TCC.SILOAM.011 Input start date
    And TCC.SILOAM.011 Klik tombol filter
    Then TCC.SILOAM.011 Data tidak tampil dan muncul notifikasi

  Scenario: TCC.SILOAM.012 Mencari data dengan 1 inputan end date
    When TCC.SILOAM.012 Input end date
    And TCC.SILOAM.012 Klik tombol filter
    Then TCC.SILOAM.012 Data tidak tampil dan muncul notifikasi

  Scenario: TCC.SILOAM.013 Mencari data dengan inputan back date
    When TCC.SILOAM.013 Input start date dengan inputan tidak sesuai
    And TCC.SILOAM.013 Input end date dengan inputan tidak sesuai
    And TCC.SILOAM.013 Klik tombol filter
    Then TCC.SILOAM.013 Data tidak tampil