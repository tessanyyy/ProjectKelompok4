Feature: Return

  Scenario: Membuka halaman return
    When Browser menampilkan halaman home siloam
    And Klik menu new
    Then Menampilkan halaman return

  Scenario: Input start date
    When klik start date
    And input tanggal sesuai data yang akan ditampilkan
    Then berhasil menampilkan input start date

