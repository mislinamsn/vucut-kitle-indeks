import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double metre,kilogram ;
        int İndeks;
        Scanner input= new Scanner(System.in);
        System.out.println("boyunuzu metre olarak giriniz:");
        metre=input.nextInt();
        metre=metre/100.0 ;//cm ye çevir
        System.out.println("Kilonuzu kilogram olarak giriniz:");
        kilogram=input.nextInt();
        double indeks = (kilogram)/(metre*metre);
        System.out.println("Vucut kitle indeksiniz:"+indeks);

    }
}