import java.util.*;
public class Perulangan
{
    int nilaibatasAtas;
    int nilaibatasBawah;
    public void batasAtas(){
        int jumlah = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Soal no 1 \nMasukkan Nilai N : ");
        int N = input.nextInt();
        int increment = N; 
        int array[] = new int[N];
        for (int i = 0; i<N; i++){
            increment = increment - 1;
            int temp = N * increment;
            array[i] = temp;
        }
        
        for(int b : array){
            jumlah = jumlah + b;
        }
        
        this.nilaibatasAtas = jumlah;
        System.out.println(this.nilaibatasAtas);
    }
    
    public void batasBawah(){
        int jumlah = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Soal no 1 \nMasukkan Nilai N : ");
        int a = input.nextInt();
        int N = a-1;
        int increment = N; 
        int array[] = new int[N];
        for (int i = 0; i<N; i++){
            increment = increment - 1;
            int temp = N * increment;
            array[i] = temp;
        }
        
        for(int b : array){
            jumlah = jumlah + b;
        }
        this.nilaibatasBawah = jumlah;
        System.out.println(this.nilaibatasBawah);
    }
    
    public void nomer1(){
        batasAtas();
        batasBawah();
        double result = nilaibatasAtas/nilaibatasBawah;
        System.out.println("Y = "+result);
    }
    
    public void nomer2(){
        int pengali = 3;
        int nilaiAwal = 2; 
        Scanner input =new Scanner(System.in);
        System.out.println("Soal no 2\nMasukkan nilai n : ");
        int N = input.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < N ;i++){
            int temp = pengali * nilaiAwal;
            array[i] = temp;
            nilaiAwal = array[i];
        }
        for (int j = 0; j < N ;j++){
            System.out.println(array[j]);
        }
    }
    
    public void nomer3(){
        int pengali = 3;
        int nilaiAwal = 2; 
        int rata_rata = 0;
        float nilai_tengah  = 0;
        Scanner input =new Scanner(System.in);
        System.out.println("Soal No 3\nMasukkan nilai n : ");
        int N = input.nextInt();
        int pointer_nilai_tengah = N/2;
        int array[] = new int[N];
        for (int i = 0; i < N ;i++){
            int temp = pengali * nilaiAwal;
            array[i] = temp;
            nilaiAwal = array[i];
        }
        for(int b : array){
            rata_rata = rata_rata + b;
        }
        System.out.println("Rata rata = "+rata_rata);
        if (array.length%2 == 0){
            int temp1 = array[pointer_nilai_tengah];
            int temp2 = array[pointer_nilai_tengah-1];
            nilai_tengah = (temp1+temp2)/2;
        }else{
            int temp = (N-1)/2;
            nilai_tengah = array[temp];
        }
        System.out.println("Nilai tengah = "+nilai_tengah);
    }
    public static void main(){
        Perulangan test = new Perulangan();
        test.nomer1();
        test.nomer2();
        test.nomer3();
    }
}
