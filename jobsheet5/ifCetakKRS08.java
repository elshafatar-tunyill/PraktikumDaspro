package jobsheet5;
import java.util.Scanner;
public class ifCetakKRS08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Pakah UKT Sudah Lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();


        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silahkan Cetak KRS dan minta tanda tangan DPA");
        }else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }

        String pesan = (uktLunas) ? "Pembayaran UKT Terverifikasi,Silahkan Cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(pesan);
        
        sc.close();

    }   
}