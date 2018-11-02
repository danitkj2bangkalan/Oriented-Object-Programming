import java.util.*;
public class Rekening
{
    private String Nama;
    private int Saldo;
    private boolean Blokir = false;
    
    public String tambahRekening(int jumlah){
        if (Blokir == true){
            return "Maaf Rekening anda terblokir";
        }else{
            hitungBunga();
            Saldo += jumlah;
        }
        return"Anda bisa menambah rekening";
    }
    public String ambilRekening(int jumlah){
        if (Blokir == true){
            return "Maaf Rekening anda terblokir";
        }else{
            Saldo = Saldo - jumlah;
        }
        return "Anda bisa melakukan tarik tunai rekening";
    }
    public void hitungBunga(){
        int percent = Saldo/100; 
        Saldo = Saldo + percent;
    }
    public void hitungBiayaAdmin(){
        Saldo = Saldo - 5000;
    }
    public void cekSaldo(String nama){
        Nama = nama;
        System.out.println("Nama : "+Nama);
        System.out.println("Saldo : "+Saldo);
    }
    public void transfer(int jumlah,Rekening a){
        ambilRekening(jumlah);
        hitungBiayaAdmin();
        a.tambahRekening(jumlah);
    }
}
