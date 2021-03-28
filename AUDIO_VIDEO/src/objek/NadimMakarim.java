package objek;

public class NadimMakarim extends WNI implements Mentri,Pengusaha{
    public void getNama(){
        this.nama= "Nadiem Anwar Makarim, B.A., M.B.A.";
    }
    public void getJabatan(){
        this.jabatan = "Mentri";
    }
    @Override
    public void getNamaKementrian(){
        System.out.println(this.nama + " adalah " + this.jabatan + " Pendidikan dan Kebudayaan Negara " +
                "Republik Indonesia");
    }
    @Override
    public void getNamaUsaha(){
        System.out.println(this.nama + " juga" +  " adalah seorang CEO GOJEK");
    }
}
