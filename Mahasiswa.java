public class Mahasiswa
{
    private int nrp,nohp,usia;
    private String nama,alamat,email;
    
    
    // instance variables - replace the example below with your own
    public Mahasiswa(String name)
    {
        nama = name;
    }
    public Mahasiswa(int nim)
    {
        // initialise instance variables
        nrp = nim;
    }
    public Mahasiswa(String name,int nim)
    {
        // initialise instance variables
        nama = name;
        nrp = nim;
    }
    public Mahasiswa(String name,int nim,int age)
    {
        // initialise instance variables
        nama = name;
        nrp = nim;
        usia = age;
    }
    public Mahasiswa(String name,int nim,int age,String address)
    {
        // initialise instance variables
        alamat = address;
        nama = name;
        nrp = nim;
        usia = age;
    }
    public Mahasiswa(String name,int nim,int age,String address,int phonenumber)
    {
        // initialise instance variables
        alamat = address;
        nama = name;
        nrp = nim;
        usia = age;
        nohp = phonenumber;
    }
    public Mahasiswa(String name,int nim,int age,String address,int phonenumber,String surel)
    {
        // initialise instance variables
        alamat = address;
        nama = name;
        nrp = nim;
        usia = age;
        nohp = phonenumber;
        email = surel;
    }
    public static void main(){
    
    }
    
}
