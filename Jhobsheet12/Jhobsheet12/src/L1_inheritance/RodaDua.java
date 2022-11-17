package L1_inheritance;
// Created by 21343015_Siptya Savira Rahmi
public class RodaDua extends kendaraan {
    double NaikHargake=0.20;
    void hargaAkhir(){
        hargaDasar=hargaDasar+(hargaDasar*NaikHargake);
        System.out.println("setelah di modifikasi harga sepeda menjadi Rp. "+hargaDasar);
    }
}
