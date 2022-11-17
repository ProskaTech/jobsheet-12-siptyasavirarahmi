package L1_inheritance;
// Created by 21343015_Siptya Savira Rahmi
public class rodaEmpat extends kendaraan{
    double NaikHargake=8;
    void hargaAkhir(){
        hargaDasar=hargaDasar+(hargaDasar+NaikHargake);
        System.out.println("seetlah di modifikasi ,harga mobil menjadi Rp. "+hargaDasar);
    }
}
