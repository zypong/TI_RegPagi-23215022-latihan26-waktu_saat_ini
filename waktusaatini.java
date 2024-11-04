/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *NAMA  : IMZY ZULIJAR SETIAWAN
 *NIM   : 23215022
 *PRODI : TEKNIK INFORMATIKA
 */
public class waktusaatini {
     public static void main(String[] args) {
        // Mendapatkan waktu saat ini
        Date currentTime = Calendar.getInstance().getTime();

        // Format waktu menjadi string
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        String formattedTime = formatter.format(currentTime);

        // Menampilkan waktu
        System.out.println("Hari ini adalah hari : " + formattedTime);
    }
}
