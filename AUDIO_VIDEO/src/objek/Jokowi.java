package objek;

public class Jokowi extends WNI implements Presiden{
    public void getNama (){
        this.nama= "Ir. H. Joko Widodo";
    }
    public void getJabatan (){
        this.jabatan = "Presiden";
    }
    @Override
    public void getNamaNegara (){
        System.out.println(this.nama + " adalah " + this.jabatan +  " ke-7 Negara Republik Indonesia ");
    }
}
