package String;

public class OperasiString {
    public static void main(String[] args) {
        String kota = "Yogyakarta";

        System.out.println(kota);

        char [] uniskachar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskachar);
        System.out.println(uniskaString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5));
        System.out.println(kota.substring(0,4));
    }
}
