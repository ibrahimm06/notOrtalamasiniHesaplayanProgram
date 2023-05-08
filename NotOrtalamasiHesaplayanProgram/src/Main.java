import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     //Not ortalamsı programı için gerekli elementler::
     //1)Degişkenler oluştur.
     //2) Kullanıcıdan veri al.
     //3) Veri almak için Scanner input metodu oluştur.
     //4)60 ve üzeri alanlar sınıfı  gecer, altı  alanlar kalır
     //5)Programı oluştur...



        int matamatik ,  fizik,    kimya,  biyoloji,   muzik,  ingilizce;


        Scanner inp= new Scanner(System.in);


        System.out.println("Matematik Notunuzu Giriniz:  ");
        matamatik=inp.nextInt();

        System.out.println("Fizik Notunuzu Giriniz:      ");
        fizik=inp.nextInt();

        System.out.println("Kimya Notunuzu Giriniz:     ");
        kimya=inp.nextInt();

        System.out.println("Biyoloji Notunuzu Giriniz:  ");
        biyoloji=inp.nextInt();

        System.out.println("Muzik Notunuzu Giriniz:     ");
        muzik= inp.nextInt();

        System.out.println("İngilizce Notunuzu Giriniz: ");
        ingilizce= inp.nextInt();


        int toplam =(matamatik + fizik + kimya + biyoloji + muzik + ingilizce);
        double sonuc=toplam/6.0;
        System.out.println("Ortalamanız:" +sonuc);
        System.out.println(sonuc>60? "Sınıfı Geçtiniz":"Sınıfta Kaldınız");

        }
    }