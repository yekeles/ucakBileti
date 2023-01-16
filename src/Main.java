import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, yon;
        double total, nettotal, sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğin yol kaç km : ");
        km = input.nextInt();
        System.out.print("Yolcunun yaşını giriniz :");
        yas = input.nextInt();
        System.out.print("Tek yön ise 1, gidiş dönüş ise 2 yazınız : ");
        yon = input.nextInt();
        total = (km * 0.1);

        if (((km > 0) && (yas > 0)) && ((yon == 1) || (yon == 2))) {
            if (yon == 1) {
                System.out.println("Tek yönlü uçuşlarda indirim uygulanmaz ...");
                nettotal = (total * 1);
                if (yas < 12) {
                    sonuc = (nettotal * 0.5);
                    System.out.print("Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır : " + sonuc + " TL ");
                } else if ((yas >= 12) && (yas < 24)) {
                    sonuc = (nettotal * 0.9);
                    System.out.println("Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır : " + sonuc + " TL ");
                } else if (yas > 65) {
                    sonuc = (nettotal * 0.7);
                    System.out.println("Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır : " + sonuc + " TL ");
                } else if ((yas >= 24) && (yas <= 65)) {
                    sonuc = (nettotal * 1);
                    System.out.println("24-65 yaş arası sadece gidiş dönüş indirimi uygulanır : " + sonuc + " TL ");
                }
            } else if (yon == 2) {
                System.out.println("Gidiş Dönüş uçuşlarında %20 indirim uygulanır ... ");
                nettotal = (total * 0.8);
                if (yas < 12) {
                    sonuc = (nettotal * 0.5);
                    System.out.print("Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır : " + sonuc + " TL ");
                } else if ((yas >= 12) && (yas < 24)) {
                    sonuc = (nettotal * 0.9);
                    System.out.println("Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır : " + sonuc + " TL ");
                } else if (yas > 65) {
                    sonuc = (nettotal * 0.7);
                    System.out.println("Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır : " + sonuc + " TL ");
                } else if ((yas >= 24) && (yas <= 65)) {
                    sonuc = (nettotal * 1);
                    System.out.println("24-65 yaş arası sadece gidiş dönüş indirimi uygulanır : " + sonuc + " TL ");
                }
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz!.");
        }
        System.out.println("İyi Uçuşlar !...");
    }
}