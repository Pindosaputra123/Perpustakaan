
# Sistem Perpustakaan

## Deskripsi
Sistem Perpustakaan adalah aplikasi berbasis Java GUI yang dirancang untuk memudahkan pengelolaan perpustakaan. Dengan menggunakan Java Swing sebagai antarmuka grafis dan MySQL sebagai basis data, aplikasi ini memungkinkan pengguna untuk melakukan berbagai operasi terkait manajemen buku, anggota, dan transaksi peminjaman/pengembalian.

## Fitur
1. **Manajemen Buku**
   - Tambah, hapus, dan edit data buku.
   - Pencarian buku berdasarkan judul, pengarang, atau ISBN.

2. **Manajemen Anggota**
   - Tambah, hapus, dan edit data anggota perpustakaan.
   - Pencarian anggota berdasarkan nama atau ID.

3. **Peminjaman Buku**
   - Registrasi peminjaman buku oleh anggota.
   - Validasi jumlah buku yang dipinjam.

4. **Pengembalian Buku**
   - Pencatatan pengembalian buku dengan perhitungan denda otomatis jika terlambat.

5. **Laporan**
   - Generate laporan aktivitas perpustakaan (peminjaman/pengembalian).
   - Export laporan dalam format PDF atau Excel.

## Teknologi yang Digunakan
- **Bahasa Pemrograman:** Java
- **Framework GUI:** Java Swing
- **Database:** MySQL
- **Library Tambahan:**
  - JDBC untuk koneksi database.
  - iText untuk generate laporan PDF.

## Prasyarat
Sebelum menjalankan aplikasi, pastikan Anda telah menginstal:
1. **Java Development Kit (JDK)** - Minimal versi 8.
2. **MySQL Server** - Untuk menyimpan data.
3. **NetBeans/Eclipse IDE** (opsional) - Untuk pengembangan dan eksekusi.

## Instalasi dan Penggunaan
1. Clone repositori ini:
   ```bash
   git clone https://github.com/Pindosaputra123/Sistem-Perpustakaan.git
   ```
2. Impor file database `perpustakaan.sql` yang disediakan ke MySQL Server Anda.
3. Atur konfigurasi koneksi database pada file `DatabaseConnection.java`:
   ```java
   String url = "jdbc:mysql://localhost:3306/perpustakaan";
   String username = "root"; // ganti dengan username MySQL Anda
   String password = ""; // ganti dengan password MySQL Anda
   ```
4. Kompilasi dan jalankan aplikasi menggunakan IDE atau perintah terminal:
   ```bash
   javac Main.java
   java Main
   ```

## Struktur Proyek
```
Sistem-Perpustakaan/
├── src/
│   ├── Main.java
│   ├── DatabaseConnection.java
│   ├── models/
│   │   ├── Book.java
│   │   ├── Member.java
│   │   └── Transaction.java
│   ├── views/
│   │   ├── MainView.java
│   │   ├── BookView.java
│   │   └── MemberView.java
│   └── controllers/
│       ├── BookController.java
│       ├── MemberController.java
│       └── TransactionController.java
├── database/
│   └── perpustakaan.sql
└── README.md
```

## Kontribusi
Kontribusi terbuka untuk siapa saja! Silakan lakukan *fork* repositori ini, buat cabang, dan kirimkan *pull request*.  

## Lisensi
Proyek ini dilisensikan di bawah [MIT License](LICENSE). Silakan lihat file lisensi untuk informasi lebih lanjut.
