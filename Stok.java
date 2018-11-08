import java.text.*;
import java.util.*;
public class Stok
{
    int Stok;
    boolean state = true;
    public String barang_masuk(int jumlahBarang,String tanggalMasuk){
        String Batas_warning_stok = " Stoknya menipis ";
        int Stok = this.Stok;
        Stok += jumlahBarang;
        this.Stok = this.Stok + jumlahBarang;
        return "Stok = "+Stok+"\nTanggal Masuk : "+tanggalMasuk;
    }
    public String barang_keluar(int jumlahBarang){
        Date tanggal = new Date();
        DateFormat formatTanggal = new SimpleDateFormat ("dd-MM-yyyy");
        String sekarang = formatTanggal.format(tanggal);
        String Batas_warning_stok = " Stoknya menipis";
        int Stok = this.Stok -  jumlahBarang;
        this.Stok = this.Stok - jumlahBarang;
        if (this.Stok > 0 & this.Stok < 20 ){
            System.out.println("Stok menipis");
        }else if(this.Stok <=0){
            this.Stok = 0;
            Stok = 0;
            System.out.println("Barang tidak bisa keluar");
        }
        return "Stok = "+Stok+"\nTanggal Keluar : "+sekarang;
    }
    void Tampil(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kode Barang");
        String kodeBarang = input.nextLine();
        System.out.println("Masukkan Nama Barang");
        String namaBarang = input.nextLine();
        System.out.println("Kode Barang : "+kodeBarang);
        System.out.println("Nama Barang : "+namaBarang);
        while(this.state){
            System.out.println("Apakah anda ingin mengecek barang (y/n)");
            String choice = input.nextLine();
            choice.toLowerCase();
            if(choice.equals("y")){
                System.out.println("Masukkan pilihan anda :\n1.Transaksi Barang Masuk \n2.Transaksi Barang Keluar ");
                int pilihan = input.nextInt();
                System.out.println("Berapa jumlahnya ? ");
                int jumlah = input.nextInt();
                if(pilihan == 1){
                    System.out.println("Masukkan tanggal masuk");
                    String tanggal = input.nextLine();
                    System.out.println("Jumlah "+barang_masuk(jumlah,tanggal)); 
                }else if(pilihan == 2){
                    System.out.println("Jumlah "+barang_keluar(jumlah));
                }else{
                    System.out.println("Masukkan angka !");
                }
            }
            else if (choice.equals("n")){
                this.state = false;
                System.out.println("Anda tidak memasukkan stok barang");
            }
        }
    }
    public static void Simulasikan(){
        Stok s = new Stok();
        s.Tampil();
    }
}
