import java.util.Scanner;
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
            Biaya = 5000 + Jarak;
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
        
        System.out.println("Masukkan nama kucing : ");
        String nama_kucing = input.nextLine();
        System.out.println("Masukkan Tanggal lahir : ");
        int tanggal_lahir = input.nextInt();
        System.out.println("Masukkan Bulan lahir : ");
        int bulan_lahir = input.nextInt();
        System.out.println("Masukkan Tahun lahir : ");
        int tahun_lahir = input.nextInt();
        
        kucing.setKucing(nama_kucing,tanggal_lahir,bulan_lahir,tahun_lahir);
        System.out.println(kucing.HitungUsia());
    }
}
