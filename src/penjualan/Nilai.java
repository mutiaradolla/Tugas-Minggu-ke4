
package penjualan;
import java.util.Scanner;

public class Nilai {
    private char nHuruf;
    private float  NilTugas, NilUas, NilUts;
    private String predikat, nama, nim;
    private final float Tugas = NilTugas * 20 / 100;
    private final float Uas = NilUas * 45 / 100;
    private final float Uts = NilUts * 35 / 100;
    private final float nilaiAkhir = Tugas + Uts + Uas;
    
    

    public char getNilHuruf() {
        return nHuruf;
    }

    public String getPredikat() {
        return predikat;
    }
    

    char getNilHuruf(float nl) {
        if (nl >= 85) {
            nHuruf = 'A';
        } else if (nl >= 70 && nl < 85) {
            nHuruf = 'B';
        } else if (nl >= 60 && nl < 70) {
            nHuruf = 'C';
        } else if (nl >= 40 && nl < 60) {
            nHuruf = 'D';
        } else {
            nHuruf = 'E';
        }

        return nHuruf;
    }

    String getPredikat(char huruf) {
        switch (huruf) {
            case 'A':
                predikat = "Apik";
                break;
            case 'B':
                predikat = "Baik";
                break;
            case 'C':
                predikat = "Cukup";
                break;
            case 'D':
                predikat = "Dablek";
                break;
            default:
                predikat = "Elek";
        }

        return predikat;
    }
    
    public void cetakNilai()
    {
        System.out.println();
        System.out.println("Nim           : "+nim);
        System.out.println("Nama          : "+nama);
        System.out.println("Nilai Tugas   : "+NilTugas+" 20% : "+Tugas);
        System.out.println("Nilai Uts     : "+NilUts+" 35% : "+Uts);
        System.out.println("Nilai Uas     : "+NilUas+" 45% : "+Uas);
        System.out.println("Nilai Akhir :"+nilaiAkhir);
        System.out.println("Nilai Huruf     : "+getNilHuruf(nilaiAkhir));
        System.out.println("Predikat        :"+getPredikat(nHuruf));
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean inputLagi = true;
        
        while (inputLagi){
            Nilai nilai = new Nilai();
            
            System.out.print("Masukkan Nim    :");
            String nim = input.next();
            
            System.out.print("Masukkan Nama   :");
            String nama = input.next();
            
            System.out.print("Nilai Tugas     :");
            float NilTugas = input.nextFloat();
            
            System.out.print("Nilai Uts       :");
            float NilUts = input.nextFloat();

            System.out.print("Nilai Uas       :");
            float NilUas = input.nextFloat();
            
            nilai.cetakNilai();
            
            System.out.print("Input data lagi [Y/T] ?");
            String jawaban = input.next();
            
            if (!jawaban.equalsIgnoreCase("Y")) {
                inputLagi = false;
            }
            
            

            
        }
    }
    
}
