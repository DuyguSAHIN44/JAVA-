package day31_inheritance;

public class FMuhasebe extends EPersonel{

    String sgkNo="Çalışan sgk no belirtilmedi";
    boolean raporluMu;

    public void fazlaMesai(int fazalaMesaiSaati){
        System.out.println(fazalaMesaiSaati*200);

    }
    public void nöbetÜcreti(int nöbetSayısı){
        System.out.println(nöbetSayısı*500);
    }
}
