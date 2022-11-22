Feature: Upload data

  Scenario: Upload data valid
    When Klik button Foto Faskes Awal untuk upload foto dokumen
    And Klik button choose File
    And Mengambil data foto
    And Klik simpan untuk menyimpan foto
    And Keluar dari pop up upload foto faskes awal
    And klik button foto faskes tujuan untuk upload data
    And klik button choose file faskes tujuan
    And mengambil data foto faskes tujuan
    And klik simpan untuk menympan foto faskes tujuan
    And keluar dari pop up upload foto faskes tujuan
    And klik button foto ttd digital tujuan untuk upload data
    And klik button choose file ttd digital
    And mengambil data foto ttd digital
    And klik simpan untuk menympan foto ttd digital
    And keluar dari pop up upload foto ttd digital
    Then klik button selanjutnya


  Scenario: TCC.SILOAM.064 Menampilkan nama karyawan
    When TCC.SILOAM.064 Browser menampilkan form document Nama Karyawan

  Scenario: TCC.SILOAM.065 Menampilkan nama nomor bpjs
    When TCC.SILOAM.065 Browser menampilkan form document Nomor BPJS

  Scenario: TCC.SILOAM.066 Menampilkan hasil inputan nomor KTP
    When TCC.SILOAM.066 Menampilkan nomor KTP

  Scenario: TCC.SILOAM.067 Menampilkan hasil inputan alamat
    When TCC.SILOAM.067 Menampilkan alamat

  Scenario: TCC.SILOAM.068 Menampilkan inputan Kota KTP
    When TCC.SILOAM.068 Menampilkan Kota KTP

  Scenario: TCC.SILOAM.069 Menampilkan Inputan Faskes Awal
    When TCC.SILOAM.069 Menampikan Faskes Awal

  Scenario: TCC.SILOAM.070 Menampilkan Inputan Faskes Tujuan
    When TCC.SILOAM.070 Menampilkan faskes tujuan

  Scenario: TCC.SILOAM.071 klik button edit
    When TCC.SILOAM.071 User klik button edit

  Scenario: TCC.SILOAM.073 klik button simpan
    When TCC.SILOAM.073 user klik button simpan

  Scenario: TCC.SILOAM.074 Menampilkan foto before
    When TCC.SILOAM.073 Menampilkan dokumen faskes awal yang sudah di upload

  Scenario: TCC.SILOAM.075 Menampilkan foto after
    When TCC.SILOAM.075 Menampilkan dokumen faskes tujuan yang sudah di upload

  Scenario: TCC.SILOAM.076 Menampilkan auto number
    When TCC.SILOAM.076 Menampilkan auto number sesuai dengan data yang sudah di upload

  Scenario: TCC.SILOAM.077 Menampilkan tipe dokumen
    When TCC.SILOAM.077 menampilkan tipe dokumen yang sudah di upload

  Scenario: TCC.SILOAM.078 Menampilkan file upload
    When TCC.SILOAM.078 menampilkan file yang sudah di upload


































