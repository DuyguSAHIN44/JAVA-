package day30_inheritance;

public class HChild extends GPrant{
    protected int sayıChild;

    HChild(){
        System.out.println("Chil class cons çalıştı");
    }

    public static void main(String[] args) {
        HChild objChild=new HChild();
        System.out.println(objChild.sayıChild);
        System.out.println(objChild.sayıParent);


        /*
        Child class dan oluşturduğumuz bir obje
        parent ve grandParent class lardaki tüm özelliklere sahip olur.

        Bir obje oluşturulduğunda
        ilk değerleri alabilmek için
        MUTLAKA BİR CONSTRUCTOR çalışmalıdır

        Cons. bizim çok kıll. bir öxelillk değildir.
        Ancak inheritance i tam olarak anlayabilmek için
        cons. call konusunu bilmemiz gerekir

        Bu class dan obje olşturmak için
        HCild cons.
        kullandık ama objemiz parent ve grandparent deki
        özellikleri de sahiplendi

        Peki bu nasıl oldu???

         */
    }

}
