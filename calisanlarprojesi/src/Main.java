import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("çalışanlar programına hoşgeldiniz....");
        String islemler="işlemler....\n" +
                "1.yazılımcı işlemleri\n" +
                "2. yönetici işlemleri\n" +
                "çıkış için q'ya basın";
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");
        while(true){
            System.out.println("işlemi şeçiniz....");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("programndan çıkılıyor.......");
                break;
            }
            else if(islem.equals("1")){
                Yazilimci yazilimci=new Yazilimci("Mehmet Ali","ERDOĞAN",452,"c,java,python");
                String yazilimci_islem="1.format at\n" +
                        "2.Bilgleri göster\n" +
                        "çıkıs için q'ya basın";
                System.out.println(yazilimci_islem);
                while (true){
                    System.out.println("işlemi şeçiniz:");
                    String y_islem= scanner.nextLine();
                    if(y_islem.equals("q")){
                        System.out.println("yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.println("işletim sistemi");
                        String isletim_sistemi= scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz yazılımıc işlemi.....");
                    }
                }
            }
            else if(islem.equals("2")){
                Yonetici yonetici=new Yonetici("ömer yiğit","taşbası",132,10);
                String yonetici_islem="yönetici işlemler\n" +
                        "1.zam yap\n" +
                        "2. bilgileri göster\n" +
                        "çıkıs için q'a basın";
                System.out.println(yonetici_islem);
                while(true){
                    System.out.println("işlemi şeçiniz:");
                    String y_islem = scanner.nextLine();
                    if(y_islem.equals("q")){
                        System.out.println("yönetici işlemlerinden çıkılıyor....");
                    }
                    else if (y_islem.equals("1")) {
                        System.out.println("yöneticinin ne kadar zam yapması istiyorusnuz?");
                        int zamMiktarı=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktarı);
                    }
                    else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("geçersiz yönetici işlemi...");
                    }
                }

            }
            else{
                System.out.println("geçersiz işlemmm");
            }
        }
    }
}