package objek;

public class ErickToher extends WNI implements Mentri, Pengusaha{
    public void getNama(){
        this.nama="Erick Thohir, B.A., M.B.A.";
    }
    public void getJabatan(){
        this.jabatan="Mentri";
    }
    @Override
    public void getNamaKementrian(){
        System.out.println(this.nama + " adalah " + this.jabatan + " Badan Usaha Milik Negara " + " Republik Indonesia");
    }
    @Override
    public void getNamaUsaha(){
        System.out.println(this.nama + " juga adalah " + " seorang pengusaha yang bergerak dibidang bisnis media dan entertainment ");
    }
}
