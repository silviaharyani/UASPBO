package koneksi;
import java.sql.DriverManager;
public class KoneksiDatabase {
    
    private static java.sql.Connection aam;
    
    public static java.sql.Connection BukaKoneksi(){
       if (aam == null) {
           try {
               String url = "jdbc:mysql://localhost:3306/db_mahasiswa";
               String user = "root";
               String password = "";
               DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
               aam = DriverManager.getConnection(url, user, password);
               System.out.println("Berhasil Terhubung");
           } catch (Exception e) {
               System.out.println("Error");
           }
       }
       return aam;
        
        
    }
    public static void main(String args[]){
        BukaKoneksi();
    }

}
