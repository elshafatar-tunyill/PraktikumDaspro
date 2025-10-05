package jobsheet5;
import java.util.Scanner;
public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Status di akademisi sebagai? (Dosen/Mahasiswa): ");
        String civitasAkademisi = sc.nextLine().trim();

        
        if (civitasAkademisi.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        }else if (civitasAkademisi.equalsIgnoreCase("Mahasiswa")) {
            System.out.println("Masukkan jumlah SKS");
             int SKS = sc.nextInt();
            if (SKS >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }
           
           
        sc.close();
    }
}