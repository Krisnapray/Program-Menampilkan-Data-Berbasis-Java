package objek;

public class Amin extends WNI implements WakilPresiden{
    public void getNama (){
        this.nama= "Ma'ruf Amin";
    }
    public void getJabatan (){
        this.jabatan = "Wakil Presiden";
    }
    @Override
    public void getNamaBangsa(){
        System.out.println(this.nama + " adalah " + this.jabatan +  " ke-7 Negara Republik Indonesia ");
    }
}
