import java.util.*;
public class Taxi
{
    private String NamaPenumpang,NamaDriver,tanggal;
    private int JarakTempuh,Biaya;
    
    public void setTaxi(String passenger, String driver, String date, int distance){
        NamaPenumpang = passenger;
        NamaDriver = driver;
        tanggal = date;
        JarakTempuh = distance;
        
        if (JarakTempuh == 0){
            Biaya = 5000;
        }else if(JarakTempuh>0 & JarakTempuh<10){
            int Jarak = JarakTempuh * 3500;
            Biaya = Jarak;
        }else if(JarakTempuh == 10){
            Biaya = 35000;
        }else if(JarakTempuh>10 & JarakTempuh<20){
            int Jarak = JarakTempuh - 10;
            int biayaSementara = Jarak * 2500;
            Biaya = 35000 + biayaSementara;
        }else if(JarakTempuh == 20){
            Biaya = 60000;
        }else if(JarakTempuh>20){
            int Jarak = JarakTempuh - 20;
            int biayaSementara = Jarak * 2000;
            Biaya = 60000 + biayaSementara;
        }
    }
    
    public String Tampil(){
        String Harga = String.valueOf(Biaya);
        return ("Nama Penumpang = "+NamaPenumpang+"\nNama Driver = "+NamaDriver+"\nTanggal = "+tanggal+"\nDengan Jarak Tempuh = "+JarakTempuh+"\nTotal Biaya = "+Biaya);
    }
    
    public static void mainKucing(){
        Kucing kucing = new Kucing();
        Scanner input = new Scanner(System.in);
        Date date = new Date();
        int tahunSekarang = 1900+date.getYear();
        
        System.out.println("Masukkan nama kucing : ");
        String nama_kucing = input.nextLine();
        System.out.println("Masukkan Tanggal lahir : ");
        int tanggal_lahir = input.nextInt();
        System.out.println("Masukkan Bulan lahir : ");
        int bulan_lahir = input.nextInt();
        System.out.println("Masukkan Tahun lahir : ");
        int tahun_lahir = input.nextInt();
        
        if(tanggal_lahir>31|tanggal_lahir<=0){
            System.out.println("Tanggal hanya tersedia dari 1 s/d 30");
        }else if(bulan_lahir>13|bulan_lahir<=0){
            System.out.println("Bulan hanya tersedia dari 1s/d 12");
        }else if(tahun_lahir>tahunSekarang){
            System.out.println("Tidak ada ceritanya tahun kelahiran lebih dulu dari tahun sekarang");
        }else{
            kucing.setKucing(nama_kucing,tanggal_lahir,bulan_lahir,tahun_lahir);
        }
        
        int Umur = kucing.HitungUsia();
        
        if(Umur == 0){
            System.out.println("Usia kucing kurang dari 1 tahun");
        }else{
            System.out.println("Umur kucing sekarang adalah : "+Umur);
        }
    }
}
