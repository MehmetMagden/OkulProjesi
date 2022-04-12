import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {


    static List<Kisi> ogrncListesi = new ArrayList<>();
    static List<Kisi> ogrtmListesi = new ArrayList<>();

    static int secim;
    static Scanner scan = new Scanner(System.in);

    static void giris111() {

        System.out.println("lütfen işlem türünü seçiniz. \nögrenci 1 \nogretmen 2");
        secim = scan.nextInt();

        islemler3 ();


    }

    private static void islemler3() {

        System.out.println("lütfen işleminizi seçiniz; \nEkle 1, Listele 2, sil 3 , ara 4, anamenu 5 , çıkıs 6");

        int scm =scan.nextInt();


        switch (scm) {

            case 1:
               eklee();
                islemler3();
                break;

            case 2:
                listele();
                islemler3();
                break;

            case 3:
                sil();
                islemler3();
                break;
            case 4:

                ara();
                islemler3();
                break;

            case 5:
                giris111();
               // islemler3();
                break;
            case 6:
                cikis111();
                islemler3();
                break;

            default:
                System.out.println("Hatali giris");

        }




    }

    private static void cikis111() {

        System.out.println("programı kullandığınız için teşekkür ederiz");
    }

    private static void ara() {
        if (secim == 1) {              //ogrenci
            System.out.println("Aramak istediğiniz kişinin kimlik numarası giriniz");
            String silinecekKimlikNo = scan.next();
            for( Kisi w: ogrncListesi){
                if (w.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)){
                    System.out.println(w);
                    break;
                }else {
                    System.out.println("Bu isimde bir ögrenci yoktur.");
                }
            }





        }else if (secim ==2) {              //ogrenci
            System.out.println("Aramak istediğiniz kişinin kimlik numarası giriniz");
            String silinecekKimlikNo = scan.next();
            for( Kisi w: ogrtmListesi){
                if (w.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)){
                    System.out.println(w);
                    break;                          // yazmazsak bu isimde bir ögretmen yoktur yazıyor
                }else {
                    System.out.println("Bu isimde bir ogretmen yoktur.");
                }
            }







        }



    }

    private static void sil() {
        if (secim == 1) {              //ogrenci
            System.out.println("silmek istediğiniz kişinin kimlik numarası giriniz");
            String silinecekKimlikNo = scan.next();
            for( Kisi w: ogrncListesi){
                if (w.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)){
                    ogrncListesi.remove(w);
                }else {
                    System.out.println("Bu isimde bir ögrenci yoktur.");
                }
            }





        }else if (secim ==2) {              //ogrenci
            System.out.println("silmek istediğiniz kişinin kimlik numarası giriniz");
            String silinecekKimlikNo = scan.next();
            for( Kisi w: ogrtmListesi){
                if (w.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)){
                    ogrtmListesi.remove(w);
                }else {
                    System.out.println("Bu isimde bir ogretmen yoktur.");
                }
            }







        }



    }

    private static void listele() {

        if (secim == 1) {              //ogrenci
            System.out.println(ogrncListesi);
        }else if (secim ==2){           //ogretmen
            System.out.println(ogrtmListesi);
        }
    }

    private static void eklee() {

        if (secim==1) {           //ogrenci

            System.out.println("lütfen isim ve soy isim beraber giriniz");
            scan.next();                                                            //Dummy
            String adSoyad = scan.nextLine();
            System.out.println("lütfen kimlik no giriniz");
            String kimlikNo = scan.next();
            System.out.println("Lütfen yas");
            int yas =scan.nextInt();
            System.out.println("numarası");
            String numara = scan.next();
            System.out.println("sınıfı?");
            String sinif = scan.next();

            Ogrenci mazlumOgrenci = new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
            ogrncListesi.add(mazlumOgrenci);

        }else if (secim==2) {        //ogretmen

            System.out.println("lütfen isim ve soy isim beraber giriniz");
            scan.next();                                                            //Dummy
            String adSoyad = scan.nextLine();
            System.out.println("lütfen kimlik no giriniz");
            String kimlikNo = scan.next();
            System.out.println("Lütfen yas");
            int yas =scan.nextInt();
            System.out.println("ScilNO");
            String ScilNO = scan.next();
            System.out.println("Bolum?");
            String bolum = scan.next();

            Ogretmen mazlumOgretmen = new Ogretmen(adSoyad,kimlikNo,yas,ScilNO,bolum);
            ogrtmListesi.add(mazlumOgretmen);



        }







    }


}
