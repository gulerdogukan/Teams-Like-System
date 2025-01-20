import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class DatabaseEncryption {

    public static void main(String[] args) throws Exception {
        
        String url = System.getProperty("jdbc.url");
        String user = System.getProperty("jdbc.user");
        String password = System.getProperty("jdbc.password");

        // JDBC lib add 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // connected database
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Veritabanına başarıyla bağlandım.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // closed connection
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

         
         byte[] plainText = "SELECT * FROM users".getBytes(); 
         KeyGenerator keyGen = KeyGenerator.getInstance("DES");
         SecretKey key = keyGen.generateKey();
         Cipher cipher = Cipher.getInstance("DES");

        
         cipher.init(Cipher.ENCRYPT_MODE, key);
         byte[] cipherText = cipher.doFinal(plainText);
         System.out.println("Şifreli sorgu: " + new String(cipherText));
         cipher.init(Cipher.DECRYPT_MODE, key);
         byte[] decryptedText = cipher.doFinal(cipherText);

    }
}