
package penjualan;

public class Luar {
    void cetakLuar()
    {
        System.out.println("cetak Luar ...");
        //cetakTengah(); --> error
    }
    class Tengah
    {
        void cetakTengah()
        {
            cetakLuar();
            System.out.println("cetak Tengah...");
            //cetakDalam(); --> error
        }
        class Dalam
        {
            void cetakDalam()
            {
                cetakLuar();
                cetakTengah();
                System.out.println("cetak Dalam....");
            }
        }
    }
    
    public static void main(String[] args) 
    {
        
    }
    
}


//class luar tidak bisa akses dalam/inner
//class dalma/inner bisa akses kelas di luarnya

