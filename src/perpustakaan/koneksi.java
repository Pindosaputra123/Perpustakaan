package perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pindo
 */
public class koneksi {
    private static Connection mysqlConfig;

    // Method untuk konfigurasi koneksi ke database MySQL
    public static Connection configDB() throws SQLException {
        try {
            // URL koneksi ke database
            String url = "jdbc:mysql://localhost/perpustakaan";
            String user = "root";
            String pass = "";

            // Gunakan DriverManager tanpa perlu registrasi manual
            mysqlConfig = DriverManager.getConnection(url, user, pass);

            System.out.println("Koneksi Berhasil!");
        } catch (SQLException e) {
            // Tangani error jika koneksi gagal
            System.err.println("Koneksi Gagal: " + e.getMessage());
        }
        return mysqlConfig;
    }
}
