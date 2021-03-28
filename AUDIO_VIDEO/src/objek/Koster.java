package objek;

public class Koster extends WNI implements Gubernur{
    public void getNama(){
        this.nama = "Dr. Ir. I Wayan Koster, M.M.";
    }
    public void getJabatan(){
        this.jabatan = "Gubernur";
    }
    @Override
    public void getNamaProvinsi(){
        System.out.println(this.nama + " adalah " + this.jabatan + " Bali");
    }
}
