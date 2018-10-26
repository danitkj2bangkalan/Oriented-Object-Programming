import java.util.Scanner;
public class Kucing
{
   private String nama;
   private int tanggal,bulan,tahun;
   
   public void setKucing(String name, int d, int m, int y){
       nama = name;
       tanggal = d;
       bulan = m;
       tahun = y;
   }
   
   public int HitungUsia(){
       int tahunSekarang = 2018;
       int umur = tahunSekarang - tahun;
       return umur;
    }
    // main program untuk taxi
   public static void mainTaxi(){
       Scanner input = new Scanner(System.in);
       Taxi a = new Taxi();
       
       System.out.println("Masukkan Nama Penumpang : ");
       String nama_penumpang = input.nextLine();
       System.out.println("Masukkan Nama Supir : ");
       String nama_supir = input.nextLine();
       System.out.println("Masukkan Tanggal : ");
       String tanggal = input.nextLine();
       System.out.println("Berapa Jarak Tempuhnya : ");
       int jarak = input.nextInt();
       
       a.setTaxi(nama_penumpang,nama_supir,tanggal,jarak);
       System.out.println(a.Tampil());
    }
}
