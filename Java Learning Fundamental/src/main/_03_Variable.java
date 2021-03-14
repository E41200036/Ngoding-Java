/*
VARIABEL
--------
Variable merupakan wadah untuk menampung nilai tertentu.
Di java, ada beberapa nilai yang bisa digunakan. Contoh :
1.   String- menyimpan teks, seperti "Halo". Nilai string diapit oleh tanda kutip ganda
2.   int - menyimpan bilangan bulat (bilangan bulat), tanpa desimal, seperti 123 atau -123
3.   float - menyimpan angka floating point, dengan desimal, seperti 19,99 atau -19,99
4.   char- menyimpan karakter tunggal, seperti 'a' atau 'B'. Nilai karakter diapit oleh tanda kutip tunggal
5.   boolean - menyimpan nilai dengan dua status: benar atau salah

DEKLARASI VARIABEL
------------------
type_data namaVariabel = nilai;
ex : 
int kelas = 12;

atau

type_data namaVariabel;
namaVariabel = nilai;


 */
package main;

public class _03_Variable {
    public static void main(String[] args) {
        
        // integer
        int kelas = 12;
        // string
        String nama = "ibnu";
        // float
        float ipK = 3.95f;
        // char
        char huruf = 'A';
        // boolean
        boolean jawaban = true;
        
        System.out.println(kelas);
        System.out.println(nama);
        System.out.println(ipK);
        System.out.println(huruf);
        System.out.println(jawaban);
        
        
        
        /* 
        FINAL KEYWORD
        -------------
        keyword [final] akan membuat variabel atau sebuah fungsi menjadi final atau konstan [tidak bisa diubah]
        ex :
        final phi = 3.14;
        phi = 3.5; // ini akan menimbulkan error
        */
        
        final float phi = 3.14f;
        // phi = 3.5f;
        System.out.println(phi);
        
        
        /*
        DISPLAY VARIABEL
        ----------------
        cara menampilkan nilai variabel sebagai output yaitu langsung menuliskannya dalam method [println]
        ex : 
        int kelas = 12;
        System.out.println(kelas)
        
        untuk menyambung variabel dengan output yang lain pakailah tanda [+]
        ex : 
        String nama = "Ibnu";
        System.out.println("Nama saya: " + nama);

        */
        
        
        int x = 12;
        System.out.println(x);
        
        String kota = "Probolinggo";
        System.out.println("Saya lahir di kota " + kota);
        
        /*
        tapi untuk nilai number / numerik tanda [+] akan menjumlahkannya
        ex : 
        int x = 3;
        int y = 2;
        System.out.println(x + y) // 5
        */
        
        int i = 3;
        int j = 2;
        System.out.println(i + j); // 5
        
        /*
        Aturan umum untuk membangun nama untuk variabel (pengenal unik) adalah:

        Nama dapat berisi huruf, angka, garis bawah, dan tanda dolar
        Nama harus dimulai dengan huruf
        Nama harus dimulai dengan huruf kecil dan tidak boleh berisi spasi
        Nama juga bisa dimulai dengan $ dan _ (tapi kami tidak akan menggunakannya dalam tutorial ini)
        Nama peka huruf besar / kecil ("myVar" dan "myvar" adalah variabel yang berbeda)
        Kata yang dicadangkan (seperti kata kunci Java, seperti intatau boolean) tidak dapat digunakan sebagai nama

        */
        
    }
}
