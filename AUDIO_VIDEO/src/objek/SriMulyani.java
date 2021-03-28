package objek;

public class SriMulyani extends WNI implements Mentri{
    public void getNama (){
        this.nama = "Sri Mulyani";
    }
    public void getJabatan (){
        this.jabatan = "Mentri";
    }

    @Override
    public void getNamaKementrian(){
        System.out.println(this.nama + " adalah " + this.jabatan + " Keuangan Negara Republik Indonesia ");
    }
}

