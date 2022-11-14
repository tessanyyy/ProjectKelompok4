Feature: Login Admin

  Scenario: TCC.SILOAM.001 Invalid URL
    When TCC.SILOAM.001 Mengakses invalid URL
    Then TCC.SILOAM.001 Web 404 not found

  Scenario: TCC.SILOAM.002 Valid URL
    When TCC.SILOAM.002 Mengakses valid URL
    Then TCC.SILOAM.002 Berhasil mengakses web siloam

  Scenario: TCC.SILOAM.003 Input invalid username password
    When TCC.SILOAM.003 Mengisi username password tidak sesuai
    And TCC.SILOAM.003 Klik tombol login invalid
    Then TCC.SILOAM.003 Login invalid


  Scenario: TCC.SILOAM.004 Input valid username password
    When TCC.SILOAM.004 Mengisi username password sesuai yang sudah di daftarkan
    And TCC.SILOAM.004 Klik button login valid
    Then TCC.SILOAM.004 Berhasil login