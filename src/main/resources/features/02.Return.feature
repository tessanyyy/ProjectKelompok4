Feature: Return

  Scenario: TCC.SILOAM.095 Membuka halaman return
    When TCC.SILOAM.095 Browser menampilkan halaman home siloam
    And TCC.SILOAM.095 Klik menu new
    Then TCC.SILOAM.095 Menampilkan halaman return

  Scenario: TCC.SILOAM.096 Input complete status
    When TCC.SILOAM.096 klik select status
    And TCC.SILOAM.096 input complete status
    Then TCC.SILOAM.096 berhasil input complete status

  Scenario: TCC.SILOAM.097 Input pending status
    When TCC.SILOAM.097 klik select status again
    And TCC.SILOAM.097 input pending status
    Then TCC.SILOAM.097 berhasil input pending status


  Scenario: TCC.SILOAM.098 Input start date
    When TCC.SILOAM.098 klik start date
    And TCC.SILOAM.098 input tanggal sesuai data yang akan ditampilkan
    Then TCC.SILOAM.098 berhasil menampilkan input start date

  Scenario: TCC.SILOAM.099 Input end date
    When TCC.SILOAM.099 klik end date
    And TCC.SILOAM.099 input tanggal end date sesuai data yang akan ditampilkan
    Then TCC.SILOAM.099 berhasil menampilkan input end date

  Scenario: TCC.SILOAM.100 klik button filter invalid hanya input start date
    When TCC.SILOAM.100 input tanggal start date
    And TCC.SILOAM.100 tidak mengisi tanggal end date
    Then TCC.SILOAM.100 klik button filter invalid

  Scenario: TCC.SILOAM.101 klik button filter invalid hanya input end date
    When TCC.SILOAM.101 input tanggal end date
    And TCC.SILOAM.101 tidak mengisi tanggal start date
    Then TCC.SILOAM.101 klik button filter invalid tidak input end date

  Scenario: TCC.SILOAM.102 klik button filter data complete valid
    When TCC.SILOAM.102 select status complete
    And TCC.SILOAM.102 klik start date valid
    And TCC.SILOAM.102 input tanggal start date valid
    And TCC.SILOAM.102 klik end date valid
    And TCC.SILOAM.102 input tanggal end date valid
    Then TCC.SILOAM.102 klik button filter valid

  Scenario: TCC.SILOAM.103 klik button filter data pending valid
    When TCC.SILOAM.103 select status pending
    And TCC.SILOAM.103 klik start date valid again
    And TCC.SILOAM.103 input tanggal start date valid pending
    And TCC.SILOAM.103 klik end date valid pending
    And TCC.SILOAM.103 input tanggal end date valid pending
    Then TCC.SILOAM.103 klik button filter valid pending

  Scenario: TCC.SILOAM.104 klik button riset
    When TCC.SILOAM.104 user klik button riset
    Then TCC.SILOAM.104 berhasil hapus data

  Scenario: TCC.SILOAM.106 Menginput data sesuai dengan kebutuhan
    When TCC.SILOAM.106 User klik Search Text Box
    Then TCC.SILOAM.106 User input data

  Scenario: TCC.SILOAM.107 Klik button search
    When TCC.SILOAM.107 klik button search
    Then TCC.SILOAM.107 menampikan data sesuai dengan inputan

  Scenario: TCC.SILOAM.105 Klik button reset textbox serach
    When TCC.SILOAM.105 klik button reset textbox search
    Then TCC.SILOAM.105 berhasil menghapus inputan


  Scenario: TCC.SILOAM.109 show entries 10
    When TCC.SILOAM.109 klik select pages
    Then TCC.SILOAM.109 select 10

  Scenario: TCC.SILOAM.110 show entries 25
    When TCC.SILOAM.110 klik select pages
    Then TCC.SILOAM.110 select 25

  Scenario: TCC.SILOAM.111 show entries 50
    When TCC.SILOAM.111 klik select pages
    Then TCC.SILOAM.111 select 50

  Scenario: TCC.SILOAM.112 show entries 100
    When TCC.SILOAM.112 klik select pages
    Then TCC.SILOAM.112 select 100

  Scenario: TCC.SILOAM show entries 10
    When TCC.SILOAM klik select pages
    Then TCC.SILOAM select 10


  Scenario: TCC.SILOAM.114 Menampilkan auto number sesuai dengan data  yang di upload
    When TCC.SILOAM.114 Menampilkan auto number di Data Tabel
    Then TCC.SILOAM.114 Validasi auto number

  Scenario: TCC.SILOAM.115 Menampilkan nama
    When TCC.SILOAM.115 Menampilkan nama di Data Tabel
    Then TCC.SILOAM.115 Validasi nama

  Scenario: TCC.SILOAM.116 Menampilkan nomor BPJS
    When TCC.SILOAM.116 Menampilkan nomor BPJS di Data Tabel
    Then TCC.SILOAM.116 Validasi nomor BPJS

  Scenario: TCC.SILOAM.117 Menampilkan kota ktp
    When TCC.SILOAM.117 Menampilkan kota ktp di Data Tabel
    Then TCC.SILOAM.117 Validasi kota ktp

  Scenario: TCC.SILOAM.118 Menampilkan faskes asal
    When TCC.SILOAM.118 Menampilkan faskes asal di Data Tabel
    Then TCC.SILOAM.118 Validasi faskes asal

  Scenario: TCC.SILOAM.119 Menampilkan faskes tujuan
    When TCC.SILOAM.119 Menampilkan faskes tujuan di Data Tabel
    Then TCC.SILOAM.119 Validasi faskes tujuan

  Scenario: TCC.SILOAM.120 Menampilkan button aksi view data
    When TCC.SILOAM.120 menampilkan button aksi view data
    Then TCC.SILOAM.120 validasi button aksi view data

  Scenario: TCC.SILOAM.121 Menampilkan halaman selanjutnya
    When TCC.SILOAM.121 scroll down page
    And TCC.SILOAM.121 klik button nex
    Then TCC.SILOAM.121 menampilkan halaman selanjutnya


  Scenario: TCC.SILOAM.122 Menampilkan halaman sebelumnya
    When TCC.SILOAM.122 scroll down page
    Then TCC.SILOAM.122 klik button previous




