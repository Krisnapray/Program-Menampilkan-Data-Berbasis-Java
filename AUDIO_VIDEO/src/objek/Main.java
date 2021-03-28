package objek;

public class Main {

    public static void main(String[] args) {
        Jokowi J = new Jokowi();
        Amin A = new Amin();
        SriMulyani S = new SriMulyani();
        NadimMakarim N = new NadimMakarim();
        ErickToher E = new ErickToher();
        Koster K = new Koster();
        JayaNegara JN = new JayaNegara();
        J.getNama();
        J.getJabatan();
        J.getNamaNegara();
        System.out.println("");
        A.getNama();
        A.getJabatan();
        A.getNamaBangsa();
        System.out.println("");
        S.getNama();
        S.getJabatan();
        S.getNamaKementrian();
        System.out.println();
        N.getNama();
        N.getJabatan();
        N.getNamaKementrian();
        N.getNamaUsaha();
        System.out.println();
        E.getNama();
        E.getJabatan();
        E.getNamaKementrian();
        E.getNamaUsaha();
        System.out.println();
        K.getNama();
        K.getJabatan();
        K.getNamaProvinsi();
        System.out.println();
        JN.getNama();
        JN.getJabatan();
        JN.getNamaKabupaten();
    }
}
