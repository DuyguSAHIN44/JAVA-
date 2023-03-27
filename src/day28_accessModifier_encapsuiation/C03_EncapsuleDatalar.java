package day28_accessModifier_encapsuiation;

public class C03_EncapsuleDatalar {




    static private String isim= "Yıldız Pazarlama" ;
    private int satışTutarı; // hiç kimse ulaşamaz çünkü private

    public int getToplamSatış() {
        return toplamSatış;
    }

    private int toplamSatış;

    public int a;

     public static String getIsim() {
          return isim;
     }// İsim bilgisini görebilsinler ama değiştiremesinler

     public void setSatışTutarı(int satışTutarı) {
          this.satışTutarı = satışTutarı;
          toplamSatış += satışTutarı;
     }
}
