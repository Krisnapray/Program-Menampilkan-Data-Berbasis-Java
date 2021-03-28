package objek;

public class JayaNegara extends WNI implements Bupati {
    public void getNama(){
        this.nama = "I Gusti Ngurah Jaya Negara";
    }
    public void getJabatan(){
        this.jabatan = "Bupati";
    }
    @Override
    public void getNamaKabupaten (){
        System.out.println(this.nama + " adalah " + " Bupati/Walikota " + " Kota Denpasar");
    }
}