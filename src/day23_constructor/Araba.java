package day23_constructor;

public class Araba {


        int yıl;
        String marka="Marka belirtilmemiş";
        String model="Model belirtilmemiş";
        boolean hasarlıMı;
        int fiyat;

        @Override
        public String toString() {
                return "Araba Bilgileri:" +
                        "yıl=" + yıl +
                        ", marka='" + marka + '\'' +
                        ", model='" + model + '\'' +
                        ", hasarlıMı=" + hasarlıMı +
                        ", fiyat=" + fiyat +
                        '}';
        }

        public Araba(int yıl, String marka, String model, boolean hasarlıMı, int fiyat){

                /*
                Eğer parametre ismi instance variable ismi ile AYNI DEĞİLSE
                bir alttaki constructor da olduğu gibi
                direkt atama yapabiliriz.

                Ancak projenin daha anlaşılır olması ve doğru variable nin
                kullanılması için constructor daki parametre isimleri,
                instance variable isimleri ile aynı seçilir.

                Bu durumda java ya aynı isimdeki iki variable den hangisinin
                BU CLASSdaki instance variable olduğunu belirtmesi gerekir.

                 Bunun için java syntax olarak this. yazılmasını istemiştir.

                 This. yazmazsak java en kısa şekilde ulaşabşleceği variableyi bulur.

  */

                this.yıl=yıl;
               this.marka=marka;
                this.model=model;
                this.hasarlıMı=hasarlıMı;
                this.fiyat=fiyat;

        }




        public Araba(int fyt, String mrk) { //  PARAMETRE AYNI DEĞİL

                fiyat = fyt;
                marka = mrk;
        }

                public Araba(){





        }


        public void yakıtTüketimi(String yakıtTürü) {

                switch (yakıtTürü) {

                        case "Benzin":
                                System.out.println("Benzinli araçlar için yakıt tüketimi: 6 l/100 km");
                                break;
                        case "Dizel":
                                System.out.println("Dizel araçlar için yakıt tüketimi: 5 l/100 km");
                                break;
                        case "Elektrik" :
                                System.out.println("Elektrikli araçlar için yakıt tüketimi: 5 kw/100 km");
                                break;
                                default:
                                        System.out.println("Geçersiz yakıt türü");
                        }


                }



}

