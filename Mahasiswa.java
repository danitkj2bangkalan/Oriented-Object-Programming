public class Mahasiswa
{
   private String nama,alamat,email;
   int nrp,usia,nohp;
   
   public String getNama(){
       return nama;
    }
   public String getAlamat(){
       return alamat;
    }
   public String getEmail(){
       return email;
    }
   public int getNrp(){
       return nrp; 
    }
   public int getUsia(){
       return usia; 
    }
   public int getNohp(){
       return nohp; 
    }
    
   public Mahasiswa(String name){
       nama = name;
   }
   public Mahasiswa(String name,int nim){
       nama = name;
       nrp = nim;
   }
   public Mahasiswa(String name,int nim,int age){
       nama = name;
       nrp = nim;
       usia = age;
   }
   public Mahasiswa(String name,int nim,int age,String address){
       nama = name;
       nrp = nim;
       usia = age;
       alamat = address;
   }
   public Mahasiswa(String name,int nim,int age,String address,int phonenumber){
       nama = name;
       nrp = nim;
       usia = age;
       alamat = address;
       nohp = phonenumber;
   }
   public Mahasiswa(String name,int nim,int age,String address,int phonenumber,String surel){
       nama = name;
       nrp = nim;
       usia = age;
       alamat = address;
       nohp = phonenumber;
       email = surel;
   }
   
   public static void main(){
       Mahasiswa a = new Mahasiswa("Brant",1709875643,18,"Boston",0111123,"brantL12@yahoo.com");
       Mahasiswa b = new Mahasiswa("Sye",1709875633,19,"Cambrige",0111124,"sye@yahoo.com");
       System.out.println("Nama : "+a.getNama()+"\nNim : "+a.getNrp()+"\nAlamat : "+a.getAlamat()+"\nNomer Hp : "+a.getNohp()+"\nEmail : "+a.getEmail());
       System.out.println("Nama : "+b.getNama()+"\nNim : "+b.getNrp()+"\nAlamat : "+b.getAlamat()+"\nNomer Hp : "+b.getNohp()+"\nEmail : "+b.getEmail());
   }
}
