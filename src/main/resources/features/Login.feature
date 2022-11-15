Feature: Login Admin

  Scenario: TCC.SILOAM.001 Invalid URL
    When TCC.SILOAM.001 Mengakses invalid URL
    Then TCC.SILOAM.001 Web not found

  Scenario: TCC.SILOAM.002 Valid URL
    When TCC.SILOAM.002 Mengakses valid URL
    Then TCC.SILOAM.002 Berhasil mengakses web siloam

  Scenario: TCC.SILOAM.003 Input invalid username password
    When TCC.SILOAM.003 Mengisi username password tidak sesuai
    And TCC.SILOAM.003 Klik tombol login invalid
    Then TCC.SILOAM.003 Login invalid

  Scenario: TCC.SILOAM.004 Username password tidak di input
    When TCC.SILOAM.004 Tidak mengisi username password
    And TCC.SILOAM.004 Klik button login input kosong
    Then TCC.SILOAM.004 Login gagal

  Scenario: TCC.SILOAM.005 Input valid username password sales
    When TCC.SILOAM.005 Mengisi username password sales sesuai yang sudah di daftarkan
    And TCC.SILOAM.005 Klik button login valid sales
    Then TCC.SILOAM.005 Berhasil login

  Scenario: TCC.SILOAM.006 Logout
    When TCC.SILOAM.006 Klik profile
    And TCC.SILOAM.006 Klik button logout
    Then TCC.SILOAM.006 Berhasil logout

  Scenario: TCC.SILOAM.007 Input valid username password admin
    When TCC.SILOAM.007 Mengisi username password admin sesuai yang sudah di daftarkan
    And TCC.SILOAM.007 Klik button login valid admin
    Then TCC.SILOAM.007 Berhasil login admin