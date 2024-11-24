public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();

        mtk.setTambah(5, 3);
        System.out.println("Tambah: " + mtk.getHasil());
        
        mtk.setKali(5, 3);
        System.out.println("Kali: " + mtk.getHasil());

        mtk.setModulus(5, 3);
        System.out.println("Modulus: " + mtk.getHasil());
    }
}
