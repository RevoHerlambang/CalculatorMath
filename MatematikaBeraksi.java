public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika matematika = new Matematika();

        matematika.setTambah(10, 5);
        System.out.println("Tambah: " + matematika.getHasil());  // 15

        matematika.setKurang(10, 5);
        System.out.println("Kurang: " + matematika.getHasil());  // 5

        matematika.setKali(10, 5);
        System.out.println("Kali: " + matematika.getHasil());    // 50

        matematika.setBagi(10, 5);
        System.out.println("Bagi: " + matematika.getHasil());    // 2
    }
}
