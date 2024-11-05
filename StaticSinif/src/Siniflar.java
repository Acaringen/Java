 class DisSinif {
    static class IcSinif { // Static iç sınıf
        public void yazdir() {
            System.out.println("Static iç sınıftayım.");
        }
    }

    class NormalIcSinif { // Non-static iç sınıf
        public void yazdir() {
            System.out.println("Normal iç sınıftayım.");
        }
    }
}

public class Siniflar {
    public static void main(String[] args) {
        // Static iç sınıfa doğrudan sınıf adı üzerinden erişim
        DisSinif.IcSinif icSinif = new DisSinif.IcSinif();
        icSinif.yazdir(); // Çıktı: Static iç sınıftayım.

        // Non-static iç sınıfa erişim için dış sınıfın bir örneğine (nesnesine) ihtiyaç var deneme
        DisSinif disSinif = new DisSinif();
        DisSinif.NormalIcSinif normalIcSinif = disSinif.new NormalIcSinif();
        normalIcSinif.yazdir(); // Çıktı: Normal iç sınıftayım.
    }
}