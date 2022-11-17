package L6_encapsulation;
// Created by 21343015_Siptya Savira Rahmi
public class BuahUtama {
    public static void main(String[] args) {
        encapsulationBuah apel = new encapsulationBuah("apel", "Rp.3000", "merah");
    System.out.println("nama buah : "+apel.getName()+"\nHarga : "+apel.getprice()+"\nWarna: "+apel.getColor());
    apel.setColor("hijau");
    apel.setPrice("Rp.7000");
    System.out.println("\n Informasi terkait apel setelah diupdate ");
    System.out.println("nama buah : "+apel.getName()+"\nHarga : "+apel.getprice()+"\nWarna: "+apel.getColor());

    }
}
