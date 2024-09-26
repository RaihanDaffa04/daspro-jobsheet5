import java.util.Scanner;
public class Umur25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur;
        String Kategori = "";
        System.out.print("Masukkan umur: ");
        umur = input.nextInt();
        if (umur >= 0 && umur < 13) {
            Kategori = "Anak";
        } else if (umur > 12 && umur < 20) {
            Kategori = "Remaja";
        } else if (umur > 19 && umur <65) {
            Kategori = "Dewasa";
        } else if (umur > 64){
            Kategori = "Lansia";
        } else { Kategori = "Input tidak valid";
        }
        System.out.println("Kategori: " + Kategori);
        input.close();
    }
}
