package day34_abstractClasses_interfaces;

import java.util.ArrayList;
import java.util.List;

public class FTatlıSuBalıkları extends EBalık{
    @Override
    public void beslenme() {

    }

    @Override
    public void cogalma() {

    }

    @Override
    public void ömür() {

    }

    @Override
    public void yüzgeç() {

    }

    @Override
    public void yaşamAlanı() {

    }

    @Override
    public void iskeletYapısı() {

    }

    public static void main(String[] args) {

            FTatlıSuBalıkları sazan=new FTatlıSuBalıkları();
            EBalık alabalık=new FTatlıSuBalıkları();

            AHayvan yayın=new FTatlıSuBalıkları();
            /*
            Abst. classların const. ları vardır
            Ama obje oluşturulamaz

            Abst. classlar data türü seçilip concreta child classların cons.
            kullanılarak abst.parent class özelliklerinde
             objeler oluşturulabilir.

             */
        List<String> liste=new ArrayList<>();


        }
    }

