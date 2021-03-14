package main;

/*

TIPE DATA
---------
tipe data digunakan untuk memberi tanda pada nilai

*/
public class _04_DataTypes {
    public static void main(String[] args) {
        
        int num = 5; // untuk bilangan bulat
        String name = "Ibnu"; // untuk kata atau kalimat
        char nilai = 'A'; // untuk karakter atau huruf
        boolean status = true; // untuk keputusan [benar] atau [salah]
        float ipK = 4.00f; // untuk bilangan desimal
        
        /*
        
        TIPE DATA PRIMITIF
        ------------------
        Jenis bilangan primitif dibagi menjadi dua kelompok:
        
        1. Jenis bilangan bulat menyimpan bilangan bulat, positif atau negatif (seperti 123 atau -456), 
           tanpa desimal. Jenis yang valid adalah byte, short, int dan long. Jenis mana yang harus Anda gunakan, 
           bergantung pada nilai numerik.

        2. Jenis titik mengambang mewakili angka dengan bagian pecahan, yang berisi satu atau lebih desimal. 
           Ada dua jenis: float dan double.
        
        */
        
        /*
        
        CASTING TIPE DATA
        -----------------
        untuk mengubah tipe data tertentu kita bisa memakai cara
        
        (tipe_data) variabel / nilai
        
        */
        
        double i = 4.35;
        int j = (int) i;
        System.out.println(j);
        
        
    }
}
