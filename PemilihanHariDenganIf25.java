import java.util.Scanner;

public class PemilihanHariDenganIf25 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int angka;
      System.out.print("Masukkan angka (1-7): ");
      angka = input.nextInt();
    if (angka >= 1 && angka < 6){
      System.out.println("Weekday");
      } else if (angka > 5 && angka < 8) {
        System.out.println("Weekend");
      } else {
        System.out.println("Invalid number");
      }
     input.close();
    }
}
    

