import java.util.*;
public class Simulasikan
{
    public static void Simulasi(){
       Rekening a= new Rekening();
       Rekening b = new Rekening();
       Rekening c = new Rekening();
       
       a.tambahRekening(50000);
       b.tambahRekening(40000);
       c.tambahRekening(30000);
       
       a.transfer(10000,b);
       a.hitungBunga();
       a.cekSaldo("Kelvin");
       b.cekSaldo("Xavier");
       c.cekSaldo("Gorge");
    }
}
