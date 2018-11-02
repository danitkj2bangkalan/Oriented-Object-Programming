import java.util.*;
public class Stok
{
    int Stok;
    public int barang_masuk(int jumlahBarang){
        int Stok = this.Stok;
        Stok += jumlahBarang;
        this.Stok = this.Stok + jumlahBarang;
        return Stok;
    }
    public int barang_keluar(int jumlahBarang){
        int jumlah_stok = this.Stok -  jumlahBarang;
        return jumlah_stok;
    }
    void Tampil(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kode Barang");
        String kodeBarang = input.nextLine();
        System.out.println("Masukkan Nama Barang");
        String namaBarang = input.nextLine();
        System.out.println("Kode Barang : "+kodeBarang);
        System.out.println("Nama Barang : "+namaBarang);
        boolean state = true;
        while(state){
            System.out.println("Apakah anda ingin mengecek barang (y/n)");
            String choice = input.nextLine();
            choice.toLowerCase();
            if(choice.equals("y")){
                System.out.println("Masukkan pilihan anda :\n1.Barang Masuk \n2.Barang Keluar ");
                int pilihan = input.nextInt();
                System.out.println("Berapa jumlahnya ? ");
                int jumlah = input.nextInt();
                if(pilihan == 1){
                    System.out.println("Jumlah Stok = "+barang_masuk(jumlah)); 
                }else if(pilihan == 2){
                    System.out.println("Jumlah Stok = "+barang_keluar(jumlah));
                }else{
                    System.out.println("Masukkan angka !");
                }
            }
            else if (choice.equals("n")){
                state = false;
                System.out.println("Anda tidak memasukkan stok barang");
            }
        }
    }
    public static void Simulasikan(){
        Stok s = new Stok();
        s.Tampil();
    }
}
