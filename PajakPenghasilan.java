import java.util.*;
public class PajakPenghasilan
{
     final static int a = 500000;
     final static int b = 700000;
     final static int c = 900000;
     final static int d = 1100000;
     final static int e = 700000;
     final static int f = 900000;
     final static int g = 1100000;
     final static int h = 1300000;
     
     int ptkp;
     int nilaipajak;
     
     public void Hitung(){
         Scanner input = new Scanner(System.in);
         System.out.println("Masukkan nama anda : ");
         String Nama = input.nextLine();
         System.out.println("Menikah atau belum ? (y/n)");
         String status = input.nextLine();
         status.toLowerCase();
         
         System.out.println("Gaji kotor perbulan");
         int gaji = input.nextInt();
         System.out.println("Durasi kerja (1/sd 12 bulan)");
         int berapabulan = input.nextInt();
         System.out.println("Memiliki berapa tanggungan ? ");
         int tanggungan = input.nextInt();
         
         if ((status.equals("n"))&(tanggungan == 0)){
             this.ptkp = a;
         }else if ((status.equals("n"))&(tanggungan == 1)){
             this.ptkp = b;
         }else if((status.equals("n"))&(tanggungan == 2)){
             this.ptkp = c;
         }else if ((status.equals("n"))&(tanggungan == 3)){
             this.ptkp = d;
         }else if((status.equals("y"))&(tanggungan == 0)){
             this.ptkp = e;
         }else if((status.equals("y"))&(tanggungan == 1)){
             this.ptkp = f;
         }else if((status.equals("y"))&(tanggungan == 2)){
             this.ptkp = g;
         }else if((status.equals("y"))&(tanggungan == 3)){
             this.ptkp = h;
         }
         
         int bruto = gaji * berapabulan;
         int netto = bruto - this.ptkp;
         
         if(netto <= 0 ){
            netto = 0;
         }else if((netto >= 500000)&(netto < 1000000)){
             netto = 5 * (netto/100);
         }else if((netto >=1000000)&(netto <= 5000000)){
             netto = (5 * 10000) + ((netto - 1000000)*10/100);
         }else if(netto > 5000000){
             netto = 50000+400000+(netto-5000000)*20/100;
         }
         
         System.out.println("Nama : "+Nama+"\nNilai Pajak Anda : "+netto);
     }
     public static void main(){
         PajakPenghasilan a = new PajakPenghasilan();
         a.Hitung();
     }
}
