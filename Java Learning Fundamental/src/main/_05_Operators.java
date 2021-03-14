package main;

/*

OPERATOR 
--------
Operator digunakan untuk melakukan operasi pada variabel dan nilai.

Pada contoh di bawah ini, kami menggunakan + operator untuk menjumlahkan dua nilai:

*/
public class _05_Operators {
    public static void main(String[] args) {
        
        int x = 900 + 89;
        System.out.println(x);
        /*
        
        Meskipun +operator sering digunakan untuk menjumlahkan dua nilai, 
        seperti pada contoh di atas, ini juga dapat digunakan untuk menjumlahkan variabel dan nilai, 
        atau variabel dan variabel lain:
        
        */
        
        int a = 12;
        int b = 5;
        int c = a + b;
        System.out.println("hasil " + c);
        
        /*
        OPERATOR ARTIMATIKA
        -------------------
        contoh : 
        +  : penjumlahan
        -  : pengurangan
        /  : pembagian
        %  : sisa hasil bagi
        *  : perkalian
        ++ : increment
        -- : decrement
        */
        
        /*
        OPERATOR PENUGASAN
        ------------------
        Operator    Example	Same As
        =           x = 5	x = 5	
        +=          x += 3	x = x + 3	
        -=          x -= 3	x = x - 3	
        *=          x *= 3	x = x * 3	
        /=          x /= 3	x = x / 3	
        %=          x %= 3	x = x % 3	
        &=          x &= 3	x = x & 3	
        |=          x |= 3	x = x | 3	
        ^=          x ^= 3	x = x ^ 3	
        >>=         x >>= 3	x = x >> 3	
        <<=         x <<= 3	x = x << 3
        
        */
        
        /*
        OPERATOR PERBANDINGAN
        ---------------------
        untuk membandingkan 2 nilai :
        Operator    Name                        Example
        ==          Equal to                    x == y	
        !=          Not equal                   x != y	
        >           Greater than                x > y	
        <           Less than                   x < y	
        >=          Greater than or equal to	x >= y	
        <=          Less than or equal to	x <= y
        */
        
        /*
        
        OPERATOR LOGIKA
        ---------------
        Operator logika digunakan untuk menentukan logika antara variabel atau nilai:
        Operator	Name            Description                                                 Example
        &&              Logical and	Returns true if both statements are true                    x < 5 &&  x < 10	
        ||              Logical or	Returns true if one of the statements is true               x < 5 || x < 4	
        !               Logical not	Reverse the result, returns false if the result is true     !(x < 5 && x < 10)
        
        */
        
    }   
}
