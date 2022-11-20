package JavaCase;

import java.util.Scanner;

public class Store {
    Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("""
                    1 - Notebook İşlemleri
                    2 - Cep Telefonu İşlemleri
                    3 - Marka Listele
                    4 - Çıkış Yap""".indent(1));

            System.out.print("Yapmak istediğiniz işlem numarasını seçiniz : ");

            switch (scanner.nextInt()) {
                case 1 -> {
                    Notebook notebook = new Notebook();
                    notebook.menu();
                }
                case 2 -> {
                    MobilePhone mobilePhone = new MobilePhone();
                    mobilePhone.menu();
                }

                case 3 -> Brand.printBrands();
                case 4 -> {
                    System.out.println("Çıkış yapılıyor.");
                    System.exit(0);
                }
                default -> System.out.println("Yanlış değer girdiniz.");
            }
        }
    }
}
