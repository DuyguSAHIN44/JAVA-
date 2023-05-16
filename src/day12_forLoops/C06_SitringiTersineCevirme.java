package day12_forLoops;

public class C06_SitringiTersineCevirme {
    public static void main(String[] args) {

        /*
        Soru 10 (interview)- Kullanicidan bir String isteyin
         ve String’i tersine cevirip
       kaydedin.
         */

        String input="Java candır.";

        // output: rıdnac avaJ

        String output="";

        for (int i = input.length()-1; i >= 0; i--) {
            output+=input.charAt(i); //output=output+input.charAt(i);
        }
        System.out.println(output);
    }
}
