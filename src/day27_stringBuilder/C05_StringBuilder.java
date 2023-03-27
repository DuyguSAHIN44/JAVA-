package day27_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java Candır");

        System.out.println(sb1.delete(4, 5)); // JavaCandır

        System.out.println(sb1); // JavaCandır

        System.out.println(sb1.deleteCharAt(9)); // JavaCandı

        System.out.println(sb1); // JavaCandı

        System.out.println(sb1.insert(9, "r")); // JavaCandır

        System.out.println(sb1); // JavaCandır

        sb1.insert(4," ");

        System.out.println(sb1); // Java Candır

        String str=" can bize gelecekmiş";

        sb1.insert(11,str,0,5); // Java Candır can

        System.out.println(sb1);

        sb1.replace(12,15,"Can");

        System.out.println(sb1); // Java Candır Can



    }
}
