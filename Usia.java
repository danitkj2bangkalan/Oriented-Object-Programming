import java.util.*;
import java.text.*;
class Usia
{
    public static void hitung_Usia(int H,int B,int T){
        Scanner input = new Scanner(System.in);
        Date date = new Date();
        int tahun = 1900+date.getYear();
        int hari = 11+date.getDay();
        int bulan = 1+date.getMonth();
        
        int harilahir = hari-H;
        int bulanlahir = bulan-B;
        int tahunlahir = tahun-T;
        
        System.out.println("Masukkan Nama Anda : ");
        String Nama = input.nextLine();
        
        System.out.println(Nama+" Usia Anda : \n"+tahunlahir+" tahun\n"+bulan+" bulan\n"+hari+" hari");
        //String tahunSekarang = int.toString(tahun);
        //System.out.println("hari"+hari+"bulan"+bulan+"tahun"+tahun);
    }
    public static void main(){
        
        Usia.hitung_Usia(12,12,1999);
    }
}
