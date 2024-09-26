import java.util.Scanner;

public class SIAKAD25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim, nilaiHuruf = "", kualifikasi = "";
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = input.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = input.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai Ujian: ");
        nilaiUjian = input.nextDouble();
        nilaiAkhir = (nilaiKuis + nilaiTugas+ nilaiUjian) / 3;
        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        }else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        }else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        }else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        }else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        }else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        }else if (nilaiAkhir >= 0) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
        input.close();
    }
}
