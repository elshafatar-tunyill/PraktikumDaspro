import java.util.Scanner;

public class belajarkasmetod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiakhir1,nilaiakhir2,nilairatarataakhir;
        String pesan = "", pesan2 = "", pesan3 = "", pesan4 = "", statussemester = "";

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("NAMA : ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        long nim = sc.nextLong();
        System.out.println("");

        System.out.println("--- MATA KULIAH 1 : ALGORITMA DAN PEMOGRAMAN ---");
        System.out.print("NILAI UTS : ");
        int uts = sc.nextInt();
        System.out.print("NILAI UAS : ");
        int uas = sc.nextInt();
        System.out.print("NILAI TUGAS : ");
        int tugas = sc.nextInt();
        System.out.println("");

        System.out.println("--- MATA KULIAH 2 : STRUKTUR DATA ---");
        System.out.print("NILAI UTS : ");
        int uts2 = sc.nextInt();
        System.out.print("NILAI UAS : ");
        int uas2 = sc.nextInt();
        System.out.print("NILAI TUGAS : ");
        int tugas2 = sc.nextInt();
        System.out.println("");

        //menghitung nilai akhir dan rata rata
        nilaiakhir1 = (uts*0.3) + (uas*0.4) + (tugas*0.3) ;
        nilaiakhir2 = (uts2*0.3) + (uas2*0.4) + (tugas2*0.3) ;
        nilairatarataakhir = (nilaiakhir1 + nilaiakhir2)/2; 


        if (80 < nilaiakhir1 && nilaiakhir1 <= 100) {
            pesan = "A";
        }else if (73 < nilaiakhir1 && nilaiakhir1 <= 80) {
            pesan = "B+";
        }else if (65 < nilaiakhir1 && nilaiakhir1 <= 73) {
            pesan = "B";
        }else if (60 < nilaiakhir1 && nilaiakhir1 <= 65) {
            pesan = "C+";
        }else if (50 < nilaiakhir1 && nilaiakhir1 <= 60) {
            pesan = "C";
        }else if (39 < nilaiakhir1 && nilaiakhir1 <= 50) {
            pesan = "D";
        }else if (nilaiakhir1 <= 39) {
            pesan = "E";
        }


        if (80 < nilaiakhir2 && nilaiakhir2 <= 100) {
            pesan2 = "A";
        }else if (73 < nilaiakhir2 && nilaiakhir2 <= 80) {
            pesan2 = "B+";
        }else if (65 < nilaiakhir2 && nilaiakhir2 <= 73) {
            pesan2 = "B";
        }else if (60 < nilaiakhir2 && nilaiakhir2 <= 65) {
            pesan2 = "C+";
        }else if (50 < nilaiakhir2 && nilaiakhir2 <= 60) {
            pesan2 = "C";
        }else if (39 < nilaiakhir2 && nilaiakhir2 <= 50) {
            pesan2 = "D";
        }else if (nilaiakhir2 <= 39) {
            pesan2 = "E";
        }

        //menghitung status algoritma pemograman
        if (nilaiakhir1 >= 60) {
            pesan3 = "LULUS";
        }else if (nilaiakhir1 < 60) {
            pesan3 = "TIDAK LULUS";
        }

        //menghitung status struktur data
        if (nilaiakhir2 >= 60) {
            pesan4 = "LULUS";
        }else if (nilaiakhir2 < 60) {
            pesan4 = "TIDAK LULUS";
        }

        //menghitung status kelulusan
        if (nilaiakhir1 >= 60 && nilaiakhir2 >= 60) {
            if (nilairatarataakhir >= 70) {
                statussemester = "LULUS";
            }else if (nilairatarataakhir < 70) {
                statussemester = "TIDAK LULUS (RATA-RATA < 70 )";
            }
        }else {
            statussemester = "TIDAK LULUS";
        }


        System.out.println("================= HASIL PENILAIAN AKADEMIK =================");
        System.out.println("NAMA : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("");
        System.out.println("MATA KULIAH               UTS     UAS       TUGAS     NILAI AKHIR       NILAI HURUF          STATUS");
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("ALGORITMA PEMOGRAMAN      "   + uts +   "      " + uas +    "          " + tugas + "          " + nilaiakhir1 + "                " + pesan + "               " + pesan3);
        System.out.println("STRUKTUR DATA             "   + uts +   "      " + uas2 +   "          " + tugas2 + "          " + nilaiakhir2 + "                " + pesan2 + "               " + pesan4);
        System.out.println("");
        System.out.println("RATA RATA NILAI AKHIR : " + nilairatarataakhir);
        System.out.println("STATUS SEMESTER       : " + statussemester);

        sc.close();
    }
}
