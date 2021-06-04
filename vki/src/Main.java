import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        double boy,kilo,sonuc;
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        boy=scanner.nextDouble();
        System.out.println("\nLütgen kilonuzu giriniz : ");
        kilo=scanner.nextDouble();
        sonuc=kilo/(boy*boy);
        System.out.println("sonucunuz : "+sonuc);
    }
}
